package com.zl.zxylgreendaodemo;

import android.content.Context;

import com.hh.greendao.gen.DaoMaster;
import com.hh.greendao.gen.DaoSession;

public class Session {
    private static final java.lang.String DB_NAME = "zldb";
    private static DaoMaster daoMaster;
    private static DaoSession daoSession;

    private Session() {
    }

    /**
     * 初始化Dao的master，session对象
     *
     * @param context Context
     */
    public static void init(Context context) {
        if (daoMaster == null) {
            DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(context,
                    DB_NAME, null);
            daoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        daoSession = daoMaster.newSession();
    }

    /**
     * 得到DaoMaster对象
     *
     * @param context Context
     * @return DaoMaster
     */
    private static DaoMaster getDaoMaster(Context context) {
        if (daoMaster == null) {
            DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(context,
                    DB_NAME, null);
            daoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        return daoMaster;
    }

    /**
     * 得到DaoSession对象
     *
     * @param context Context
     * @return DaoSession
     */
    private static DaoSession getDaoSession(Context context) {
        if (daoSession == null) {
            DaoMaster daoMaster = getDaoMaster(context);
            daoSession = daoMaster.newSession();
        }
        return daoSession;
    }

    /**
     * 得到DaoSession，保证应用只有一个Session对象 <br/>
     * note: 如果没有其他需求，获取DaoSession对象只有此唯一方式
     *
     * @param context Context
     * @return DaoSession
     */
    public static DaoSession getInstance(Context context) {
        if (daoSession == null) {
            daoSession = getDaoSession(context);
        }
        return daoSession;
    }
}
