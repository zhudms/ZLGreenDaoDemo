package com.zl.zxylgreendaodemo;

import android.app.Application;

import com.zl.zxylgreendaodemo.bean.DBRootBean;
import com.zl.zxylgreendaodemo.daoutils.DaoUtils;

/**
 * Created by TANG on 2016/10/9.
 * ZLGreenDaoDemo
 */

public class MyApplication extends Application {


    public static DaoUtils<DBRootBean> daoUtils;

    @Override
    public void onCreate() {
        super.onCreate();
//        daoUtils = new DaoUtils<>(this);

    }
}
