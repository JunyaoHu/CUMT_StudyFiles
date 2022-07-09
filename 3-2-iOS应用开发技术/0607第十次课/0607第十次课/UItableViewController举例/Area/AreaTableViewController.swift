//
//  AreaTableViewController.swift
//  Area
//
//  Created by xuhui on 2018/5/23.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class AreaTableViewController: UITableViewController {
    //定义标题数组
    var areas = ["徐州","济南","石家庄","武汉","长沙","三亚","杭州","合肥","桂林","广州","徐州","济南","石家庄","武汉","长沙","三亚","杭州","合肥","桂林","广州"]
    
    //定义图标名称数组
    var areaImages = ["xuzhou","jinan","shijiazhuang","wuhan","changsha","sanya","hangzhou","hefei","guilin","guangzhou","xuzhou","jinan","shijiazhuang","wuhan","changsha","sanya","hangzhou","hefei","guilin","guangzhou"]
    
    var provinces = ["江苏省","山东省","河北省","湖北省","湖南省","海南省","浙江省","安徽省","广西省","广东省","江苏省","山东省","河北省","湖北省","湖南省","海南省","浙江省","安徽省","广西省","广东省"]
    
    var parts = ["华东","华东","华北","华中","华中","华南","华东","华东","广西","华南","华东","华东","华北","华中","华中","华南","华东","华东","广西","华南"]
    
    var visited = [Bool](repeatElement(false, count: 20))
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }

    // MARK: - Table view data source
    //返回一个section中有多少行
    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return areas.count
    }
    
    //返回每一个cell显示的内容，该方法在列表每一行显示时都会被执行一次，用indexpath对象可以得到当前是哪一行(indexPath.row)，行号是从0开始。可以从数组中根据对应的行号作为下标取回相应的元素，显示到单元格上。
    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        //定义一个cell, withIdentifier: "cell"意思是从缓存池中选取标识符为cell的单元格循环使用
        let cell = tableView.dequeueReusableCell(withIdentifier: "cell", for: indexPath) as! CustomTableViewCell

        //给cell里面显示的内容赋值，数组的下标对应每一行
      
        cell.nameLabel.text = areas[indexPath.row]
        cell.provinceLabel.text = provinces[indexPath.row]
        cell.partLabel.text = parts[indexPath.row]
        //通过读取数组元素得到对应图片名称，设置imageView上的图片
        cell.thumbImageView.image = UIImage(named: areaImages[indexPath.row])
        
        cell.thumbImageView.layer.cornerRadius = cell.thumbImageView.frame.size.width/2
        
        cell.thumbImageView.clipsToBounds = true
        
        if visited[indexPath.row] {
            cell.accessoryType = .checkmark
        }else{
            cell.accessoryType = .none
        }

        //返回cell
        return cell
    }
    
//    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCellEditingStyle, forRowAt indexPath: IndexPath) {
//        if editingStyle == .delete{
//            self.areas.remove(at: indexPath.row)
//            self.areaImages.remove(at: indexPath.row)
//            self.provinces.remove(at: indexPath.row)
//            self.parts.remove(at: indexPath.row)
//            self.visited.remove(at: indexPath.row)
//
//            tableView.deleteRows(at: [indexPath], with: .fade)
//
//        }
//    }
    
    // MARK: - Table view delegate
//    override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
//        let menu = UIAlertController(title: "您好", message: "您选择了第\(indexPath.row + 1)", preferredStyle: .actionSheet)
//        
//        let option1 = UIAlertAction(title: "取消", style: .cancel, handler: nil)
//        
//        let option2 = UIAlertAction(title: "我去过", style: .default) { (_) in
//            let cell = tableView.cellForRow(at: indexPath)
//            cell?.accessoryType = .checkmark
//            self.visited[indexPath.row] = true
//        }
//        
//        menu.addAction(option1)
//        menu.addAction(option2)
//        
//        self.present(menu, animated: true, completion: nil)
//        
//    }
    
    override func tableView(_ tableView: UITableView, editActionsForRowAt indexPath: IndexPath) -> [UITableViewRowAction]? {
       
        let actionShare = UITableViewRowAction(style: .normal, title: "分享") { (_, IndexPath) in
        }
        
        actionShare.backgroundColor = UIColor(red: 86/255, green: 204/255, blue: 204/255, alpha: 1)
        
        let actionDel = UITableViewRowAction(style: .destructive, title: "删除") { (_, IndexPath) in
            self.areas.remove(at: indexPath.row)
            self.areaImages.remove(at: indexPath.row)
            self.provinces.remove(at: indexPath.row)
            self.parts.remove(at: indexPath.row)
            self.visited.remove(at: indexPath.row)
            
            tableView.deleteRows(at: [indexPath], with: .fade)
        }
        
        
        return [actionShare, actionDel]
        
    }
    
     // MARK: - Navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if segue.identifier == "showAreaDetail" {
            let dest = segue.destination as! AreaDetailViewController
            dest.areaName = areaImages[(tableView.indexPathForSelectedRow?.row)!]
            
        }
    }
    
}
