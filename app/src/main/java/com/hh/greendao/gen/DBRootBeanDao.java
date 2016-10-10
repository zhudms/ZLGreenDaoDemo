package com.hh.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.zl.zxylgreendaodemo.bean.DBRootBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DBROOT_BEAN".
*/
public class DBRootBeanDao extends AbstractDao<DBRootBean, Integer> {

    public static final String TABLENAME = "DBROOT_BEAN";

    /**
     * Properties of entity DBRootBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property SingleKey = new Property(0, int.class, "singleKey", true, "SINGLE_KEY");
        public final static Property InsertTime = new Property(1, String.class, "insertTime", false, "INSERT_TIME");
        public final static Property ParentTag = new Property(2, String.class, "parentTag", false, "PARENT_TAG");
        public final static Property PageNo = new Property(3, int.class, "pageNo", false, "PAGE_NO");
    }


    public DBRootBeanDao(DaoConfig config) {
        super(config);
    }
    
    public DBRootBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DBROOT_BEAN\" (" + //
                "\"SINGLE_KEY\" INTEGER PRIMARY KEY NOT NULL ," + // 0: singleKey
                "\"INSERT_TIME\" TEXT," + // 1: insertTime
                "\"PARENT_TAG\" TEXT," + // 2: parentTag
                "\"PAGE_NO\" INTEGER NOT NULL );"); // 3: pageNo
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DBROOT_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DBRootBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getSingleKey());
 
        String insertTime = entity.getInsertTime();
        if (insertTime != null) {
            stmt.bindString(2, insertTime);
        }
 
        String parentTag = entity.getParentTag();
        if (parentTag != null) {
            stmt.bindString(3, parentTag);
        }
        stmt.bindLong(4, entity.getPageNo());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DBRootBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getSingleKey());
 
        String insertTime = entity.getInsertTime();
        if (insertTime != null) {
            stmt.bindString(2, insertTime);
        }
 
        String parentTag = entity.getParentTag();
        if (parentTag != null) {
            stmt.bindString(3, parentTag);
        }
        stmt.bindLong(4, entity.getPageNo());
    }

    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.getInt(offset + 0);
    }    

    @Override
    public DBRootBean readEntity(Cursor cursor, int offset) {
        DBRootBean entity = new DBRootBean( //
            cursor.getInt(offset + 0), // singleKey
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // insertTime
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // parentTag
            cursor.getInt(offset + 3) // pageNo
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DBRootBean entity, int offset) {
        entity.setSingleKey(cursor.getInt(offset + 0));
        entity.setInsertTime(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setParentTag(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPageNo(cursor.getInt(offset + 3));
     }
    
    @Override
    protected final Integer updateKeyAfterInsert(DBRootBean entity, long rowId) {
        return entity.getSingleKey();
    }
    
    @Override
    public Integer getKey(DBRootBean entity) {
        if(entity != null) {
            return entity.getSingleKey();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DBRootBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}