package com.example.lianxidianshang;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lianxidianshang.adapter.MyBase;
import com.example.lianxidianshang.baseactivity.BaseActivity;
import com.example.lianxidianshang.fragment.AFragment;
import com.example.lianxidianshang.fragment.BFragment;
import com.example.lianxidianshang.fragment.CFragment;
import com.example.lianxidianshang.fragment.DFragment;
import com.example.lianxidianshang.fragment.EFragment;
import com.example.lianxidianshang.mvp.presenter.Contract;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements Contract.ContractView{
private ViewPager viewPager;
private TabLayout tabLayout;
private List<Fragment> list;
private Contract.ContractPresenter contractPresenter;
private String[] title={"首页","发现","购物车","购买记录","我的钱包"};
    private MyBase myBase;

    @Override
    protected int initlayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initview() {
        //获取资源ID
        viewPager=findViewById(R.id.main_viewpager);
        tabLayout=findViewById(R.id.main_tab);

    }

    @Override
    protected void initdata() {
        list=new ArrayList<>();
        list.add(new AFragment());
        list.add(new BFragment());
        list.add(new CFragment());
        list.add(new DFragment());
        list.add(new EFragment());
        myBase = new MyBase(getSupportFragmentManager(),title,list);
        viewPager.setAdapter(myBase);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void initeven() {

    }

    @Override
    public void showList(String s) {

    }
}
