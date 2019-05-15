package com.example.lianxidianshang.mvp.model;

import com.example.lianxidianshang.mvp.presenter.Contract;
import com.example.lianxidianshang.net.HttpUtil;
import com.example.lianxidianshang.net.NetCallBack;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class IHomeModel implements Contract.ContractModel {
    private HttpUtil httpUtil;
    public IHomeModel(){
        httpUtil=HttpUtil.getInstance();
    }


    @Override
    public void requestDataM(String urlM, NetCallBack netCallBack) {
        httpUtil.doHttpGet(urlM,netCallBack);
    }
}
