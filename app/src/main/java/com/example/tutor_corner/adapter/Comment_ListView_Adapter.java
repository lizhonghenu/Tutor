package com.example.tutor_corner.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.tutor_corner.Main_comment_Activity;
import com.example.tutor_corner.R;

import com.example.tutor_corner.entity.comment;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.DownloadFileListener;
import cn.bmob.v3.listener.FindListener;

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
        final viewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_main_comment_inflater, null);
            holder = new viewHolder();
            holder.user = (ImageView) convertView.findViewById(R.id.image_comment_user);
            holder.content = (TextView) convertView.findViewById(R.id.text_comment_content);
            holder.issueDate = (TextView) convertView.findViewById(R.id.text_comment_issueDate);
            holder.issuer = (TextView) convertView.findViewById(R.id.text_comment_issuer);
            holder.title = (TextView) convertView.findViewById(R.id.text_comment_title);
            convertView.setTag(holder);
//            图片未加载
        } else {
            holder = (viewHolder) convertView.getTag();
        }
        comment comment = list.get(position);
        String username = comment.getUserId().getUsername();
        String imageUrl = comment.getUserId().getPicture().getFileUrl();
        if (imageUrl != null) {
            DisplayImageOptions options = new DisplayImageOptions.Builder()
                    .showImageOnLoading(R.mipmap.ic_launcher)
                    .showImageOnFail(R.mipmap.ic_launcher)
                    .cacheInMemory(true)
                    .cacheOnDisk(true)
                    .bitmapConfig(Bitmap.Config.RGB_565)
                    .build();
            ImageLoader.getInstance().displayImage(imageUrl, holder.user, options);
            holder.issuer.setText(username);
            holder.title.setText(comment.getSubjectId().getSubjectName() + " " + comment.getSubjectId().getGrade());
            holder.content.setText(comment.getContent());
            holder.issueDate.setText(comment.getIssueDate());
        }
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
