package com.example.dell15.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell15 on 2018/2/8.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public  More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
