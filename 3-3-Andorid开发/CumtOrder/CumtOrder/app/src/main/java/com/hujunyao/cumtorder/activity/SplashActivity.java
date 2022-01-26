package com.hujunyao.cumtorder.activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hujunyao.cumtorder.R;
import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private TextView tv_version;  //新建tv_version成员变量

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //设置此界面为竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        init();
    }

    private void init() {
        //将布局文件的tv_version属性赋给成员变量tv_version
        tv_version = (TextView) findViewById(R.id.tv_version);
        try {
            //获取程序包信息
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), 0);
            //获得版本号：AndroidManifest.xml里面的versionName
            tv_version.setText("V" + info.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            //如果获取不到版本号，控制台打印错误日志，System.err
            e.printStackTrace();
            //欢迎界面返回V
            tv_version.setText("V");
        }
        //利用Timer让此界面延迟3秒后跳转,timer中有一个线程，这个线程不断执行task
        Timer timer = new Timer();
        //timertask实现runnable接口,TimerTask类表示一个在指定时间内执行的task
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //欢迎界面跳转到主界面
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            }
        };
        timer.schedule(task, 3000);//设置这个task在延迟3秒之后自动执行
    }
}
