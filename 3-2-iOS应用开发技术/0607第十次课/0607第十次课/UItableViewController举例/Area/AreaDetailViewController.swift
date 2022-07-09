//
//  AreaDetailViewController.swift
//  Area
//
//  Created by xuhui on 2021/6/7.
//  Copyright © 2021 xuhui. All rights reserved.
//

import UIKit

class AreaDetailViewController: UIViewController {

    var areaName = ""
    @IBOutlet weak var areaImageView: UIImageView!
    
    override func viewDidLoad() {
        super.viewDidLoad()

        areaImageView.image = UIImage(named: areaName)
        // Do any additional setup after loading the view.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
