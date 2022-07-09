//
//  AreaDetailViewController.swift
//  Area
//
//  Created by xuhui on 2018/5/30.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class AreaDetailViewController: UIViewController {
    @IBOutlet weak var areaImageView: UIImageView!
    //定义一个要显示的图像名称的文件名变量
    var areaName = ""
    override func viewDidLoad() {
        super.viewDidLoad()
        //设置图片控件的图片
        areaImageView.image = UIImage(named: areaName)
    }
}
