package com.zl.zxylgreendaodemo;

import android.app.Application;

import com.hh.greendao.gen.DaoMaster;
import com.hh.greendao.gen.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by TANG on 2016/10/9.
 * ZLGreenDaoDemo
 */

public class MyApplication extends Application {

    private static DaoSession daoSession;


    @Override
    public void onCreate() {
        super.onCreate();
        Session.init(MyApplication.this);

        daoSession =Session.getInstance(MyApplication.this);


    }
}
