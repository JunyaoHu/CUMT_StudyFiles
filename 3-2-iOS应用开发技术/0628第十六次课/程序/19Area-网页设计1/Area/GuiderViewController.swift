//
//  GuiderViewController.swift
//  Area
//
//  Created by xuhui on 2018/6/25.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class GuiderViewController: UIPageViewController, UIPageViewControllerDataSource {
    //添加头标签、尾标签、图片名的数组，用于创建各页面控制器
    var headings = ["中国矿业大学与","计算机科学与技术学院","卓越班"]
    var images = ["eastgate","computer","ios"]
    var footers = ["南湖校区","计算机专业","iOS应用开发技术"]
    override func viewDidLoad() {
        super.viewDidLoad()
        dataSource = self
        if let startVC = vc(atIndex: 0) {
            setViewControllers([startVC], direction: .forward, animated: true, completion: nil)
        }
    }

    func pageViewController(_ pageViewController: UIPageViewController, viewControllerBefore viewController: UIViewController) -> UIViewController? {
        //取出当前控制器的index
        var index = (viewController as! ContentViewController).index
        //索引+1后，返回下一个控制器
        index += 1
        //返回当前索引号的控制器
        return vc(atIndex: index)
        }
    
    func pageViewController(_ pageViewController: UIPageViewController, viewControllerAfter viewController: UIViewController) -> UIViewController? {
        //取出当前控制器的index
        var index = (viewController as! ContentViewController).index
        //索引-1后，返回下一个控制器
        index -= 1
        //返回当前索引号的控制器
        return vc(atIndex: index)
    }
    
    func vc(atIndex: Int) -> ContentViewController? {
        if case 0..<headings.count = atIndex{
            if let contentVC = storyboard?.instantiateViewController(withIdentifier: "ContentController") as? ContentViewController {
                contentVC.heading = headings[atIndex]
                contentVC.footer = footers[atIndex]
                contentVC.imageName = images[atIndex]
                contentVC.index = atIndex
                return contentVC
            }
        }
        return nil
    }
    /*
    //要显示的页数
    func presentationCount(for pageViewController: UIPageViewController) -> Int {
        return headings.count
    }
    //起始页的索引
    func presentationIndex(for pageViewController: UIPageViewController) -> Int {
        return 0
    }
    */
}
