//
//  AreaTableViewController.swift
//  Area
//
//  Created by xuhui on 2018/5/23.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit
import CoreData

class AreaTableViewController: UITableViewController,NSFetchedResultsControllerDelegate,UISearchResultsUpdating {
    
    var areas: [AreaMO] = [ ]
    //<AreaMO>是返回结果类型
    var fc: NSFetchedResultsController<AreaMO>!
    //定义搜索器控制器变量
    var sc: UISearchController!
    //定义个一个空数组保存搜索结果
    var searchResult: [AreaMO] = []
    
    //筛选器方法
    func searchFilter(text: String) {
        //swift数组自带filter方法，返回一个符合条件的新数组
        searchResult = areas.filter({ (area) -> Bool in
            //contains检测字符串中包含另一个字符串，localizedCaseInsensitiveContains不区分大小写
            return (area.name!.localizedCaseInsensitiveContains(text))
        })
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //参数为显示在哪个控制器里，参数如为nil，显示搜索条所在的当前tableView
        sc = UISearchController(searchResultsController: nil)
        //代理设置为当前控制器，由它负责更新搜索结果
        sc.searchResultsUpdater = self
        //显示在当前页眉
        tableView.tableHeaderView = sc.searchBar
        //搜索条背景不变暗
        sc.dimsBackgroundDuringPresentation = false
        
        //设置搜索条外观，为透明
        sc.searchBar.searchBarStyle = .minimal
        sc.searchBar.placeholder = "请输入地名进行搜索"
        
        tableView.estimatedRowHeight = 80
        tableView.rowHeight = UITableViewAutomaticDimension
        
        //自定义详情页导航条格式
        self.navigationItem.backBarButtonItem = UIBarButtonItem(title: "", style: .plain, target: nil, action: nil)
        
        fetchAllData2()
    }
    
    //页面消失时调用该方法
    override func viewWillDisappear(_ animated: Bool) {
        super.viewWillAppear(animated)
        sc.isActive = false
    }
    
