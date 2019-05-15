package com.example.lianxidianshang.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lianxidianshang.R;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class SimpleHolder extends RecyclerView.ViewHolder {
public TextView textView;
public ImageView imageView;
    public SimpleHolder(View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.item_text);
        imageView=itemView.findViewById(R.id.item_image);
    }
}
