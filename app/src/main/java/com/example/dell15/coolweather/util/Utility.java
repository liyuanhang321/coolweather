package com.example.dell15.coolweather.util;

import android.text.TextUtils;

import com.example.dell15.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by dell15 on 2018/2/7.
 */

public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public static  boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvince = new JSONArray(response);
                for (int i = 0; i < allProvince.length(); i++){
                    JSONObject provinceObject = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.get("name"));
                    province.save();
                }
            }
        }
    }
}
