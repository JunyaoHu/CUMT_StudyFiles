//
//  DetailTableViewController.swift
//  Area
//
//  Created by xuhui on 2018/6/3.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class DetailTableViewController: UITableViewController {
    var area: AreaMO!
    
    @IBOutlet weak var largeImageView: UIImageView!
    
    @IBOutlet weak var ratingBtn: UIButton!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //设置图片
        largeImageView.image = UIImage(data: area.image as! Data)
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
        
        if let rating = area.rating{
            self.ratingBtn.setImage(UIImage(named: rating), for: .normal)
        }
        
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

    // MARK: - Navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        //找到标识符为"showMap"的转场
        if segue.identifier == "showMap"{
            //找到目标控制器
            let destVC = segue.destination as! MapViewController
            //向目标控制器传值
            destVC.area = self.area
        }
    }
    
    @IBAction func close(segue: UIStoryboardSegue){
        //反场前取回源控制器
        let reviewVC = segue.source as! ReviewViewController
        //得到源控制中rating中的值，并判断其中是否有值
        if let rating = reviewVC.rating {
            //更新模型中的rating值
            self.area.rating = rating
            //将当前ratingBtn中的图片设置为rating
            self.ratingBtn.setImage(UIImage(named: rating), for: .normal)
        }
        
        let appDelegate = UIApplication.shared.delegate as! AppDelegate
        appDelegate.saveContext()
    }
}
