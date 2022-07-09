//
//  DetailTableViewController.swift
//  Area
//
//  Created by xuhui on 2018/6/3.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit
class DetailTableViewController: UITableViewController {

    @IBOutlet weak var largeImageView: UIImageView!
    
    var area: Area!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //设置图片
        largeImageView.image = UIImage(named: area.image)
        //设置背景颜色稍微偏灰，不透明
        tableView.backgroundColor = UIColor(white: 0.98, alpha: 1)
        //设置底部为一个大小为0的矩形
        tableView.tableFooterView = UIView(frame: CGRect.zero)
        //设置分割线颜色
        tableView.separatorColor = UIColor(white: 0.9, alpha: 1)
        //预计行高
        tableView.estimatedRowHeight = 40
        //实际行高为自动适应
        tableView.rowHeight = UITableViewAutomaticDimension
        
        //设置详情页标题
        self.title = area.name
    }

    // MARK: - Table view data source

    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return 4
    }

    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        //创建自定义cell
        let cell = tableView.dequeueReusableCell(withIdentifier: "DetailCell", for: indexPath) as! DetailTableViewCell
        //单元格透明色
        cell.backgroundColor = UIColor.clear
        //通过switch语句给出四行的显示内容
        switch indexPath.row {
        case 0:
            cell.fieldLabel.text = "地名"
            cell.valueLabel.text = area.name
        case 1:
            cell.fieldLabel.text = "省"
            cell.valueLabel.text = area.province
        case 2:
            cell.fieldLabel.text = "地区"
            cell.valueLabel.text = area.part
        case 3:
            cell.fieldLabel.text = "去过与否"
            cell.valueLabel.text = area.isVisited ? "去过":"还没去过"
        default:
            break
        }
        return cell
    }
}
