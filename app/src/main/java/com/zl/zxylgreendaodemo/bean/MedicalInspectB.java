package com.zl.zxylgreendaodemo.bean;import org.greenrobot.greendao.annotation.Entity;import org.greenrobot.greendao.annotation.Generated;import java.io.Serializable;import java.util.ArrayList;/** * 就诊资料-检验 */@Entitypublic class MedicalInspectB extends DBRootBean {    @Generated    public String EXEC_DOCTOR_NAME;    public String ID;    public String SPECIMEN_TYPE;    public String LAB_DATE;//检验时间吧    public String LAB_TIME;    public String SNO_HOSPITAL;    public String VERIFY_DOCTOR_NAME;    public String LAB_REPORT_DOCTOR_NAME;    public String LAB_NAME;//检验名称    public long RN_;    public String SUBMISSION_DEPT_NAME;//科室    public String SUBMISSION_DOCTOR_NAME;//提交报告医生    public String LAB_DESC;    public long RESULT_COUNT;    public String LAB_REPORT_DATE;//报告日期    public String LAB_METHOD;    public String SPECIMEN_LOCATION;//    public ArrayList<MedicalInspectB> mChildLists;////    public void addChilds(MedicalInspectB bean) {//        mChildLists.add(bean);//    }////    public ArrayList<MedicalInspectB> getmChildLists() {//        return mChildLists;//    }////    public void setmChildLists(ArrayList<MedicalInspectB> mChildLists) {//        this.mChildLists = mChildLists;//    }//////    public MedicalInspectB() {//        this.mChildLists=new ArrayList<>();//    }    @Generated(hash = 1038454171)    public MedicalInspectB(String EXEC_DOCTOR_NAME, String ID,            String SPECIMEN_TYPE, String LAB_DATE, String LAB_TIME,            String SNO_HOSPITAL, String VERIFY_DOCTOR_NAME,            String LAB_REPORT_DOCTOR_NAME, String LAB_NAME, long RN_,            String SUBMISSION_DEPT_NAME, String SUBMISSION_DOCTOR_NAME,            String LAB_DESC, long RESULT_COUNT, String LAB_REPORT_DATE,            String LAB_METHOD, String SPECIMEN_LOCATION) {        this.EXEC_DOCTOR_NAME = EXEC_DOCTOR_NAME;        this.ID = ID;        this.SPECIMEN_TYPE = SPECIMEN_TYPE;        this.LAB_DATE = LAB_DATE;        this.LAB_TIME = LAB_TIME;        this.SNO_HOSPITAL = SNO_HOSPITAL;        this.VERIFY_DOCTOR_NAME = VERIFY_DOCTOR_NAME;        this.LAB_REPORT_DOCTOR_NAME = LAB_REPORT_DOCTOR_NAME;        this.LAB_NAME = LAB_NAME;        this.RN_ = RN_;        this.SUBMISSION_DEPT_NAME = SUBMISSION_DEPT_NAME;        this.SUBMISSION_DOCTOR_NAME = SUBMISSION_DOCTOR_NAME;        this.LAB_DESC = LAB_DESC;        this.RESULT_COUNT = RESULT_COUNT;        this.LAB_REPORT_DATE = LAB_REPORT_DATE;        this.LAB_METHOD = LAB_METHOD;        this.SPECIMEN_LOCATION = SPECIMEN_LOCATION;    }    @Generated(hash = 854109002)    public MedicalInspectB() {    }    public String getID() {        return ID;    }    public void setID(String ID) {        this.ID = ID;    }    public String getSPECIMEN_TYPE() {        return SPECIMEN_TYPE;    }    public void setSPECIMEN_TYPE(String SPECIMEN_TYPE) {        this.SPECIMEN_TYPE = SPECIMEN_TYPE;    }    public String getLAB_DATE() {        return LAB_DATE;    }    public void setLAB_DATE(String LAB_DATE) {        this.LAB_DATE = LAB_DATE;    }    public String getLAB_TIME() {        return LAB_TIME;    }    public void setLAB_TIME(String LAB_TIME) {        this.LAB_TIME = LAB_TIME;    }    public String getSNO_HOSPITAL() {        return SNO_HOSPITAL;    }    public void setSNO_HOSPITAL(String SNO_HOSPITAL) {        this.SNO_HOSPITAL = SNO_HOSPITAL;    }    public String getVERIFY_DOCTOR_NAME() {        return VERIFY_DOCTOR_NAME;    }    public void setVERIFY_DOCTOR_NAME(String VERIFY_DOCTOR_NAME) {        this.VERIFY_DOCTOR_NAME = VERIFY_DOCTOR_NAME;    }    public String getLAB_REPORT_DOCTOR_NAME() {        return LAB_REPORT_DOCTOR_NAME;    }    public void setLAB_REPORT_DOCTOR_NAME(String LAB_REPORT_DOCTOR_NAME) {        this.LAB_REPORT_DOCTOR_NAME = LAB_REPORT_DOCTOR_NAME;    }    public String getLAB_NAME() {        return LAB_NAME;    }    public void setLAB_NAME(String LAB_NAME) {        this.LAB_NAME = LAB_NAME;    }    public long getRN_() {        return RN_;    }    public void setRN_(long RN_) {        this.RN_ = RN_;    }    public String getSUBMISSION_DEPT_NAME() {        return SUBMISSION_DEPT_NAME;    }    public void setSUBMISSION_DEPT_NAME(String SUBMISSION_DEPT_NAME) {        this.SUBMISSION_DEPT_NAME = SUBMISSION_DEPT_NAME;    }    public String getSUBMISSION_DOCTOR_NAME() {        return SUBMISSION_DOCTOR_NAME;    }    public void setSUBMISSION_DOCTOR_NAME(String SUBMISSION_DOCTOR_NAME) {        this.SUBMISSION_DOCTOR_NAME = SUBMISSION_DOCTOR_NAME;    }    public String getLAB_DESC() {        return LAB_DESC;    }    public void setLAB_DESC(String LAB_DESC) {        this.LAB_DESC = LAB_DESC;    }    public long getRESULT_COUNT() {        return RESULT_COUNT;    }    public void setRESULT_COUNT(long RESULT_COUNT) {        this.RESULT_COUNT = RESULT_COUNT;    }    public String getLAB_REPORT_DATE() {        return LAB_REPORT_DATE;    }    public void setLAB_REPORT_DATE(String LAB_REPORT_DATE) {        this.LAB_REPORT_DATE = LAB_REPORT_DATE;    }    public String getLAB_METHOD() {        return LAB_METHOD;    }    public void setLAB_METHOD(String LAB_METHOD) {        this.LAB_METHOD = LAB_METHOD;    }    public String getSPECIMEN_LOCATION() {        return SPECIMEN_LOCATION;    }    public void setSPECIMEN_LOCATION(String SPECIMEN_LOCATION) {        this.SPECIMEN_LOCATION = SPECIMEN_LOCATION;    }    public String getEXEC_DOCTOR_NAME() {        return EXEC_DOCTOR_NAME;    }    public void setEXEC_DOCTOR_NAME(String EXEC_DOCTOR_NAME) {        this.EXEC_DOCTOR_NAME = EXEC_DOCTOR_NAME;    }}