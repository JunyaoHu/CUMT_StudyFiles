//
//  ViewController.swift
//  calculator
//
//  Created by xuhui on 2018/5/19.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class ViewController:UIViewController{
//按住control键，将控件连线之该位置，属性选择outlet
    @IBOutlet weak var num1: UITextField!
    
    @IBOutlet weak var num2: UITextField!

    @IBOutlet weak var sum: UILabel!
//方法选择action
    @IBAction func calculate(_ sender: UIButton) {
        //文本框中的内容为String类型，转为Double类型
        //文本框中的数据类型为String?,需要显式拆包
        let i1 = Double(num1.text!)
        let i2 = Double(num2.text!)
        //计算结果在文本框中输出，需转为String类型
        sum.text = String(i1! + i2!)
    }
}

