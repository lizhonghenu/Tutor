package com.example.tutor_corner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.tutor_corner.adapter.modifyComment_ListView_Adapter;
import com.example.tutor_corner.entity.User;
import com.example.tutor_corner.entity.comment;
import com.example.tutor_corner.entityExtension.CommentAdapter;

import java.util.ArrayList;
import java.util.List;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

public class Main_admincomment_Activity extends AppCompatActivity {
    private ListView adminComment_ListView;
    private ArrayList<comment> adminadapterlist = new ArrayList<comment>();
    private modifyComment_ListView_Adapter adapter;
    private String username = "王萌萌";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admincomment_);
        Bmob.initialize(this,"5481350791dc09c72dc4c60930e8166d");/*初始化bmob*/
        adminComment_ListView = (ListView) findViewById(R.id.adminComment_ListView);
//        根据被评论者编号comment.commentedUserId(user.userId)获取list相关数据，登陆时候保存用户name和userId;
        adapter = new modifyComment_ListView_Adapter(this);
        adminComment_ListView.setAdapter(adapter);
        adapter.addAllData(adminadapterlist);
        FindAdapterListView();
        setOnClickListener();
    }
    private void setOnClickListener(){
        adminComment_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                comment comment = (comment) adapter.getItem(position);
                CommentAdapter commentAdapter = new CommentAdapter();
                commentAdapter.setCommentUserName(comment.getUserId().getUsername());
                commentAdapter.setImageUrl(comment.getCommentedUserId().getPicture().getFileUrl());
                commentAdapter.setAbilityScore(comment.getAbilityScore());
                commentAdapter.setAttitudeScore(comment.getAttitudeScore());
                commentAdapter.setUserId(comment.getUserId());
                commentAdapter.setInfoId(comment.getInfoId());
                commentAdapter.setCommentedUserId(comment.getCommentedUserId());
                commentAdapter.setContent(comment.getContent());
                commentAdapter.setMethodScore(comment.getMethodScore());
                commentAdapter.setEndDate(comment.getSubjectId().getEndDate());
                commentAdapter.setCommentIssueDate(comment.getIssueDate());
                commentAdapter.setSubjectId(comment.getSubjectId());
                commentAdapter.setInfoIssueDate(comment.getInfoId().getIssueDate());
                commentAdapter.setGrade(comment.getSubjectId().getGrade());
                commentAdapter.setSubjectName(comment.getSubjectId().getSubjectName());
                commentAdapter.setStartDate(comment.getSubjectId().getStartDate());
                commentAdapter.setSex(comment.getCommentedUserId().getSex());
                commentAdapter.setMobilephoneNumber(comment.getCommentedUserId().getMobilePhoneNumber());
                commentAdapter.setEducation(comment.getCommentedUserId().getEducation());
                commentAdapter.setArea(comment.getCommentedUserId().getArea());
                commentAdapter.setAge(comment.getCommentedUserId().getAge());
                commentAdapter.setSchool(comment.getCommentedUserId().getSchool());
                commentAdapter.setProfession(comment.getCommentedUserId().getProfession());
                commentAdapter.setEmail(comment.getCommentedUserId().getEmail());
                commentAdapter.setCmmentedUserName(comment.getCommentedUserId().getUsername());
                Intent intent = new Intent(Main_admincomment_Activity.this,Main_admincomment_detail_Activity.class);
                intent.putExtra("comment",commentAdapter);
                startActivity(intent);
            }
        });
    }
    private void FindAdapterListView(){
        BmobQuery<User> bmobQueryUser = new BmobQuery<>();
        bmobQueryUser.addWhereEqualTo("username",username);
        bmobQueryUser.findObjects(new FindListener<User>() {
            @Override
            public void done(List<User> list, BmobException e) {
                if (e==null){
                    BmobQuery<comment> bmobQuery = new BmobQuery<comment>();
                    bmobQuery.addWhereEqualTo("userId",list.get(0).getObjectId());//请家教者使用
                    bmobQuery.include("userId,infoId,subjectId,commentedUserId");
                    bmobQuery.findObjects(new FindListener<comment>() {
                        @Override
                        public void done(List<comment> list, BmobException e) {
                            if (e==null){
                                for (int i=0;i<list.size();i++){
                                    adminadapterlist.add(list.get(i));
                                }
                                adapter.addAllData(adminadapterlist);
                            }
                            else {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }
        });
    }
}
