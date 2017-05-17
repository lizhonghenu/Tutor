package com.example.tutor_corner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.tutor_corner.adapter.Comment_ListView_Adapter;

public class Main_comment_Activity extends AppCompatActivity implements View.OnClickListener{
    private ImageView thread_comment_image;//顶部图片
    private Button btn_comment_column1;//评分
    private Button btn_comment_column2;//态度
    private Button btn_comment_column3;//方法
    private Button btn_comment_column4;//能力
    private ListView listview_comment_list;
    private Comment_ListView_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_comment_);
        thread_comment_image = (ImageView) findViewById(R.id.thread_comment_image);
        btn_comment_column1 = (Button)findViewById(R.id.btn_comment_column1);
        btn_comment_column2 = (Button)findViewById(R.id.btn_comment_column2);
        btn_comment_column3 = (Button)findViewById(R.id.btn_comment_column3);
        btn_comment_column4 = (Button)findViewById(R.id.btn_comment_column4);
        listview_comment_list = (ListView)findViewById(R.id.listview_comment_list);
        btn_comment_column1.setOnClickListener(this);
        btn_comment_column2.setOnClickListener(this);
        btn_comment_column3.setOnClickListener(this);
        btn_comment_column4.setOnClickListener(this);
        adapter = new Comment_ListView_Adapter(this);
    }

    @Override
    public void onClick(View v) {
//        评分
        if(v.getId()==R.id.btn_comment_column1){

        }
//        态度
        else if (v.getId()==R.id.btn_comment_column2){

        }
//        方法
        else if (v.getId()==R.id.btn_comment_column3){

        }
//        能力
        else if(v.getId()==R.id.btn_comment_column4){

        }
    }
}
