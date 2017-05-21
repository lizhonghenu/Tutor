package com.example.tutor_corner;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.tutor_corner.entity.User;
import com.example.tutor_corner.entity.comment;
import com.example.tutor_corner.entity.info;
import com.example.tutor_corner.entity.subject;
import com.example.tutor_corner.entityExtension.CommentAdapter;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import java.util.List;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.UpdateListener;

public class Main_admincomment_detail_Activity extends AppCompatActivity implements View.OnClickListener{
    private CommentAdapter commentAdapter1;
    private ImageView commented_image;
    private ImageView attitude_star_1,attitude_star_2,attitude_star_3,attitude_star_4,attitude_star_5;
    private ImageView method_star_1,method_star_2,method_star_3,method_star_4,method_star_5;
    private ImageView ability_star_1,ability_star_2,ability_star_3,ability_star_4,ability_star_5;
    private ImageView attitude_smill,method_smill,ability_smill;
    private TextView comment_commentIssueDate,commentUserName,commented_Sex,commented_mobilePhoneNumber,commented_education,comment_Commentedusername;
    private TextView commented_area,commented_age,commented_school,commented_profession,commented_email,comment_infoIssueDate,commented_grade,commented_subjectName,commented_startDate,commented_endDate;
    private Button update_comment,delete_comment;
    private EditText comment_content;
    private TextView text_attitudeScore,text_methodScore,text_abilityScore;
    private int attitudeScore,methodScore,abilityScore;
    private User userId,commentedUserId;
    private subject subjectId;
    private info infoId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admincomment_detail_);
        Intent intent = getIntent();//接收adapter传送过来的comment Adapter对象
        commentAdapter1 = (CommentAdapter) intent.getSerializableExtra("comment");
        FindViewById();
        SetViewText();
        initOnClickListener();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.update_comment:
                BmobQuery<comment> bmobQuery1 = new BmobQuery<comment>();
                bmobQuery1.addWhereEqualTo("userId",userId);
                bmobQuery1.addWhereEqualTo("infoId",infoId);
                bmobQuery1.addWhereEqualTo("subjectId",subjectId);
                bmobQuery1.addWhereEqualTo("commentedUserId",commentedUserId);
                bmobQuery1.findObjects(new FindListener<comment>() {
                    @Override
                    public void done(List<comment> list, BmobException e) {
                        if (e==null){
                            comment commentUpDate = new comment();
                            commentUpDate.setMethodScore(Integer.parseInt(text_methodScore.getText().toString()));
                            commentUpDate.setAbilityScore(Integer.parseInt(text_abilityScore.getText().toString()));
                            commentUpDate.setAttitudeScore(Integer.parseInt(text_attitudeScore.getText().toString()));
                            commentUpDate.setContent(comment_content.getText().toString());
                            commentUpDate.update(list.get(0).getObjectId(), new UpdateListener() {
                                @Override
                                public void done(BmobException e) {
                                    if (e==null){
                                        Toast.makeText(Main_admincomment_detail_Activity.this,"修改成功",Toast.LENGTH_SHORT).show();
                                    }
                                    else {
                                        Toast.makeText(Main_admincomment_detail_Activity.this,"修改失败",Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }
                    }
                });

                break;
            case R.id.delete_comment:
                BmobQuery<comment> bmobQuery2 = new BmobQuery<comment>();
                bmobQuery2.addWhereEqualTo("userId",userId);
                bmobQuery2.addWhereEqualTo("infoId",infoId);
                bmobQuery2.addWhereEqualTo("subjectId",subjectId);
                bmobQuery2.addWhereEqualTo("commentedUserId",commentedUserId);
                bmobQuery2.findObjects(new FindListener<comment>() {
                    @Override
                    public void done(List<comment> list, BmobException e) {
                        if (e==null){
                            comment commentDelete = new comment();
                            for (int i=0;i<list.size();i++){
                                commentDelete.setObjectId(list.get(i).getObjectId());
                                commentDelete.delete(new UpdateListener() {
                                    @Override
                                    public void done(BmobException e) {
                                        if (e==null){
                                        Toast.makeText(Main_admincomment_detail_Activity.this,"删除成功",Toast.LENGTH_SHORT).show();
                                    }
                                    else {
                                        Toast.makeText(Main_admincomment_detail_Activity.this,"删除失败",Toast.LENGTH_SHORT).show();
                                    }
                                    }
                                });
                            }
                        }
                    }
                });

                break;
            case R.id.ability_star_1:

                break;
            case R.id.ability_star_2:

                break;
            case R.id.ability_star_3:

                break;
            case R.id.ability_star_4:

                break;
            case R.id.ability_star_5:

                break;
            case R.id.attitude_star_1:

                break;
            case R.id.attitude_star_2:

                break;
            case R.id.attitude_star_3:

                break;
            case R.id.attitude_star_4:

                break;
            case R.id.attitude_star_5:

                break;
            case R.id.method_star_1:

                break;
            case R.id.method_star_2:

                break;
            case R.id.method_star_3:

                break;
            case R.id.method_star_4:

                break;
            case R.id.method_star_5:

                break;
            default:
                break;
        }
    }
    private void FindViewById(){
        commented_image = (ImageView) findViewById(R.id.commented_image);
        comment_Commentedusername = (TextView) findViewById(R.id.comment_commentedUserName);
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

        update_comment = (Button) findViewById(R.id.update_comment);
        delete_comment = (Button) findViewById(R.id.delete_comment);

        comment_content = (EditText) findViewById(R.id.comment_content);
        comment_commentIssueDate = (TextView) findViewById(R.id.comment_commentIssueDate);
        commentUserName = (TextView) findViewById(R.id.comment_commentUserName);
        commented_Sex = (TextView) findViewById(R.id.comment_sex);
        commented_mobilePhoneNumber= (TextView) findViewById(R.id.comment_mobilephoneNumber);
        commented_education = (TextView) findViewById(R.id.comment_education);
        commented_area = (TextView) findViewById(R.id.comment_area);
        commented_age = (TextView) findViewById(R.id.comment_age);
        commented_school = (TextView) findViewById(R.id.comment_school);
        commented_profession = (TextView) findViewById(R.id.comment_profession);
        commented_email = (TextView) findViewById(R.id.comment_email);
        comment_infoIssueDate = (TextView) findViewById(R.id.comment_infoIssueDate);
        commented_grade = (TextView) findViewById(R.id.comment_grade);
        commented_subjectName = (TextView) findViewById(R.id.comment_subjectName);
        commented_startDate = (TextView) findViewById(R.id.comment_startDate);
        commented_endDate = (TextView) findViewById(R.id.comment_endDate);
        text_attitudeScore = (TextView)findViewById(R.id.attitude_score);
        text_abilityScore= (TextView)findViewById(R.id.ability_score);
        text_methodScore = (TextView)findViewById(R.id.method_score);
    }
    private void SetViewText(){
        SetImageView();
        SetTextView();
    }//设置控件内容
    private void SetTextView(){
        userId = commentAdapter1.getUserId();
        commentedUserId = commentAdapter1.getCommentedUserId();
        subjectId = commentAdapter1.getSubjectId();
        infoId = commentAdapter1.getInfoId();
        comment_content.setText(commentAdapter1.getContent());
        comment_commentIssueDate.setText(commentAdapter1.getCommentIssueDate());
        commentUserName.setText(commentAdapter1.getCommentUserName());
        comment_Commentedusername.setText(commentAdapter1.getCmmentedUserName());
        commented_Sex.setText(commentAdapter1.getSex());
        commented_mobilePhoneNumber.setText(commentAdapter1.getMobilephoneNumber());
        commented_education.setText(commentAdapter1.getEducation());
        commented_area.setText(commentAdapter1.getArea());
        commented_age.setText(commentAdapter1.getAge());
        commented_school.setText(commentAdapter1.getSchool());
        commented_profession.setText(commentAdapter1.getProfession());
        commented_email.setText(commentAdapter1.getEmail());
        comment_infoIssueDate.setText(commentAdapter1.getInfoIssueDate());
        commented_grade.setText(commentAdapter1.getGrade());
        commented_subjectName.setText(commentAdapter1.getSubjectName());
        commented_startDate.setText(commentAdapter1.getStartDate());
        commented_endDate.setText(commentAdapter1.getEndDate());
        text_attitudeScore.setText(commentAdapter1.getAttitudeScore());
        text_abilityScore.setText(commentAdapter1.getAbilityScore());
        text_methodScore.setText(commentAdapter1.getMethodScore());
        abilityScore = commentAdapter1.getAbilityScore();
        attitudeScore = commentAdapter1.getAttitudeScore();
        methodScore = commentAdapter1.getMethodScore();
    }
    private void SetImageView(){
        //评论者图像加载
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.ic_launcher)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();
        ImageLoader.getInstance().displayImage(commentAdapter1.getImageUrl(),commented_image,options);

        //态度得分
        attitudeScore = commentAdapter1.getAttitudeScore();
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
        methodScore = commentAdapter1.getMethodScore();
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
        abilityScore = commentAdapter1.getAbilityScore();
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
    private void initOnClickListener(){
        update_comment.setOnClickListener(this);
        delete_comment.setOnClickListener(this);
        attitude_star_1.setOnClickListener(this);
        attitude_star_2.setOnClickListener(this);
        attitude_star_3.setOnClickListener(this);
        attitude_star_4.setOnClickListener(this);
        attitude_star_5.setOnClickListener(this);
        method_star_1.setOnClickListener(this);
        method_star_2.setOnClickListener(this);
        method_star_3.setOnClickListener(this);
        method_star_4.setOnClickListener(this);
        method_star_5.setOnClickListener(this);
        ability_star_1.setOnClickListener(this);
        ability_star_2.setOnClickListener(this);
        ability_star_3.setOnClickListener(this);
        ability_star_4.setOnClickListener(this);
        ability_star_5.setOnClickListener(this);

    }


}
