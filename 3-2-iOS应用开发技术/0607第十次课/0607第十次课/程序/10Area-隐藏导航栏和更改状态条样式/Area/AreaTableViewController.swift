//
//  AreaTableViewController.swift
//  Area
//
//  Created by xuhui on 2018/5/23.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class AreaTableViewController: UITableViewController {
    var areas = [Area(name: "中国矿业大学徐州市大学路1号中国矿业大学南湖校区", province:"江苏省", part: "华东", image:"xuzhou", isVisited: false) ,
    Area(name: "山东大学济南市山大南路 27 号", province:"山东省", part: "华东", image:"jinan", isVisited: false) ,
    Area(name: "河北大学保定市五四东路180号", province:"河北省", part: "华北", image:"shijiazhuang", isVisited: false),
    Area(name: "武汉大学武汉市珞珈山街道八一路299号", province:"湖北省", part: "华中", image:"wuhan", isVisited: false) ,
    Area(name: "湖南大学长沙市岳麓区麓山南路麓山门", province:"湖南省", part: "华中", image:"changsha", isVisited: false) ,
    Area(name: "海南大学三亚学院三亚市迎宾大道学院路", province:"海南省", part: "华南", image:"sanya", isVisited: false) ,
    Area(name: "浙江大学西湖区浙大路38号 ", province:"浙江省", part: "华东", image:"hangzhou", isVisited: false) ,
    Area(name: "中国科学技术大学合肥市金寨路96号", province:"安徽省", part: "华东", image:"hefei", isVisited: false) ,
    Area(name: "广西师范大学桂林市育才路15号", province:"广西省", part: "广西", image:"guilin", isVisited: false) ,
    Area(name: "中山大学广州市新港西路135号", province:"广东省", part: "华南", image:"guangzhou", isVisited: false)
 ]

    override func viewDidLoad() {
        super.viewDidLoad()
        //自定义详情页导航条格式
        self.navigationItem.backBarButtonItem = UIBarButtonItem(title: "", style: .plain, target: nil, action: nil)
        
    }
    
    // MARK: - Table view dalegate
    /*
    override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        //定义一个弹出框
        let menu = UIAlertController(title: "您好", message: "您选择了第\(indexPath.row + 1)行", preferredStyle: .actionSheet)
        //定义一个按钮用于用户交互
        let option2 = UIAlertAction(title: "取消", style: .cancel, handler: nil)
        let option3 = UIAlertAction(title: "我去过", style: .default) { (_) in
            //取得点击的单元格
            let cell = tableView.cellForRow(at: indexPath)
            //将单元格打钩
            cell?.accessoryType = .checkmark
            //将打钩状态保存到visited数组中
            self.visited[indexPath.row] = true
        }
        //将按钮加入到弹出框中
        menu.addAction(option2)
        menu.addAction(option3)
        //显示菜单
        self.present(menu, animated: true, completion: nil)
    }
    */
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
            self.areas.remove(at: indexPath.row)
            
            //删除某一行刷新
            tableView.deleteRows(at: [indexPath], with: .fade)
            //整体刷新
            //tableView.reloadData()
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
        return areas.count
    }
    
    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        //as做类型转换，从一个类型转换到另一个类型
        //as! 强制转换（失败app会崩溃，使用as!一般在转换的时候比较确定转换是成功的）
        //as？安全转换（失败不会崩溃）
        // 将 UITableViewCell 转换成 CumtomTableViewCell
        let cell = tableView.dequeueReusableCell(withIdentifier: "cell", for: indexPath)as! CumtomTableViewCell
        
        //cell中名称标签赋值
        cell.nameLabel.text = areas[indexPath.row].name
        
        //通过读取数组元素得到对应图片名称，设置imageView上的图片
        cell.thumbImageView.image = UIImage(named: areas[indexPath.row].image)
        
        //cell中省份标签赋值
        cell.provinceLabel.text = areas[indexPath.row].province
        
        //cell中地区标签赋值
        cell.partLabel.text = areas[indexPath.row].part
        
        //将图片的圆角半径设置成宽度的一半，调节layer.cornerRadius属性
        cell.thumbImageView.layer.cornerRadius = cell.thumbImageView.frame.size.height/2
        
        //让layer设置生效，将裁边选项值设为true
        cell.thumbImageView.clipsToBounds = true
        
        //重用单元格时判断是否被打钩
        if areas[indexPath.row].isVisited{
            cell.accessoryType = .checkmark
        }else{
            cell.accessoryType = .none
        }
        return cell
    }
    
    //插入或者删除指定行
    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCellEditingStyle, forRowAt indexPath: IndexPath) {
        //删除行
        if editingStyle == .delete{
            //从数据源中删除相应的行
            self.areas.remove(at: indexPath.row)
            
            //删除某一行刷新
            tableView.deleteRows(at: [indexPath], with: .fade)
            //整体刷新
            //tableView.reloadData()
        }else if editingStyle == .insert{
        }
    }
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        //判断转场的identifier是否与自定义的相等
        if segue.identifier == "showAreaDetail"{
            //获取转场目标的控制器
            let dest = segue.destination as! DetailTableViewController
            //设置目标控制器图像的名称，来自于area数组中的某一项，由当前tablevie中的行决定数组下标
            dest.area = areas[(tableView.indexPathForSelectedRow?.row)!]
        }
    }
}
