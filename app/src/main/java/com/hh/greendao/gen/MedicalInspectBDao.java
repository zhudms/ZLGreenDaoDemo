package com.hh.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.zl.zxylgreendaodemo.bean.MedicalInspectB;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MEDICAL_INSPECT_B".
*/
public class MedicalInspectBDao extends AbstractDao<MedicalInspectB, Void> {

    public static final String TABLENAME = "MEDICAL_INSPECT_B";

    /**
     * Properties of entity MedicalInspectB.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property EXEC_DOCTOR_NAME = new Property(0, String.class, "EXEC_DOCTOR_NAME", false, "EXEC__DOCTOR__NAME");
        public final static Property ID = new Property(1, String.class, "ID", false, "ID");
        public final static Property SPECIMEN_TYPE = new Property(2, String.class, "SPECIMEN_TYPE", false, "SPECIMEN__TYPE");
        public final static Property LAB_DATE = new Property(3, String.class, "LAB_DATE", false, "LAB__DATE");
        public final static Property LAB_TIME = new Property(4, String.class, "LAB_TIME", false, "LAB__TIME");
        public final static Property SNO_HOSPITAL = new Property(5, String.class, "SNO_HOSPITAL", false, "SNO__HOSPITAL");
        public final static Property VERIFY_DOCTOR_NAME = new Property(6, String.class, "VERIFY_DOCTOR_NAME", false, "VERIFY__DOCTOR__NAME");
        public final static Property LAB_REPORT_DOCTOR_NAME = new Property(7, String.class, "LAB_REPORT_DOCTOR_NAME", false, "LAB__REPORT__DOCTOR__NAME");
        public final static Property LAB_NAME = new Property(8, String.class, "LAB_NAME", false, "LAB__NAME");
        public final static Property RN_ = new Property(9, long.class, "RN_", false, "RN_");
        public final static Property SUBMISSION_DEPT_NAME = new Property(10, String.class, "SUBMISSION_DEPT_NAME", false, "SUBMISSION__DEPT__NAME");
        public final static Property SUBMISSION_DOCTOR_NAME = new Property(11, String.class, "SUBMISSION_DOCTOR_NAME", false, "SUBMISSION__DOCTOR__NAME");
        public final static Property LAB_DESC = new Property(12, String.class, "LAB_DESC", false, "LAB__DESC");
        public final static Property RESULT_COUNT = new Property(13, long.class, "RESULT_COUNT", false, "RESULT__COUNT");
        public final static Property LAB_REPORT_DATE = new Property(14, String.class, "LAB_REPORT_DATE", false, "LAB__REPORT__DATE");
        public final static Property LAB_METHOD = new Property(15, String.class, "LAB_METHOD", false, "LAB__METHOD");
        public final static Property SPECIMEN_LOCATION = new Property(16, String.class, "SPECIMEN_LOCATION", false, "SPECIMEN__LOCATION");
    }


    public MedicalInspectBDao(DaoConfig config) {
        super(config);
    }
    
    public MedicalInspectBDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MEDICAL_INSPECT_B\" (" + //
                "\"EXEC__DOCTOR__NAME\" TEXT," + // 0: EXEC_DOCTOR_NAME
                "\"ID\" TEXT," + // 1: ID
                "\"SPECIMEN__TYPE\" TEXT," + // 2: SPECIMEN_TYPE
                "\"LAB__DATE\" TEXT," + // 3: LAB_DATE
                "\"LAB__TIME\" TEXT," + // 4: LAB_TIME
                "\"SNO__HOSPITAL\" TEXT," + // 5: SNO_HOSPITAL
                "\"VERIFY__DOCTOR__NAME\" TEXT," + // 6: VERIFY_DOCTOR_NAME
                "\"LAB__REPORT__DOCTOR__NAME\" TEXT," + // 7: LAB_REPORT_DOCTOR_NAME
                "\"LAB__NAME\" TEXT," + // 8: LAB_NAME
                "\"RN_\" INTEGER NOT NULL ," + // 9: RN_
                "\"SUBMISSION__DEPT__NAME\" TEXT," + // 10: SUBMISSION_DEPT_NAME
                "\"SUBMISSION__DOCTOR__NAME\" TEXT," + // 11: SUBMISSION_DOCTOR_NAME
                "\"LAB__DESC\" TEXT," + // 12: LAB_DESC
                "\"RESULT__COUNT\" INTEGER NOT NULL ," + // 13: RESULT_COUNT
                "\"LAB__REPORT__DATE\" TEXT," + // 14: LAB_REPORT_DATE
                "\"LAB__METHOD\" TEXT," + // 15: LAB_METHOD
                "\"SPECIMEN__LOCATION\" TEXT);"); // 16: SPECIMEN_LOCATION
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MEDICAL_INSPECT_B\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MedicalInspectB entity) {
        stmt.clearBindings();
 
        String EXEC_DOCTOR_NAME = entity.getEXEC_DOCTOR_NAME();
        if (EXEC_DOCTOR_NAME != null) {
            stmt.bindString(1, EXEC_DOCTOR_NAME);
        }
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(2, ID);
        }
 
        String SPECIMEN_TYPE = entity.getSPECIMEN_TYPE();
        if (SPECIMEN_TYPE != null) {
            stmt.bindString(3, SPECIMEN_TYPE);
        }
 
        String LAB_DATE = entity.getLAB_DATE();
        if (LAB_DATE != null) {
            stmt.bindString(4, LAB_DATE);
        }
 
        String LAB_TIME = entity.getLAB_TIME();
        if (LAB_TIME != null) {
            stmt.bindString(5, LAB_TIME);
        }
 
        String SNO_HOSPITAL = entity.getSNO_HOSPITAL();
        if (SNO_HOSPITAL != null) {
            stmt.bindString(6, SNO_HOSPITAL);
        }
 
        String VERIFY_DOCTOR_NAME = entity.getVERIFY_DOCTOR_NAME();
        if (VERIFY_DOCTOR_NAME != null) {
            stmt.bindString(7, VERIFY_DOCTOR_NAME);
        }
 
        String LAB_REPORT_DOCTOR_NAME = entity.getLAB_REPORT_DOCTOR_NAME();
        if (LAB_REPORT_DOCTOR_NAME != null) {
            stmt.bindString(8, LAB_REPORT_DOCTOR_NAME);
        }
 
        String LAB_NAME = entity.getLAB_NAME();
        if (LAB_NAME != null) {
            stmt.bindString(9, LAB_NAME);
        }
        stmt.bindLong(10, entity.getRN_());
 
        String SUBMISSION_DEPT_NAME = entity.getSUBMISSION_DEPT_NAME();
        if (SUBMISSION_DEPT_NAME != null) {
            stmt.bindString(11, SUBMISSION_DEPT_NAME);
        }
 
        String SUBMISSION_DOCTOR_NAME = entity.getSUBMISSION_DOCTOR_NAME();
        if (SUBMISSION_DOCTOR_NAME != null) {
            stmt.bindString(12, SUBMISSION_DOCTOR_NAME);
        }
 
        String LAB_DESC = entity.getLAB_DESC();
        if (LAB_DESC != null) {
            stmt.bindString(13, LAB_DESC);
        }
        stmt.bindLong(14, entity.getRESULT_COUNT());
 
        String LAB_REPORT_DATE = entity.getLAB_REPORT_DATE();
        if (LAB_REPORT_DATE != null) {
            stmt.bindString(15, LAB_REPORT_DATE);
        }
 
        String LAB_METHOD = entity.getLAB_METHOD();
        if (LAB_METHOD != null) {
            stmt.bindString(16, LAB_METHOD);
        }
 
        String SPECIMEN_LOCATION = entity.getSPECIMEN_LOCATION();
        if (SPECIMEN_LOCATION != null) {
            stmt.bindString(17, SPECIMEN_LOCATION);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MedicalInspectB entity) {
        stmt.clearBindings();
 
        String EXEC_DOCTOR_NAME = entity.getEXEC_DOCTOR_NAME();
        if (EXEC_DOCTOR_NAME != null) {
            stmt.bindString(1, EXEC_DOCTOR_NAME);
        }
 
        String ID = entity.getID();
        if (ID != null) {
            stmt.bindString(2, ID);
        }
 
        String SPECIMEN_TYPE = entity.getSPECIMEN_TYPE();
        if (SPECIMEN_TYPE != null) {
            stmt.bindString(3, SPECIMEN_TYPE);
        }
 
        String LAB_DATE = entity.getLAB_DATE();
        if (LAB_DATE != null) {
            stmt.bindString(4, LAB_DATE);
        }
 
        String LAB_TIME = entity.getLAB_TIME();
        if (LAB_TIME != null) {
            stmt.bindString(5, LAB_TIME);
        }
 
        String SNO_HOSPITAL = entity.getSNO_HOSPITAL();
        if (SNO_HOSPITAL != null) {
            stmt.bindString(6, SNO_HOSPITAL);
        }
 
        String VERIFY_DOCTOR_NAME = entity.getVERIFY_DOCTOR_NAME();
        if (VERIFY_DOCTOR_NAME != null) {
            stmt.bindString(7, VERIFY_DOCTOR_NAME);
        }
 
        String LAB_REPORT_DOCTOR_NAME = entity.getLAB_REPORT_DOCTOR_NAME();
        if (LAB_REPORT_DOCTOR_NAME != null) {
            stmt.bindString(8, LAB_REPORT_DOCTOR_NAME);
        }
 
        String LAB_NAME = entity.getLAB_NAME();
        if (LAB_NAME != null) {
            stmt.bindString(9, LAB_NAME);
        }
        stmt.bindLong(10, entity.getRN_());
 
        String SUBMISSION_DEPT_NAME = entity.getSUBMISSION_DEPT_NAME();
        if (SUBMISSION_DEPT_NAME != null) {
            stmt.bindString(11, SUBMISSION_DEPT_NAME);
        }
 
        String SUBMISSION_DOCTOR_NAME = entity.getSUBMISSION_DOCTOR_NAME();
        if (SUBMISSION_DOCTOR_NAME != null) {
            stmt.bindString(12, SUBMISSION_DOCTOR_NAME);
        }
 
        String LAB_DESC = entity.getLAB_DESC();
        if (LAB_DESC != null) {
            stmt.bindString(13, LAB_DESC);
        }
        stmt.bindLong(14, entity.getRESULT_COUNT());
 
        String LAB_REPORT_DATE = entity.getLAB_REPORT_DATE();
        if (LAB_REPORT_DATE != null) {
            stmt.bindString(15, LAB_REPORT_DATE);
        }
 
        String LAB_METHOD = entity.getLAB_METHOD();
        if (LAB_METHOD != null) {
            stmt.bindString(16, LAB_METHOD);
        }
 
        String SPECIMEN_LOCATION = entity.getSPECIMEN_LOCATION();
        if (SPECIMEN_LOCATION != null) {
            stmt.bindString(17, SPECIMEN_LOCATION);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public MedicalInspectB readEntity(Cursor cursor, int offset) {
        MedicalInspectB entity = new MedicalInspectB( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // EXEC_DOCTOR_NAME
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // SPECIMEN_TYPE
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // LAB_DATE
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // LAB_TIME
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // SNO_HOSPITAL
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // VERIFY_DOCTOR_NAME
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // LAB_REPORT_DOCTOR_NAME
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // LAB_NAME
            cursor.getLong(offset + 9), // RN_
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // SUBMISSION_DEPT_NAME
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // SUBMISSION_DOCTOR_NAME
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // LAB_DESC
            cursor.getLong(offset + 13), // RESULT_COUNT
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // LAB_REPORT_DATE
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // LAB_METHOD
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16) // SPECIMEN_LOCATION
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MedicalInspectB entity, int offset) {
        entity.setEXEC_DOCTOR_NAME(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSPECIMEN_TYPE(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLAB_DATE(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLAB_TIME(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSNO_HOSPITAL(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setVERIFY_DOCTOR_NAME(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setLAB_REPORT_DOCTOR_NAME(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setLAB_NAME(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setRN_(cursor.getLong(offset + 9));
        entity.setSUBMISSION_DEPT_NAME(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSUBMISSION_DOCTOR_NAME(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setLAB_DESC(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setRESULT_COUNT(cursor.getLong(offset + 13));
        entity.setLAB_REPORT_DATE(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setLAB_METHOD(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setSPECIMEN_LOCATION(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(MedicalInspectB entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(MedicalInspectB entity) {
        return null;
    }

    @Override
    public boolean hasKey(MedicalInspectB entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
