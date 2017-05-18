package com.example.tutor_corner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tutor_corner.R;
import com.example.tutor_corner.entity.comment;
import com.example.tutor_corner.entityExtension.CommentAdapter;

import java.util.ArrayList;

/**
 * Created by 李钟 on 2017/5/16.
 */

public class Comment_ListView_Adapter extends BaseAdapter{
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<comment> list = new ArrayList<comment>();
    public Comment_ListView_Adapter(Context context){
        this.context = context;
        inflater =  LayoutInflater.from(context);
    }
    public ArrayList<comment> getListAll(){
        return list;
    }
    public void addAllData(ArrayList<comment> arrayList){
        list.addAll(arrayList);
        notifyDataSetChanged();
    }
    public void addData(){

    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
        if (convertView==null){
            convertView = inflater.inflate(R.layout.activity_main_comment_inflater,null);
            holder = new viewHolder();
            holder.user = (ImageView)convertView.findViewById(R.id.image_comment_user);
            holder.content = (TextView)convertView.findViewById(R.id.text_comment_content);
            holder.issueDate = (TextView)convertView.findViewById(R.id.text_comment_issueDate);
            holder.issuer = (TextView)convertView.findViewById(R.id.text_comment_issuer);
            holder.title = (TextView)convertView.findViewById(R.id.text_comment_title);
            convertView.setTag(holder);
//            图片未加载
        }
        else {
            holder = (viewHolder)convertView.getTag();
        }
        //final CommentAdapter commentAdapter = list.get(position);
        comment comment = list.get(position);
        holder.issuer.setText(comment.getUserId().getUsername());
        holder.title.setText(comment.getSubjectId().getSubjectName()+" "+comment.getSubjectId().getGrade());
        holder.content.setText(comment.getContent());
        holder.issueDate.setText(comment.getIssueDate());
//        图片未设置
        return convertView;
    }
    class viewHolder{
        ImageView user = null;
        TextView title = null;
        TextView content = null;
        TextView issueDate = null;
        TextView issuer = null;
    }
}
