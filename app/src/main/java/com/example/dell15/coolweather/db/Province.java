package com.example.dell15.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dell15 on 2018/2/7.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return  id;
    }
    public void setId(){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(){
        this.provinceCode = provinceCode;
    }
}
