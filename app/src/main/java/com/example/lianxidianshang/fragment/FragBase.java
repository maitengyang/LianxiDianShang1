package com.example.lianxidianshang.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public  abstract class FragBase extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(initlayout(),container,false);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initview();
        initdata();
    }


    protected abstract int initlayout();

    protected abstract void initview();
    protected abstract void initdata();
    public <T extends View> T fvbi(int resid){
        return (T)getView().findViewById(resid);
    }

}
