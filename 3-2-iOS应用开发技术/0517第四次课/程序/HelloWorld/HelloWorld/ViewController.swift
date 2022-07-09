//
//  ViewController.swift
//  HelloWorld
//
//  Created by xuhui on 2018/5/21.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBAction func touch(_ sender: UIButton) {
        print("Hello World!")
        
        //创建基础UIAlertController
        let ac = UIAlertController(title: "提示", message: "您点击了按钮", preferredStyle: .alert)
        
        //创建动作按钮
        //style的参数可选：常规(default)、取消(cancel)以及警示(destruective)
        let btn1 = UIAlertAction(title: "好", style: .default, handler: nil)
        let btn2 = UIAlertAction(title: "取消", style: .destructive, handler: nil)
        
        //动作按钮添加到控制器上
        ac.addAction(btn1)
        ac.addAction(btn2)
        
        //显示对话框视图控制器
        self.present(ac, animated: true, completion: nil)
        }
}

