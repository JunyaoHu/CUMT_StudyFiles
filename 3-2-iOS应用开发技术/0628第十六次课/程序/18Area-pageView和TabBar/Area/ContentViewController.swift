//
//  ContentViewController.swift
//  Area
//
//  Created by xuhui on 2018/6/25.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class ContentViewController: UIViewController {

    @IBOutlet weak var labelHeading: UILabel!
    
    @IBOutlet weak var imageView: UIImageView!
    
    @IBOutlet weak var laberFooter: UILabel!
    
    @IBOutlet weak var pageControl: UIPageControl!
    
    @IBOutlet weak var btnDone: UIButton!
    
    //index用于保存当前页索引，其他三个用于数据传递
    var index = 0
    var heading = ""
    var imageName = ""
    var footer = ""
    
    @IBAction func doneBtnTap(_ sender: UIButton) {
        //创建一个UserDefaults实例
        let defaults = UserDefaults.standard
        //存一个参数，键GuiderShow（引导已显示），值为true
        defaults.set(true, forKey: "GuiderShow")
        //页面退场
        dismiss(animated: true, completion: nil)
    }
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //给控件赋值
        laberFooter.text = footer
        labelHeading.text = heading
        imageView.image = UIImage(named: imageName)
        
        pageControl.currentPage = index
        //只要不是第三个索引页，“立即体验”按钮就隐藏
        btnDone.isHidden = (index != 2)
        

        // Do any additional setup after loading the view.
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
