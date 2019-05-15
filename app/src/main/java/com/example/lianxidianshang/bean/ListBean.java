package com.example.lianxidianshang.bean;

import java.util.List;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class ListBean {
    public String message;
    public String status;
    public Results result;

    public static class Results {

        public Commodity mlss;
        public Commodity pzsh;
        public Commodity rxxp;
    }

    public static class Commodity {
        public List<Item> commodityList;
        public int id;
        public String name;
    }

    public static class Item {
        public String commodityName;
        public int commodityId;
        public String masterPic;
        public String price;
        public String saleNum;
    }

}
