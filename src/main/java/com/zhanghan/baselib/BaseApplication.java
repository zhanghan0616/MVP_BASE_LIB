package com.zhanghan.baselib;

import android.app.Application;

import org.xutils.x;

/**
 * Created by ZhangHan on 2016/7/9.
 */
public class BaseApplication extends Application {

    public boolean isDebug;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化xutils3
        x.Ext.init(this);
        //设置debug
        x.Ext.setDebug(isDebug);
    }
}
