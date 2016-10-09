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
    @Generated
    public MedicalInspectB  bean;
    @Generated
    public MedicalInspectDetailB beanDetail;

}
