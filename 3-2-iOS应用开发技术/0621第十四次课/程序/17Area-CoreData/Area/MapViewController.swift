//
//  MapViewController.swift
//  Area
//
//  Created by xuhui on 2018/6/12.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit
import MapKit

class MapViewController: UIViewController, MKMapViewDelegate {
    //创建一个变量，用于传值
    var area: AreaMO!
    //与地图控件关联
    @IBOutlet weak var mapView: MKMapView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        //实例化一个code
        let coder = CLGeocoder()
        //如果地名（地址）可以转换，返回结果中包含两个参数：地标列表和错误
        coder.geocodeAddressString(area.name!) { (ps, error) in
            //guard方法却表地标存在，否则退出并显示错误
            guard let ps = ps else{
                print(error ?? "未知错误")
                return
            }
            //取地标数组第一个（最接近的一个）
            let place = ps.first
            //实例化标注，设置标题和副标题
            let annotation = MKPointAnnotation()
            annotation.title = self.area.name
            annotation.subtitle = self.area.province
            //如果地标的地址存在，则设置标注的坐标为地址的坐标
            if let loc = place?.location{
                annotation.coordinate = loc.coordinate
                self.mapView.showAnnotations([annotation], animated: true)
                //让MapView显示标注，并选中其中一个（这里只有一个）
                self.mapView.selectAnnotation(annotation, animated: true)
            }
        }
        
    }

    func mapView(_ mapView: MKMapView, viewFor annotation: MKAnnotation) -> MKAnnotationView? {
        //用户位置视图也是一个标注视图，如果是用户位置，返回nil
        if annotation is MKUserLocation{
            return nil
        }
        let id = "myid"
        //重用标注视图
        var av = mapView.dequeueReusableAnnotationView(withIdentifier: id) as? MKPinAnnotationView
        //如果没有可重用的标注视图，重新初始化一个
        if av == nil {
            av = MKPinAnnotationView(annotation: annotation, reuseIdentifier: id)
            //启用气球提示
            av?.canShowCallout = true
        }
        //添加一个地区缩略图到标注视图中
        let leftIconView = UIImageView(frame: CGRect(x: 0, y: 0, width: 53, height: 53))
        leftIconView.image = UIImage(data: area.image as! Data)
        //给左边的附加视图 赋值 一个UIimageView
        av?.leftCalloutAccessoryView = leftIconView
        //定制图钉颜色
        av?.pinTintColor = UIColor.green
        
        return av
    }
}
