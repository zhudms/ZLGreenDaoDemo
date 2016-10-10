package com.zl.zxylgreendaodemo.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by TANG on 2016/10/9.
 * ZLGreenDaoDemo
 */
@Entity
public class DBRootBean<T> {
    @Id
    public int singleKey;
    @Generated
    public String insertTime;
    @Generated
    public String parentTag;
    @Generated
    public int pageNo;
    @Generated(hash = 554560037)
    public DBRootBean(int singleKey, String insertTime, String parentTag, int pageNo) {
        this.singleKey = singleKey;
        this.insertTime = insertTime;
        this.parentTag = parentTag;
        this.pageNo = pageNo;
    }
    @Generated(hash = 633868061)
    public DBRootBean() {
    }
    public int getSingleKey() {
        return this.singleKey;
    }
    public void setSingleKey(int singleKey) {
        this.singleKey = singleKey;
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


}
