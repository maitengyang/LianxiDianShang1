package com.example.lianxidianshang.mvp.presenter;

import android.view.View;

import com.example.lianxidianshang.mvp.model.IHomeModel;
import com.example.lianxidianshang.net.NetCallBack;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class IHomePresenter implements Contract.ContractPresenter {
    private Contract.ContractView contractView;
    private Contract.ContractModel contractModel;


    @Override
    public void onattch(Contract.ContractView view) {
        contractModel=new IHomeModel();
        this.contractView=view;
    }

    @Override
    public void onvindth() {
        if (contractView!=null){
            contractView=null;
        }
        if (contractModel!=null){
            contractModel=null;
        }
    }

    @Override
    public void requestData(String urlM) {
        contractModel.requestDataM(urlM, new NetCallBack() {
            @Override
            public void onSuccess(String s) {
                contractView.showList(s);
            }

            @Override
            public void onFail(String message) {

            }
        });
    }

}