    func updateSearchResults(for searchController: UISearchController) {
        //获取搜索栏中的文字
        if var text = searchController.searchBar.text {
            //去空格
            text = text.trimmingCharacters(in: .whitespaces)
            //筛选
            searchFilter(text: text)
            //刷新列表
            tableView.reloadData()
        }
    }
    
    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(animated)
        //调用获取数据的方法
        //fetchAllData()
        //整体刷新数据
        //tableView.reloadData()
    }
    
    //当控制器开始处理内容变化时
    func controllerWillChangeContent(_ controller: NSFetchedResultsController<NSFetchRequestResult>) {
        tableView.beginUpdates()
    }
    //当控制器已经处理完内容变更时
    func controllerDidChangeContent(_ controller: NSFetchedResultsController<NSFetchRequestResult>) {
        tableView.endUpdates()
    }
    //内容发生变更时
    func controller(_ controller: NSFetchedResultsController<NSFetchRequestResult>, didChange anObject: Any, at indexPath: IndexPath?, for type: NSFetchedResultsChangeType, newIndexPath: IndexPath?) {
        //变更类型筛选
        switch type {
        //删除数据
        case .delete:
            tableView.deleteRows(at: [indexPath!], with: .automatic)
        //插入数据
        case .insert:
            tableView.insertRows(at: [newIndexPath!], with: .automatic)
        //更新数据
        case .update:
            tableView.reloadRows(at: [indexPath!], with: .automatic)
        default:
            tableView.reloadData()
        }
        //数据已经发生变化，同步到数组
        if let object = controller.fetchedObjects{
            areas = object as! [AreaMO]
        }
    }
    
    func fetchAllData2() {
        //请求结果类型是AreaMO
        let request: NSFetchRequest<AreaMO> = AreaMO.fetchRequest()
        //NSSortDescriptor指定请求结果如何排序
        let sd = NSSortDescriptor(key: "name", ascending: true)
        //可以进行多项排序，所以排序方式是数组形式
        request.sortDescriptors = [sd]
        let appDelegate = UIApplication.shared.delegate as! AppDelegate
        let context = appDelegate.persistentContainer.viewContext
        //NSFetchedResultsController初始化后
        fc = NSFetchedResultsController(fetchRequest: request, managedObjectContext: context, sectionNameKeyPath: nil, cacheName: nil)
        //指定代理
        fc.delegate = self
        
        do {
            try fc.performFetch()
            //执行查询，指定代理
            if let object = fc.fetchedObjects{
                areas = object
            }
        } catch {
            print(error)
        }
    }
    
    //获取数据
    /*func fetchAllData(){
        let appDelegate = UIApplication.shared.delegate as! AppDelegate
        do {
            //获取AreaMO此Enitity的所有条目
            areas = try appDelegate.persistentContainer.viewContext.fetch(AreaMO.fetchRequest())
        } catch  {
            print(error)
        }
    }*/
    
    // MARK: - Table view dalegate
        override func tableView(_ tableView: UITableView, editActionsForRowAt indexPath: IndexPath) -> [UITableViewRowAction]? {
        //增加一个右滑选项actionShare
        let actionShare = UITableViewRowAction(style: .normal, title: "分享") { (_, indexPath) in
            //点击右滑选项对应的动作，闭包实现
            //定义一个弹出框
            let actionSheet = UIAlertController(title: "分享", message: nil, preferredStyle: .actionSheet)
            //定义一个QQ选择
            let option1 = UIAlertAction(title: "QQ", style: .default, handler: nil)
            //定义一个微信选择
            let option2 = UIAlertAction(title: "微信", style: .default, handler: nil)
            //定义一个取消选择
            let optionCancel = UIAlertAction(title: "取消", style: .cancel, handler: nil)
            //将上面的三个选择分别加入到弹出框里面
            actionSheet.addAction(option1)
            actionSheet.addAction(option2)
            actionSheet.addAction(optionCancel)
            //弹出框的显示
            self.present(actionSheet, animated: true, completion: nil)
        }
        //设置分享的背景色
        actionShare.backgroundColor = UIColor.orange
        
        let actionDel = UITableViewRowAction(style: .destructive, title: "删除") { (_, indexPath) in
            //从数据源中删除相应的行
            //self.areas.remove(at: indexPath.row)
            
            let appDelegate = UIApplication.shared.delegate as! AppDelegate
            let context = appDelegate.persistentContainer.viewContext
            //删除一个托管对象，就是当前获取到的指定行的数据
            context.delete(self.fc.object(at: indexPath))
            //保存
            appDelegate.saveContext()
            }
        
        let actionTop = UITableViewRowAction(style: .default, title: "置顶") { (_, _) in
        }
        
        //根据RGB分量自定义颜色
        actionTop.backgroundColor = UIColor(red: 245/255, green: 199/255, blue: 221/255, alpha: 1)
        
        //返回一个数组
        return [actionShare, actionDel,actionTop]
    }
    
    //下面一行是为了分隔提示
    // MARK: - Table view data source

    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        //搜索条活动时，搜索结果是数据源
        return sc.isActive ? searchResult.count : areas.count
    }
    
    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        //as做类型转换，从一个类型转换到另一个类型
        //as! 强制转换（失败app会崩溃，使用as!一般在转换的时候比较确定转换是成功的）
        //as？安全转换（失败不会崩溃）
        // 将 UITableViewCell 转换成 CumtomTableViewCell
        let cell = tableView.dequeueReusableCell(withIdentifier: "cell", for: indexPath)as! CumtomTableViewCell
        
        //搜索条活动时，数据源为搜索结果
        let area = sc.isActive ? searchResult[indexPath.row] : areas[indexPath.row]
        //cell中名称标签赋值
        cell.nameLabel.text = area.name
        //通过读取数组元素得到对应图片名称，设置imageView上的图片
        cell.thumbImageView.image = UIImage(data: area.image as! Data)
        //cell中省份标签赋值
        cell.provinceLabel.text = area.province
        //cell中地区标签赋值
        cell.partLabel.text = area.part
        //将图片的圆角半径设置成宽度的一半，调节layer.cornerRadius属性
        cell.thumbImageView.layer.cornerRadius = cell.thumbImageView.frame.size.height/2
        //让layer设置生效，将裁边选项值设为true
        cell.thumbImageView.clipsToBounds = true
        //重用单元格时判断是否被打钩
        if area.isVisited{
            cell.accessoryType = .checkmark
        }else{
            cell.accessoryType = .none
        }
        return cell
    }
    
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        //搜索时不可编辑，所以返回值要取反
        return !sc.isActive
    }
    
    @IBAction func close(segue: UIStoryboard) {
    }
    
     // MARK: - NAVAGATION
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        //判断转场的identifier是否与自定义的相等
        if segue.identifier == "showAreaDetail"{
            //获取转场目标的控制器
            let dest = segue.destination as! DetailTableViewController
            //设置目标控制器图像的名称，来自于area数组中的某一项，由当前tablevie中的行决定数组下标
            dest.area = sc.isActive ? searchResult[(tableView.indexPathForSelectedRow?.row)!]
: areas[(tableView.indexPathForSelectedRow?.row)!]
        }
    }
}
