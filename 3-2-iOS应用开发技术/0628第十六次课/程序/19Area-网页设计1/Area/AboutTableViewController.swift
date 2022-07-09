//
//  AboutTableViewController.swift
//  Area
//
//  Created by xuhui on 2018/7/1.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit
import SafariServices

class AboutTableViewController: UITableViewController {
    //Section标题
    var sectionTitle = ["反馈","中国矿业大学"]
    //Section中的单元格
    var sectionContent = [["评分","反馈意见"],["网站","计算机学院","教务部"]]
    //相应的网址
    var links = ["http://www.cumt.edu.cn","http://cs.cumt.edu.cn","http://jwb.cumt.edu.cn"]
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //设置页脚为大小为0的空视图
        tableView.tableFooterView = UIView(frame: CGRect.zero)
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    // MARK: - Table view data source

    override func numberOfSections(in tableView: UITableView) -> Int {
        //两个section
        return 2
    }
    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        //根据section返回不同的行数
        return section == 0 ? 2 : 3
    }
    
    override func tableView(_ tableView: UITableView, titleForHeaderInSection section: Int) -> String? {
        //设置section的头部
        return sectionTitle[section]
    }

    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "Cell", for: indexPath)
        //设置单元格的值
        cell.textLabel?.text = sectionContent[indexPath.section][indexPath.row]
        return cell
    }
    
    override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        switch indexPath.section {
        case 0:
            if indexPath.row == 0 {
                if let url = URL(string: "https://www.apple.com/itunes/charts/paid-apps/"){
                    //点击评分时，让app切换至Safari打开网页，使用openURL方法
                    UIApplication.shared.open(url)
                }
            }else{
                performSegue(withIdentifier: "showWebView", sender: self)
            }
        case 1:
            //根据单元格位置在数组中取得对应的网址
            if let url = URL(string: links[indexPath.row]) {
                //初始化时指定一个URL
                let sfvc = SFSafariViewController(url: url)
                //模态的形式弹出
                present(sfvc, animated: true, completion: nil)
            }
        default:
            break
        }
        tableView.deselectRow(at: indexPath, animated: true)
    }
}
