package com.example.internalfiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvTips = null;
    private EditText etWrite = null;
    private TextView tvRead = null;
    private Button btnRead = null;
    private Button btnWrite = null;
    private Switch switchAddMode = null;
    int mode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTips = (TextView) findViewById(R.id.tips);
        etWrite = (EditText) findViewById(R.id.inputEditText);
        tvRead = (TextView) findViewById(R.id.outputTextView);
        btnRead = (Button) findViewById(R.id.readFile);
        btnWrite = (Button) findViewById(R.id.writeFile);
        switchAddMode = (Switch) findViewById(R.id.addMode);

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readData();
            }
        });

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                writeData();
            }
        });

    }

    private void readData(){
        String data = FileSave.readData(this);
        String tip = "读取文件，长度为：" + data.length();
        int len = data.length();
        tvRead.setText(data);
        tvTips.setText(tip);
        Toast.makeText(MainActivity.this, "读取成功！", Toast.LENGTH_SHORT).show();

    }

    private void writeData(){
        String data = etWrite.getText().toString();

        if (switchAddMode.isChecked()) {
            FileSave.writeData(this,data, true);
            tvTips.setText("写入文件，方式为：追加");
            Toast.makeText(MainActivity.this, "追加写入成功！", Toast.LENGTH_SHORT).show();
        } else {
            FileSave.writeData(this,data,false);
            tvTips.setText("写入文件，方式为：覆盖");
            Toast.makeText(MainActivity.this, "覆盖写入成功！", Toast.LENGTH_SHORT).show();
        }
    }


}