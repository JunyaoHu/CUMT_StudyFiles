package com.hujunyao.cumtorder.activity;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hujunyao.cumtorder.R;
import com.hujunyao.cumtorder.utils.MD5Utils;


public class RegisterActivity extends AppCompatActivity {
    //标题栏
    private TextView tv_title;
    //返回按钮
    private TextView tv_back;
    //注册按钮
    private Button btn_register;
    //账号、密码、再次输入密码的控件
    private EditText et_user_name,et_psw,et_psw_again;
    //账号、密码、再次输入密码的控件的获取值
    private String userName,psw,pswAgain;
    //标题布局
    private RelativeLayout rl_rirle_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置页面布局
        setContentView(R.layout.activity_register);
        //设置界面为竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        init();
    }

    private void init(){
        //main_title_bar.xml页面布局文件获取对应的UI控件
        tv_title = (TextView)findViewById(R.id.tv_title);
        tv_title.setText("注册");
        tv_back = (TextView)findViewById(R.id.tv_back);
        tv_back.setVisibility(View.GONE);
        rl_rirle_bar = (RelativeLayout)findViewById(R.id.title_bar);
        rl_rirle_bar.setBackgroundColor(Color.TRANSPARENT);
        //activity_register.xml页面布局文件获取对应的UI控件
        btn_register = (Button)findViewById(R.id.btn_register);
        et_user_name = (EditText) findViewById(R.id.et_user_name);
        et_psw =(EditText) findViewById(R.id.et_psw);
        et_psw_again = (EditText)findViewById(R.id.et_psw_again);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取输入在相应控件中的字符串
                getEditString();
                if (TextUtils.isEmpty(userName)){
                    Toast.makeText(RegisterActivity.this,"请输入用户名",Toast.LENGTH_LONG).show();
                }else  if (TextUtils.isEmpty(psw)){
                    Toast.makeText(RegisterActivity.this,"请输入密码",Toast.LENGTH_LONG).show();
                }else  if (TextUtils.isEmpty(pswAgain)){
                    Toast.makeText(RegisterActivity.this,"请再次输入密码",Toast.LENGTH_LONG).show();
                }else if (!psw.equals(pswAgain)){
                    Toast.makeText(RegisterActivity.this,"两次密码不一致",Toast.LENGTH_LONG).show();
                }else if (isExistUserName(userName)){
                    Toast.makeText(RegisterActivity.this,"此账户名已经存在",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(RegisterActivity.this,"注册成功",Toast.LENGTH_LONG).show();
                    saveRegisterInfo(userName,psw);
                    Intent data = new Intent();
                    data.putExtra("userName",userName);
                    setResult(RESULT_OK,data);
                    RegisterActivity.this.finish();
                }
            }
        });
    }

    /**
     *  获取控件中的字符串
     */
    private void getEditString() {
        userName = et_user_name.getText().toString().trim();
        psw = et_psw.getText().toString().trim();
        pswAgain = et_psw_again.getText().toString().trim();
    }

    /**
     *  从SharedPreferences中获取用户名，并判断此用户名是否存在
     */
    private boolean isExistUserName(String userName) {
        boolean has_userName = false;
        SharedPreferences sp = getSharedPreferences("loginInfo",MODE_PRIVATE);
        String spPwd = sp.getString(userName,"");
        if (!TextUtils.isEmpty(spPwd)){
            has_userName = true;
        }
        return has_userName;
    }


    /**
     *  保存用户名和密码到SharedPreferences中
     */
    private void saveRegisterInfo(String userName, String psw) {
        //把密码用MD5加密
        String md5Psw = MD5Utils.md5(psw);
        //loginInfo表示文件名
        SharedPreferences sp = getSharedPreferences("loginInfo",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit(); //获取编辑器
        //以用户名为key,密码为value保存到SharedPreferences
        editor.putString(userName,md5Psw);
        editor.apply();  //提交修改
    }
}

