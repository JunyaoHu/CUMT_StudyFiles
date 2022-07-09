//
//  CumtomTableViewCell.swift
//  Area
//
//  Created by xuhui on 2018/5/23.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class CumtomTableViewCell: UITableViewCell {
//属性用来存储用于显示到UI上的值
//@IBOutlet用于引用storyboard上的一个UI组件
//@IBAction用于响应一个UI组件的交互事件
    @IBOutlet weak var nameLabel: UILabel!
    @IBOutlet weak var provinceLabel: UILabel!
    @IBOutlet weak var partLabel: UILabel!
    @IBOutlet weak var thumbImageView: UIImageView!
    
    override func awakeFromNib() {
        super.awakeFromNib()
        // Initialization code
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)
        // Configure the view for the selected state
    }
}
