package com.example.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/14.
 */

/**
 * 管理省份的数据库表
 */
public class Province extends DataSupport {
    private int id;
    private String provinceName; //省份名字
    private int provinceCode; //省份的代号

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}