//
//  Area.swift
//  Area
//
//  Created by xuhui on 2018/6/1.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import Foundation

//建立一个结构体模型
struct Area {
    var name : String
    var province : String
    var part : String
    var image : String
    var isVisited : Bool
    var rating = ""
    //保持以前数据的兼容
    init(name: String, province: String, part: String, image: String, isVisited: Bool){
        self.name = name
        self.province = province
        self.part = part
        self.image = image
        self.isVisited = isVisited
    }
}

/*Area(name: "中国矿业大学徐州市大学路1号中国矿业大学南湖校区", province:"江苏省", part: "华东", image:"xuzhou", isVisited: false) ,
Area(name: "山东大学济南市山大南路 27 号", province:"山东省", part: "华东", image:"jinan", isVisited: false) ,
Area(name: "河北大学保定市五四东路180号", province:"河北省", part: "华北", image:"shijiazhuang", isVisited: false),
Area(name: "武汉大学武汉市珞珈山街道八一路299号", province:"湖北省", part: "华中", image:"wuhan", isVisited: false) ,
Area(name: "湖南大学长沙市岳麓区麓山南路麓山门", province:"湖南省", part: "华中", image:"changsha", isVisited: false) ,
Area(name: "海南大学三亚学院三亚市迎宾大道学院路", province:"海南省", part: "华南", image:"sanya", isVisited: false) ,
Area(name: "浙江大学西湖区浙大路38号 ", province:"浙江省", part: "华东", image:"hangzhou", isVisited: false) ,
Area(name: "中国科学技术大学合肥市金寨路96号", province:"安徽省", part: "华东", image:"hefei", isVisited: false) ,
Area(name: "广西师范大学桂林市育才路15号", province:"广西省", part: "广西", image:"guilin", isVisited: false) ,
Area(name: "中山大学广州市新港西路135号", province:"广东省", part: "华南", image:"guangzhou", isVisited: false)*/


