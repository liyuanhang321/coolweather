package com.example.dell15.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell15 on 2018/2/8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
