package com.example.lianxidianshang.net;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.lianxidianshang.application.Application;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class HttpUtil {
    private static final HttpUtil ourInstance = new HttpUtil();

    public static HttpUtil getInstance() {
        return ourInstance;
    }

    private HttpUtil() {
    }
    public void doHttpGet(String urlM, final NetCallBack netCallBack){
        StringRequest stringRequest=new StringRequest(Request.Method.GET, urlM, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                netCallBack.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                netCallBack.onFail(error.getMessage());
            }
        });
        Application.requestQueue().add(stringRequest);
    }
}
