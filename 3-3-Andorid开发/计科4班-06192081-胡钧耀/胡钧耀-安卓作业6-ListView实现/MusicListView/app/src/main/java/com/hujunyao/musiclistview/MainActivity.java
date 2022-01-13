package com.hujunyao.musiclistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView myListView;
    private String[] names = {"500 Miles", "矿大欢迎你（群星）", "歌唱祖国", "红日", "路过人间", "理想不大", "无名之辈", "夜空中最亮的星"};
    private int[] icons = {R.drawable.fivehundreadmiles, R.drawable.cumt, R.drawable.gczg, R.drawable.hr, R.drawable.lgrj, R.drawable.lxbd, R.drawable.wmzb, R.drawable.ykzzldx};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = (ListView) findViewById(R.id.lv);
        MyBaseAdapter myAdapter = new MyBaseAdapter();
        myListView.setAdapter(myAdapter);
    }

    class MyBaseAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return names[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = View.inflate(MainActivity.this, R.layout.list_item,null);
            TextView myTextView = (TextView) view.findViewById(R.id.cd_info);
            myTextView.setText(names[position]);
            ImageView myImageView = (ImageView) view.findViewById(R.id.cd_image);
            myImageView.setBackgroundResource(icons[position]);
            return view;

        }
    }
}