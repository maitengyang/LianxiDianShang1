package com.example.lianxidianshang.mvp.presenter;

import android.view.View;

import com.example.lianxidianshang.net.NetCallBack;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public interface Contract {
    public interface ContractView{
        void showList(String s);
    }
    public interface ContractModel{
        void requestDataM(String urlM, NetCallBack netCallBack);
    }
    public interface ContractPresenter{
        void onattch(Contract.ContractView view);
        void onvindth();
        void requestData(String urlM);
    }
}
