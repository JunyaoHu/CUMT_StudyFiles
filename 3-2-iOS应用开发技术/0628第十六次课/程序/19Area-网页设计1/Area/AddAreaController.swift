//
//  AddAreaController.swift
//  Area
//
//  Created by xuhui on 2018/6/14.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit
import CoreData

class AddAreaController: UITableViewController,UIImagePickerControllerDelegate,UINavigationControllerDelegate {

    var area: AreaMO!
    var isVisited = false
    @IBOutlet weak var tfName: UITextField!
    @IBOutlet weak var tfProvince: UITextField!
    @IBOutlet weak var tfPart: UITextField!
    @IBOutlet weak var labelVisited: UILabel!
    @IBOutlet weak var coverImageView: UIImageView!
    
    @IBAction func saveTap(_ sender: Any) {
        //获取appDelegate，强制转换成工程的AppDelegate，可获得对它的引用
        let appDelegate = UIApplication.shared.delegate as! AppDelegate
        //可以获得CoreData持久化容器中的Context
        area = AreaMO(context: appDelegate.persistentContainer.viewContext)
        //设置相关的值
        area.name = tfName.text
        area.province = tfProvince.text
        area.part = tfPart.text
        area.isVisited = isVisited
        //把图像转换为JPEG格式，0.7是图片的清晰度
        if let imageData = UIImageJPEGRepresentation(coverImageView.image!, 0.7) {
            area.image = NSData(data: imageData)
        }
        print("正在保存...")
        //保存数据
        appDelegate.saveContext()
        //退出，返回到首页
        performSegue(withIdentifier: "unwindToHomeList", sender: self)
    }
   
    @IBAction func isVisited(_ sender: UIButton) {
        if sender.tag == 8001 {
            isVisited = true
            labelVisited.text = "我来过"
        } else {
            isVisited = false
            labelVisited.text = "没去过"
        }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    func imagePickerController(_ picker: UIImagePickerController, didFinishPickingMediaWithInfo info: [String : Any]) {
        //给出选中的图片类型
        coverImageView.image = info[UIImagePickerControllerOriginalImage] as? UIImage
        //设定图片的排列模式
        coverImageView.contentMode = .scaleAspectFill
        //裁边
        coverImageView.clipsToBounds = true
        //设置与父视图等宽的约束
        //constant是关于距离的约束，所以设为0
        let coverWithCons = NSLayoutConstraint(item: coverImageView, attribute: .width, relatedBy: .equal, toItem: coverImageView.superview, attribute: .width, multiplier: 1, constant: 0)
        //设置与父视图等高的约束
        let coverHeightCons = NSLayoutConstraint(item: coverImageView, attribute: .height, relatedBy: .equal, toItem: coverImageView.superview, attribute: .height, multiplier: 1, constant: 0)
        //让两个约束生效
        coverWithCons.isActive = true
        coverHeightCons.isActive = true
        //视图退场
        dismiss(animated: true, completion: nil)
    }

    override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        if indexPath.row == 0{
            //通过guard判定访问相册的权限是否可用，如果不可用，返回
            guard UIImagePickerController.isSourceTypeAvailable(.photoLibrary) else {
                print("相册不可用")
                return
            }
            //实例化UIImagePickerController
            let picker = UIImagePickerController()
            //不允许编辑
            picker.allowsEditing = false
            //来源为相册
            picker.sourceType = .photoLibrary
            //设置代理为当前控制器
            picker.delegate = self
            //以模态弹出
            self.present(picker,animated: true,completion: nil)
        }
        
        //单元格取消选择
        tableView.deselectRow(at: indexPath, animated: true)
    }
}
