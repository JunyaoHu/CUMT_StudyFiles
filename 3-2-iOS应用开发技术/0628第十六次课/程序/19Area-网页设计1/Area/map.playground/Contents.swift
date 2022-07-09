//: Playground - noun: a place where people can play

import UIKit
import MapKit

let coder = CLGeocoder()
var placemark : CLPlacemark?
coder.geocodeAddressString("安徽省马鞍山市霍里山大道马鞍山软件园") { (placemarks, error) in
    if error != nil{
        print(error ?? "错误")
    }
    if let ps = placemarks{
        placemark = ps.first
    }
}
placemark?.location?.coordinate

