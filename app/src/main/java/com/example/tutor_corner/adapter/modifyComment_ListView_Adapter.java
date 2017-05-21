package com.example.tutor_corner.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tutor_corner.R;
import com.example.tutor_corner.entity.comment;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

/**
 * Created by 李钟 on 2017/5/20.
 */

public class modifyComment_ListView_Adapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<comment> list = new ArrayList<comment>();
    public modifyComment_ListView_Adapter(Context context){
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
        final viewHolder1 holder1;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_main_comment_inflater, null);
            holder1 = new viewHolder1();
            holder1.user = (ImageView) convertView.findViewById(R.id.image_comment_user);
            holder1.content = (TextView) convertView.findViewById(R.id.text_comment_content);
            holder1.issueDate = (TextView) convertView.findViewById(R.id.text_comment_issueDate);
            holder1.issuer = (TextView) convertView.findViewById(R.id.text_comment_issuer);
            holder1.title = (TextView) convertView.findViewById(R.id.text_comment_title);
            convertView.setTag(holder1);
//            图片未加载
        } else {
            holder1 = (modifyComment_ListView_Adapter.viewHolder1) convertView.getTag();
        }
        comment comment = list.get(position);
        String username = comment.getUserId().getUsername();
        String imageUrl = comment.getCommentedUserId().getPicture().getFileUrl();
        if (imageUrl != null) {
            DisplayImageOptions options = new DisplayImageOptions.Builder()
                    .showImageOnLoading(R.mipmap.ic_launcher)
                    .showImageOnFail(R.mipmap.ic_launcher)
                    .cacheInMemory(true)
                    .cacheOnDisk(true)
                    .bitmapConfig(Bitmap.Config.RGB_565)
                    .build();
            ImageLoader.getInstance().displayImage(imageUrl, holder1.user, options);
            holder1.issuer.setText(username);
            holder1.title.setText(comment.getSubjectId().getSubjectName() + " " + comment.getSubjectId().getGrade());
            holder1.content.setText(comment.getContent());
            holder1.issueDate.setText(comment.getIssueDate());
        }
        return convertView;
    }
    class viewHolder1{
        ImageView user = null;
        TextView title = null;
        TextView content = null;
        TextView issueDate = null;
        TextView issuer = null;
    }
}
