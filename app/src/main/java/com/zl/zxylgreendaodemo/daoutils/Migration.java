package com.zl.zxylgreendaodemo.daoutils;

import android.database.sqlite.SQLiteDatabase;

/**

 * Created by weijianxing on 9/22/15.

 */
public interface Migration {

    void migrate(SQLiteDatabase db);

}
