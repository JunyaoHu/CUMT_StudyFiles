//
//  AreaTableViewController.swift
//  Area
//
//  Created by xuhui on 2018/5/23.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class AreaTableViewController: UITableViewController {
    var areas = ["徐州","济南","石家庄","武汉","长沙","三亚","杭州","合肥","桂林","广州"]
    var provinces = ["江苏省","山东省","河北省","湖北省","湖南省","海南省","浙江省","安徽省","广西省","广东省"]
    var parts = ["华东","华东","华北","华中","华中","华南","华东","华东","广西","华南"]
    var areaImages = ["xuzhou","jinan","shijiazhuang","wuhan","changsha","sanya","hangzhou","hefei","guilin","guangzhou"]
    
    var visited = [Bool](repeatElement(false, count: 10))

    override func viewDidLoad() {
        super.viewDidLoad()
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
            //移除areaImages数组中图标名称
            self.areaImages.remove(at: indexPath.row)
            //移除areas数组中名称
            self.areas.remove(at: indexPath.row)
            //移除provinces数组中省份名称
            self.provinces.remove(at: indexPath.row)
            //移除parts数组中地区名称
            self.parts.remove(at: indexPath.row)
            //删除访问记录
            self.visited.remove(at: indexPath.row)
            
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
        cell.nameLabel.text = areas[indexPath.row]
        
        //通过读取数组元素得到对应图片名称，设置imageView上的图片
        cell.thumbImageView.image = UIImage(named: areaImages[indexPath.row])
        
        //cell中省份标签赋值
        cell.provinceLabel.text = provinces[indexPath.row]
        
        //cell中地区标签赋值
        cell.partLabel.text = parts[indexPath.row]
        
        //将图片的圆角半径设置成宽度的一半，调节layer.cornerRadius属性
        cell.thumbImageView.layer.cornerRadius = cell.thumbImageView.frame.size.height/2
        
        //让layer设置生效，将裁边选项值设为true
        cell.thumbImageView.clipsToBounds = true
        
        //重用单元格时判断是否被打钩
        if visited[indexPath.row]{
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
            //移除areaImages数组中图标名称
            self.areaImages.remove(at: indexPath.row)
            //移除areas数组中名称
            self.areas.remove(at: indexPath.row)
            //移除provinces数组中省份名称
            self.provinces.remove(at: indexPath.row)
            //移除parts数组中地区名称
            self.parts.remove(at: indexPath.row)
            //删除访问记录
            self.visited.remove(at: indexPath.row)
            
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
            let dest = segue.destination as! AreaDetailViewController
            //设置目标控制器图像的名称，来自于areaImage数组中的某一项，由当前tablevie中的行决定数组下标
            dest.areaName = areaImages[(tableView.indexPathForSelectedRow?.row)!]
        }
    }
}
