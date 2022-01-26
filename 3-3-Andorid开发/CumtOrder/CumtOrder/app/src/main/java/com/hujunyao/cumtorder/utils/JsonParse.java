package com.hujunyao.cumtorder.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hujunyao.cumtorder.bean.ShopBean;

import java.lang.reflect.Type;
import java.util.List;

public class JsonParse {
    private static JsonParse instance;
    //构造方法私有化，让别人没办法new
    private JsonParse() {}
    //单例模式
    public static JsonParse getInstance() {
        if (instance == null) {
            instance = new JsonParse();
        }
        return instance;
    }
    public List<ShopBean> getShopList(String json) {
        // 创建一个TypeToken的匿名子类对象，并调用对象的getType()方法
        Type listType = new TypeToken<List<ShopBean>>() {}.getType();
        Gson gson = new Gson(); // 使用gson库解析JSON数据
        // 把获取到的信息集合存到shopList中
        List<ShopBean> shopList = gson.fromJson(json, listType);
        return shopList;
    }
}
