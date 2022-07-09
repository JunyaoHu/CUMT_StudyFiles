//
//  AppDelegate.swift
//  Area
//
//  Created by xuhui on 2018/5/23.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {
    var window: UIWindow?
    
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplicationLaunchOptionsKey: Any]?) -> Bool {

        //设置导航条背景颜色
        UINavigationBar.appearance().barTintColor = UIColor(red: 242/255, green: 116/255, blue: 119/255, alpha: 1)
        //设置前景色
        UINavigationBar.appearance().tintColor = UIColor.white
        //设置字体
        if let barFont = UIFont(name: "Avenir-Light", size: 24){
            UINavigationBar.appearance().titleTextAttributes = [
                //设置字体名称
                NSFontAttributeName: barFont,
                //设置前景色
                NSForegroundColorAttributeName: UIColor.white
            ]
        }
        return true
    }
}

