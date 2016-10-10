package com.zl.zxylgreendaodemo.daoutils;

import android.database.sqlite.SQLiteDatabase;

import com.hh.greendao.gen.DaoMaster;
import com.hh.greendao.gen.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by TANG on 2016/10/10.
 * ZLGreenDaoDemo
 */

public class MyMaster extends DaoMaster {

    public MyMaster(SQLiteDatabase db) {
        super(db);
    }

    @Override
    public DaoSession newSession() {
        return super.newSession();
    }


}
