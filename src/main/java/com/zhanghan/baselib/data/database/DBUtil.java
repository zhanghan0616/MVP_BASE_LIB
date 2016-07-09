package com.zhanghan.baselib.data.database;

import org.xutils.DbManager;
import org.xutils.x;

import java.io.File;

/**
 * Created by ZhangHan on 2016/7/9.
 *
 * 数据库配置类
 */
public class DBUtil {
    static DbManager.DaoConfig daoConfig;
    public static DbManager.DaoConfig getDaoConfig(){
        File file=new File(x.app().getCacheDir().getPath());
        if(daoConfig==null){
            daoConfig=new DbManager.DaoConfig()
                    .setDbName("xutils.db")
                    .setDbDir(file)
                    .setDbVersion(1)
                    .setAllowTransaction(true)
                    .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                        @Override
                        public void onUpgrade(DbManager db, int oldVersion, int newVersion) {

                        }
                    });
        }
        return daoConfig;
    }
}
