package com.example.tutor_corner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.tutor_corner.entityExtension.CommentAdapter;

import java.util.ArrayList;

/**
 * Created by 李钟 on 2017/5/16.
 */

public class Comment_ListView_Adapter extends BaseAdapter{
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<CommentAdapter> list = new ArrayList<CommentAdapter>();
    public Comment_ListView_Adapter(Context context){
        this.context = context;
        inflater =  LayoutInflater.from(context);
    }
    public ArrayList<CommentAdapter> getListAll(){
        return list;
    }
    public void addAllData(ArrayList arrayList){
        list.addAll(arrayList);
        notifyDataSetChanged();
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

        return null;
    }
}
