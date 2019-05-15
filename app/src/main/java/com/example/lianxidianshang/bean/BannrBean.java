package com.example.lianxidianshang.bean;

import java.util.List;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class BannrBean {

    public String message;
    public String status;
    public List<Item> result;

    public static class Item {
        public String imageUrl;
        public String jumpUrl;
        public int rank;
        public String title;
    }

}
