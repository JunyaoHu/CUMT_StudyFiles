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
    var area: Area!
    override func viewDidLoad() {
        super.viewDidLoad()
        
        //设置图片控件的图片
        areaImageView.image = UIImage(named: area.image)
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}
