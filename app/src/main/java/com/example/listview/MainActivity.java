package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lv_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_list=findViewById(R.id.lv_list);
        //准备集合数据
        String[] data={"a1","a2","a3","a4","a5","a6","a7"};
        //准备ArrayAdapter对象
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.test,data);
        //设置adapter显示列表
        lv_list.setAdapter(adapter);
    }

    private void initView() {

    }
}
