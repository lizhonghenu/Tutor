package com.example.tutor_corner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import com.example.tutor_corner.adapter.Comment_ListView_Adapter;
import com.example.tutor_corner.entity.User;
import com.example.tutor_corner.entity.comment;
import com.example.tutor_corner.entityExtension.CommentAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

public class Main_comment_Activity extends AppCompatActivity implements View.OnClickListener{
    private ImageView thread_comment_image;//顶部图片
    private Button btn_comment_column1;//评分
    private Button btn_comment_column2;//态度
    private Button btn_comment_column3;//方法
    private Button btn_comment_column4;//能力
    private ListView listview_comment_list;
    private String username = "王萌萌";
    private Comment_ListView_Adapter adapter;
    private ArrayList<comment> adapterlist = new ArrayList<comment>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_comment_);
        Bmob.initialize(this,"5481350791dc09c72dc4c60930e8166d");/*初始化bmob*/
        FindViewById();
        setOnClickListener();
        FindAdapterList();
//        根据被评论者编号comment.commentedUserId(user.userId)获取list相关数据，登陆时候保存用户name和userId;
        adapter = new Comment_ListView_Adapter(this);
        listview_comment_list.setAdapter(adapter);
        adapter.addAllData(adapterlist);
    }
    private void FindViewById(){
        thread_comment_image = (ImageView) findViewById(R.id.thread_comment_image);
        btn_comment_column1 = (Button)findViewById(R.id.btn_comment_column1);
        btn_comment_column2 = (Button)findViewById(R.id.btn_comment_column2);
        btn_comment_column3 = (Button)findViewById(R.id.btn_comment_column3);
        btn_comment_column4 = (Button)findViewById(R.id.btn_comment_column4);
        listview_comment_list = (ListView)findViewById(R.id.listview_comment_list);
    }
    private void setOnClickListener(){
        btn_comment_column1.setOnClickListener(this);
        btn_comment_column2.setOnClickListener(this);
        btn_comment_column3.setOnClickListener(this);
        btn_comment_column4.setOnClickListener(this);
        /**
         * listview_comment_list点击跳转详细信息界面，携带参数commentAdapter对象；
         */
        listview_comment_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                comment comment = (comment) adapter.getItem(position);
                CommentAdapter commentAdapter = new CommentAdapter();
                commentAdapter.setCommentUserName(comment.getUserId().getUsername());
                commentAdapter.setImageUrl(comment.getUserId().getPicture().getFileUrl());
                commentAdapter.setAbilityScore(comment.getAbilityScore());
                commentAdapter.setAttitudeScore(comment.getAttitudeScore());
                commentAdapter.setUserId(comment.getUserId());
                commentAdapter.setInfoId(comment.getInfoId());
                commentAdapter.setContent(comment.getContent());
                commentAdapter.setMethodScore(comment.getMethodScore());
                commentAdapter.setEndDate(comment.getSubjectId().getEndDate());
                commentAdapter.setCommentIssueDate(comment.getIssueDate());
                commentAdapter.setSubjectId(comment.getSubjectId());
                commentAdapter.setInfoIssueDate(comment.getInfoId().getIssueDate());
                commentAdapter.setGrade(comment.getSubjectId().getGrade());
                commentAdapter.setSubjectName(comment.getSubjectId().getSubjectName());
                commentAdapter.setStartDate(comment.getSubjectId().getStartDate());
                commentAdapter.setSex(comment.getUserId().getSex());
                commentAdapter.setMobilephoneNumber(comment.getUserId().getMobilePhoneNumber());
                commentAdapter.setEducation(comment.getUserId().getEducation());
                commentAdapter.setArea(comment.getUserId().getArea());
                commentAdapter.setAge(comment.getUserId().getAge());
                commentAdapter.setSchool(comment.getUserId().getSchool());
                commentAdapter.setProfession(comment.getUserId().getProfession());
                commentAdapter.setEmail(comment.getUserId().getEmail());
                commentAdapter.setCmmentedUserName("家教："+ comment.getCommentedUserId().getUsername());
                Intent intent = new Intent(Main_comment_Activity.this,Main_comment_detail_Activity.class);
                intent.putExtra("commentAdapter",commentAdapter);
                startActivity(intent);
            }
        });

    }
    private void FindAdapterList(){
        BmobQuery<User>bmobQuery2 = new BmobQuery<>();
        bmobQuery2.addWhereEqualTo("username",username);
        bmobQuery2.findObjects(new FindListener<User>() {
            @Override
            public void done(List<User> list, BmobException e) {
                BmobQuery<comment> bmobQuery = new BmobQuery<comment>();
                bmobQuery.addWhereEqualTo("commentedUserId",list.get(0).getObjectId());//出家教者使用,别人对自己的评论,查看，不能修改
                bmobQuery.include("userId,infoId,subjectId,commentedUserId");
                bmobQuery.findObjects(new FindListener<comment>() {
                    @Override
                    public void done(List<comment> list, BmobException e) {
                        if (e==null){
                            for (int i=0;i<list.size();i++){
                                adapterlist.add(list.get(i));
                            }
                            adapter.addAllData(adapterlist);
                        }
                        else {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
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
