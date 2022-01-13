package com.hujunyao.cumtorder.activity;

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

import androidx.appcompat.app.AppCompatActivity;

import com.hujunyao.cumtorder.R;
import com.hujunyao.cumtorder.utils.MD5Utils;


public class LoginActivity extends AppCompatActivity {

    private TextView tv_title;
    private TextView tv_back,tv_register,tv_find_psw;
    private Button btn_login;
    private String userName,psw,spPsw;
    private EditText et_user_name,et_psw;
    private RelativeLayout rl_rirle_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置页面布局
        setContentView(R.layout.activity_login);
        //设置界面为竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        init();
    }

    /**
     * 获取界面控件
     */
    private void init() {
        tv_title = (TextView)findViewById(R.id.tv_title);
        tv_title.setText("登录");
        tv_back = (TextView)findViewById(R.id.tv_back);
        tv_back.setVisibility(View.GONE);
        rl_rirle_bar = (RelativeLayout)findViewById(R.id.title_bar);
        rl_rirle_bar.setBackgroundColor(Color.TRANSPARENT);
        tv_register = (TextView)findViewById(R.id.tv_register);
        tv_find_psw = (TextView)findViewById(R.id.tv_find_psw);
        btn_login = (Button) findViewById(R.id.btn_login);
        et_user_name = (EditText)findViewById(R.id.et_user_name);
        et_psw = (EditText)findViewById(R.id.et_psw);

        //立即注册控件的点击事件
        tv_register.setOnClickListener(view -> {
            //跳转到注册界面
            Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
            startActivityForResult(intent,1);
        });

        //找回密码控件的点击事件
        tv_find_psw.setOnClickListener(v ->
                Toast.makeText(LoginActivity.this, "联系管理员吧，这儿弄不了", Toast.LENGTH_SHORT).show()
        );

        //登录按钮的点击事件
        btn_login.setOnClickListener(view -> {
            userName = et_user_name.getText().toString().trim();
            psw = et_psw.getText().toString().trim();
            String md5Psw = MD5Utils.md5(psw);
            spPsw = readPsw(userName);
            //如果用户名为空
            if (TextUtils.isEmpty(userName)){
                Toast.makeText(LoginActivity.this,"请输入用户名",Toast.LENGTH_LONG).show();
            }else  if (TextUtils.isEmpty(psw)){  //如果密码为空
                Toast.makeText(LoginActivity.this,"请输入密码",Toast.LENGTH_LONG).show();
            }else if (md5Psw.equals(spPsw)){
                Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                //保存登录状态和登录的用户名
                saveLoginStatus(true,userName);
                //把登录成功的状态传递到MainActivity中
                Intent intent = new Intent(LoginActivity.this, ShopActivity.class);
                LoginActivity.this.finish();
                startActivity(intent);

            }else if (!TextUtils.isEmpty(spPsw) && !md5Psw.equals(spPsw)){
                Toast.makeText(LoginActivity.this,"输入的用户名和密码不一致",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(LoginActivity.this,"此用户名不存在",Toast.LENGTH_LONG).show();
            }
        });
    }

    /*
     * 从SharedPreferences根据用户名获取密码
     */
    private String readPsw(String userName){
        SharedPreferences sp = getSharedPreferences("loginInfo",MODE_PRIVATE);
        return  sp.getString(userName,"");
    }

    /*
     * 保存登录状态和登录用户名到SharedPreferences中
     */
    private void saveLoginStatus(boolean status, String userName) {
        SharedPreferences sp = getSharedPreferences("loginInfo",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit(); //获取编辑器
        editor.putBoolean("isLogin",status);
        editor.putString("loginUserName",userName);  //保存登录的用户名
        editor.commit(); //提交修改
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data!=null){
            //从注册界面传递过来的用户名
            String userName = data.getStringExtra("userName");
            if (!TextUtils.isEmpty(userName)){
                et_user_name.setText(userName);
                //设置光标的位置
                et_user_name.setSelection(userName.length());
            }
        }
    }
}

