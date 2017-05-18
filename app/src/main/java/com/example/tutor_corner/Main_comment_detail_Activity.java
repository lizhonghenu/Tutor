package com.example.tutor_corner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tutor_corner.entityExtension.CommentAdapter;

public class Main_comment_detail_Activity extends AppCompatActivity {
    TextView text_comment_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_comment_detail_);
        text_comment_detail = (TextView) findViewById(R.id.text_comment_detail);
        Intent intent = getIntent();
        CommentAdapter commentAdapter = (CommentAdapter) intent.getSerializableExtra("commentAdapter");
//        分配commentadapter对象信息到activity_main_comment_detail界面上

        text_comment_detail.setText(commentAdapter.getContent()+"---"+commentAdapter.getGrade());


    }
}
