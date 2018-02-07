package com.example.dell15.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by dell15 on 2018/2/7.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
