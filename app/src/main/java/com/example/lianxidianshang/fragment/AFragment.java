package com.example.lianxidianshang.fragment;

import android.support.v7.widget.RecyclerView;

import com.example.lianxidianshang.R;
import com.example.lianxidianshang.bean.ListBean;
import com.example.lianxidianshang.mvp.presenter.Contract;
import com.example.lianxidianshang.mvp.presenter.IHomePresenter;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class AFragment extends FragBase implements Contract.ContractView {
    private String urlM="http://172.17.8.100/small/commodity/v1/commodityList";
    private Contract.ContractPresenter contractPresenter;
    private RecyclerView recyclerView;


    @Override
    protected int initlayout() {
        return R.layout.homepage;
    }

    @Override
    protected void initview() {
        recyclerView=fvbi(R.id.frag_recy);
        contractPresenter=new IHomePresenter();
         contractPresenter.onattch(this);
         contractPresenter.requestData(urlM);
    }

    @Override
    protected void initdata() {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        contractPresenter.onvindth();
    }

    @Override
    public void showList(String s) {
        Gson gson = new Gson();
        ListBean bean = gson.fromJson(s, ListBean.class);

    }
}
