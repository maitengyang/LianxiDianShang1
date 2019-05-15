package com.example.lianxidianshang.baseactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lianxidianshang.R;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public  abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initlayout());
        initview();
        initdata();
        initeven();
    }



    protected abstract int initlayout();
    protected abstract void initview();



    protected abstract void initdata();
    protected abstract void initeven();


}
