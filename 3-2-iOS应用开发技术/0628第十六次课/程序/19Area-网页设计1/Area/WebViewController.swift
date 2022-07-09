//
//  WebViewController.swift
//  Area
//
//  Created by xuhui on 2018/7/1.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit
import WebKit

class WebViewController: UIViewController {

    @IBOutlet weak var webView: UIWebView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        //隐藏原来的webView
        webView.isHidden = true
        //初始化wkWebView，大小为当前所在view的大小
        let wkWebView = WKWebView(frame: view.frame)
        //添加到父视图
        view.addSubview(wkWebView)
        //高度自适应
        wkWebView.autoresizingMask = [.flexibleHeight]
        
        //载入网页
        if let url = URL(string:"http://www.cumt.edu.cn") {
            let request = URLRequest(url:url)
            //webView.loadRequest(request)
            wkWebView.load(request)
        }
    }
}
