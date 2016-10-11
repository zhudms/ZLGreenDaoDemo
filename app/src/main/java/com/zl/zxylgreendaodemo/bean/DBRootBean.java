package com.zl.zxylgreendaodemo.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;

/**
 * Created by TANG on 2016/10/9.
 * ZLGreenDaoDemo
 */
@Entity
public class DBRootBean<T> {

    @Id(autoincrement = true)
    public Long _id;

    public String singleKey;

    public String insertTime;

    public String parentTag;

    public int pageNo;


//    public DBRootBean( int singleKey, String insertTime, String parentTag, int pageNo) {
//
//        this.singleKey = singleKey;
//        this.insertTime = insertTime;
//        this.parentTag = parentTag;
//        this.pageNo = pageNo;
//    }

    @Generated(hash = 633868061)
    public DBRootBean() {
    }


    @Generated(hash = 966024405)
    public DBRootBean(Long _id, String singleKey, String insertTime, String parentTag,
            int pageNo) {
        this._id = _id;
        this.singleKey = singleKey;
        this.insertTime = insertTime;
        this.parentTag = parentTag;
        this.pageNo = pageNo;
    }    public DBRootBean( String singleKey, String insertTime, String parentTag,
            int pageNo) {

        this.singleKey = singleKey;
        this.insertTime = insertTime;
        this.parentTag = parentTag;
        this.pageNo = pageNo;
    }


    public String getInsertTime() {
        return this.insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getParentTag() {
        return this.parentTag;
    }

    public void setParentTag(String parentTag) {
        this.parentTag = parentTag;
    }

    public int getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public Long get_id() {
        return this._id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }


    public String getSingleKey() {
        return this.singleKey;
    }


    public void setSingleKey(String singleKey) {
        this.singleKey = singleKey;
    }

//    public Long get_id() {
//        return this._id;
//    }
//    public void set_id(Long _id) {
//        this._id = _id;
//    }


}
