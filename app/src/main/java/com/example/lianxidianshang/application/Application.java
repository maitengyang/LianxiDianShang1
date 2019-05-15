package com.example.lianxidianshang.application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class Application extends android.app.Application {
    private static RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue=Volley.newRequestQueue(getApplicationContext());
    }
    public static RequestQueue requestQueue(){
        return requestQueue;
    }
}
