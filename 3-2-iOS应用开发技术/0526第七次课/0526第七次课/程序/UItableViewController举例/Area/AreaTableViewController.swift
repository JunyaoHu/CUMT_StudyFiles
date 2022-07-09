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
    var areas = ["徐州","济南","石家庄","武汉","长沙","三亚","杭州","合肥","桂林","广州"]
    
    //定义图标名称数组
    var areaImages = ["xuzhou","jinan","shijiazhuang","wuhan","changsha","sanya","hangzhou","hefei","guilin","guangzhou"]

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
        let cell = tableView.dequeueReusableCell(withIdentifier: "cell", for: indexPath)

        //给cell里面显示的内容赋值，数组的下标对应每一行
        cell.textLabel?.text = areas[indexPath.row]
        
        //通过读取数组元素得到对应图片名称，设置imageView上的图片
        cell.imageView?.image = UIImage(named: areaImages[indexPath.row])

        //返回cell
        return cell
    }
    
    //隐藏状态栏，计算型变量
    override var prefersStatusBarHidden: Bool{
        return  true
    }
}
