//: Playground - noun: a place where people can play

import UIKit

var areas = ["徐州","济南","石家庄","武汉","长沙","三亚","杭州","合肥","桂林","广州"]
var provinces = ["江苏省","山东省","河北省","湖北省","湖南省","海南省","浙江省","安徽省","广西省","广东省"]
var parts = ["华东","华东","华北","华中","华中","华南","华东","华东","广西","华南"]
var areaImages = ["xuzhou","jinan","shijiazhuang","wuhan","changsha","sanya","hangzhou","hefei","guilin","guangzhou"]
var visited = [Bool](repeatElement(false, count: 10))

for i in 0...areas.count - 1 {
    print("Area(name: \"\(areas[i])\", province:\"\(provinces[i])\", part: \"\(parts[i])\",image:\"\(areaImages[i])\", isVisited: \(visited[i]))",",")
}
