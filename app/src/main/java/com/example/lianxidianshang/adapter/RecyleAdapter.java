package com.example.lianxidianshang.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.lianxidianshang.R;
import com.example.lianxidianshang.bean.ListBean;
import com.example.lianxidianshang.holder.SimpleHolder;

import java.util.List;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class RecyleAdapter extends RecyclerView.Adapter<SimpleHolder> {
private Context context;
private List<ListBean.Item> list;

    public RecyleAdapter(Context context, List<ListBean.Item> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public SimpleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        return new SimpleHolder(inflater.inflate(R.layout.recyle_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleHolder holder, int position) {
        holder.textView.setText(list.get(position).commodityName);
        Glide.with(context).load(list.get(position).masterPic).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
