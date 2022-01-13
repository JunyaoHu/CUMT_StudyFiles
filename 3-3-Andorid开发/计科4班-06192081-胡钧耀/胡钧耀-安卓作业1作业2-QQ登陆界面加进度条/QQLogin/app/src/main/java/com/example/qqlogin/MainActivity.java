package com.example.qqlogin;

import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button loginBtn = null;
    private TextView phoneLogin = null;
    private TextView forgetPassword = null;
    private TextView newUser = null;
    int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneLogin = (TextView) findViewById(R.id.phoneLogin);
        forgetPassword = (TextView) findViewById(R.id.forgetPassword);
        newUser = (TextView) findViewById(R.id.signUp);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        phoneLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://jingyan.baidu.com/article/358570f69c701dce4724fc8e.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://aq.qq.com/v2/uv_aq/html/reset_pwd/pc_reset_pwd_input_account.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://ssl.zc.qq.com/v3/index-chs.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                ProgressDialog loginDialog;
                loginDialog = new ProgressDialog(MainActivity.this);
                loginDialog.setTitle("登录中");
                loginDialog.setMessage("正在登陆，请稍后...");
                loginDialog.setIcon(R.drawable.icon1);
                loginDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                loginDialog.setProgress(0);
                loginDialog.show();
                new Thread() {
                    public void run() {
                        try {
                            while (count <= 100) {
                                // 由线程来控制进度。
                                loginDialog.setProgress(count);
                                Random rand = new Random();
                                count += rand.nextInt(15); // 模拟，每次增加1%-15%
                                Thread.sleep(100);
                            }
                            loginDialog.cancel();
                            Looper.prepare();
                            Toast.makeText(MainActivity.this, "登陆成功！", Toast.LENGTH_SHORT).show();
                            Looper.loop();
                        }
                        catch (InterruptedException e) {
                            loginDialog.cancel();
                        }
                    }
                }.start();
            }
        });
    }
}