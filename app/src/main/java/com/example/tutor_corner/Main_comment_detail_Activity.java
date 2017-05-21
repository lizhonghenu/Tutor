package com.example.tutor_corner;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.tutor_corner.entityExtension.CommentAdapter;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

public class Main_comment_detail_Activity extends AppCompatActivity {
    private ImageView image_user;
    private ImageView attitude_star_1,attitude_star_2,attitude_star_3,attitude_star_4,attitude_star_5;
    private ImageView method_star_1,method_star_2,method_star_3,method_star_4,method_star_5;
    private ImageView ability_star_1,ability_star_2,ability_star_3,ability_star_4,ability_star_5;
    private ImageView attitude_smill,method_smill,ability_smill;
    private TextView content,commentIssueDate,commentUserName,sex,mobilePhoneNumber,education;
    private TextView area,age,school,profession,email,infoIssueDate,grade,subjectName,startDate,endDate;
    private TextView commentedUserName;
    private int attitudeScore,methodScore,abilityScore;
    CommentAdapter commentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_comment_detail_);
        findviewbyid();
        Intent intent = getIntent();//接收adapter传送过来的comment Adapter对象
        commentAdapter = (CommentAdapter) intent.getSerializableExtra("commentAdapter");
        setViewText();//设置各控件的内容
    }
    private void findviewbyid(){
        image_user = (ImageView) findViewById(R.id.comment_image_user);
        commentedUserName = (TextView) findViewById(R.id.comment_commentedUserName);
        attitude_star_1 = (ImageView) findViewById(R.id.attitude_star_1);
        attitude_star_2 = (ImageView) findViewById(R.id.attitude_star_2);
        attitude_star_3 = (ImageView) findViewById(R.id.attitude_star_3);
        attitude_star_4 = (ImageView) findViewById(R.id.attitude_star_4);
        attitude_star_5 = (ImageView) findViewById(R.id.attitude_star_5);
        method_star_1 = (ImageView) findViewById(R.id.method_star_1);
        method_star_2 = (ImageView) findViewById(R.id.method_star_2);
        method_star_3 = (ImageView) findViewById(R.id.method_star_3);
        method_star_4 = (ImageView) findViewById(R.id.method_star_4);
        method_star_5 = (ImageView) findViewById(R.id.method_star_5);
        ability_star_1 = (ImageView) findViewById(R.id.ability_star_1);
        ability_star_2 = (ImageView) findViewById(R.id.ability_star_2);
        ability_star_3 = (ImageView) findViewById(R.id.ability_star_3);
        ability_star_4 = (ImageView) findViewById(R.id.ability_star_4);
        ability_star_5 = (ImageView) findViewById(R.id.ability_star_5);
        attitude_smill = (ImageView)findViewById(R.id.attitude_smill);
        method_smill = (ImageView)findViewById(R.id.method_smill);
        ability_smill = (ImageView)findViewById(R.id.ability_smill);
        content = (TextView) findViewById(R.id.comment_content);
        commentIssueDate = (TextView) findViewById(R.id.comment_commentIssueDate);
        commentUserName = (TextView) findViewById(R.id.comment_commentUserName);
        sex = (TextView) findViewById(R.id.comment_sex);
        mobilePhoneNumber= (TextView) findViewById(R.id.comment_mobilephoneNumber);
        education = (TextView) findViewById(R.id.comment_education);
        area = (TextView) findViewById(R.id.comment_area);
        age = (TextView) findViewById(R.id.comment_age);
        school = (TextView) findViewById(R.id.comment_school);
        profession = (TextView) findViewById(R.id.comment_profession);
        email = (TextView) findViewById(R.id.comment_email);
        infoIssueDate = (TextView) findViewById(R.id.comment_infoIssueDate);
        grade = (TextView) findViewById(R.id.comment_grade);
        subjectName = (TextView) findViewById(R.id.comment_subjectName);
        startDate = (TextView) findViewById(R.id.comment_startDate);
        endDate = (TextView) findViewById(R.id.comment_endDate);
    }
    private void setViewText(){
        setTextView();
        setImageView();
    }
    private void setTextView(){
        content.setText(commentAdapter.getContent());
        commentIssueDate.setText("评论发布时间："+commentAdapter.getCommentIssueDate());
        commentUserName.setText(commentAdapter.getCommentUserName());
        sex.setText(commentAdapter.getSex());
        mobilePhoneNumber.setText(commentAdapter.getMobilephoneNumber());
        education.setText(commentAdapter.getEducation());
        area.setText(commentAdapter.getArea());
        age.setText(commentAdapter.getAge().toString());
        school.setText(commentAdapter.getSchool());
        profession.setText(commentAdapter.getProfession());
        email.setText(commentAdapter.getEmail());
        infoIssueDate.setText("家教发布时间："+commentAdapter.getInfoIssueDate().trim().toString());
        grade.setText(commentAdapter.getGrade());
        subjectName.setText(commentAdapter.getSubjectName());
        startDate.setText(commentAdapter.getStartDate());
        endDate.setText(commentAdapter.getEndDate());
        commentedUserName.setText(commentAdapter.getCmmentedUserName());
    }
    private void setImageView(){
        //评论者图像加载
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.ic_launcher)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();
        ImageLoader.getInstance().displayImage(commentAdapter.getImageUrl(),image_user,options);

        //态度得分
        attitudeScore = commentAdapter.getAttitudeScore();
        attitude_smill.setBackgroundResource(R.drawable.smill00);
        if (attitudeScore>0){
            attitude_star_1.setBackgroundResource(R.drawable.star);
            attitude_smill.setBackgroundResource(R.drawable.smill01);
            if (attitudeScore>2){
                attitude_star_2.setBackgroundResource(R.drawable.star);
                attitude_smill.setBackgroundResource(R.drawable.smill02);
                if (attitudeScore>4){
                    attitude_star_3.setBackgroundResource(R.drawable.star);
                    attitude_smill.setBackgroundResource(R.drawable.smill03);
                    if (attitudeScore>6){
                        attitude_star_4.setBackgroundResource(R.drawable.star);
                        attitude_smill.setBackgroundResource(R.drawable.smill04);
                        if (attitudeScore>8){
                            attitude_star_5.setBackgroundResource(R.drawable.star);
                            attitude_smill.setBackgroundResource(R.drawable.smill05);
                        }
                    }
                }
            }
        }
        //教学方法得分
        method_smill.setBackgroundResource(R.drawable.smill00);
        methodScore = commentAdapter.getMethodScore();
        if (methodScore>0){
            method_smill.setBackgroundResource(R.drawable.smill01);
            method_star_1.setBackgroundResource(R.drawable.star);
            if (methodScore>2){
                method_smill.setBackgroundResource(R.drawable.smill02);
                method_star_2.setBackgroundResource(R.drawable.star);
                if (methodScore>4){
                    method_smill.setBackgroundResource(R.drawable.smill03);
                    method_star_3.setBackgroundResource(R.drawable.star);
                    if (methodScore>6){
                        method_smill.setBackgroundResource(R.drawable.smill04);
                        method_star_4.setBackgroundResource(R.drawable.star);
                        if (methodScore>8){
                            method_smill.setBackgroundResource(R.drawable.smill05);
                            method_star_5.setBackgroundResource(R.drawable.star);
                        }
                    }
                }
            }
        }
        //个人能力得分
        abilityScore = commentAdapter.getAbilityScore();
        ability_smill.setBackgroundResource(R.drawable.smill00);
        if (abilityScore>0){
            ability_smill.setBackgroundResource(R.drawable.smill01);
            ability_star_1.setBackgroundResource(R.drawable.star);
            if (abilityScore>2){
                ability_smill.setBackgroundResource(R.drawable.smill02);
                ability_star_2.setBackgroundResource(R.drawable.star);
                if (abilityScore>4){
                    ability_smill.setBackgroundResource(R.drawable.smill03);
                    ability_star_3.setBackgroundResource(R.drawable.star);
                    if (abilityScore>6){
                        ability_smill.setBackgroundResource(R.drawable.smill04);
                        ability_star_4.setBackgroundResource(R.drawable.star);
                        if (abilityScore>8){
                            ability_smill.setBackgroundResource(R.drawable.smill05);
                            ability_star_5.setBackgroundResource(R.drawable.star);
                        }
                    }
                }
            }
        }
    }
}
