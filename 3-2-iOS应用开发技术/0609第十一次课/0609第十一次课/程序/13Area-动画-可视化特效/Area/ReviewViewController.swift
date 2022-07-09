//
//  ReviewViewController.swift
//  Area
//
//  Created by xuhui on 2018/6/10.
//  Copyright © 2018年 xuhui. All rights reserved.
//

import UIKit

class ReviewViewController: UIViewController {

    @IBOutlet weak var bgImageView: UIImageView!
    
    @IBOutlet weak var ratingStackView: UIStackView!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //指定一个特效类型
        let effect = UIBlurEffect(style: .light)
        //创建一个特效视图
        let effeciView = UIVisualEffectView(effect: effect)
        //设定特效视图的大小
        effeciView.frame = view.frame
        //把特效视图叠加在原视图之上
        bgImageView.addSubview(effeciView)
        //创建初始为0，加载视图的时候不显示
        //ratingStackView.transform = CGAffineTransform(scaleX: 0, y: 0)
        //设置起始位置、大小
        let startPos = CGAffineTransform(translationX: 0, y: 500)
        let startScale = CGAffineTransform(scaleX: 0, y: 0)
        //将两个transform组合一起,注意一定要用放缩组合位置
        ratingStackView.transform = startScale.concatenating(startPos)

    }
    
    //试图加载完毕后调用
    override func viewDidAppear(_ animated: Bool) {
        /*UIView.animate(withDuration: 0.5) {
            //将ratingStackView的transform设置成原始大小
            self.ratingStackView.transform = CGAffineTransform.identity
        }*/
        //Spring动画，有震动的效果
        //delay延迟时间为0，Damping震荡时间为0.3，initialSpringVelocity初始速度为0.5，options选项为空数组
        UIView.animate(withDuration: 2, delay: 0, usingSpringWithDamping: 0.3, initialSpringVelocity: 0.5, options: [], animations: {
            //设置动画结束位置和大小
            let endPos = CGAffineTransform(translationX: 0, y: 0)
            let endScale = CGAffineTransform.identity
            //self.ratingStackView.transform = CGAffineTransform.identity
            //将两个变化组合到一起,注意一定要用放缩组合位置
            self.ratingStackView.transform = endScale.concatenating(endPos)
        }, completion: nil)
    }

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}
