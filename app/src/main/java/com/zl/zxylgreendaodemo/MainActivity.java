package com.zl.zxylgreendaodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zl.zxylgreendaodemo.bean.DBRootBean;
import com.zl.zxylgreendaodemo.bean.MedicalInspectB;
import com.zl.zxylgreendaodemo.daoutils.DaoUtils;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();
        insert();
    }

    public void insert() {
        for (int i = 0, len = 20; i < len; i++) {

            DBRootBean user = new DBRootBean(Long.valueOf(5 * i), i + "", "see555", "as2", i);
            boolean flag = new DaoUtils<>(this).insertOrReplaceEntity(user);
            Toast.makeText(this, "" + flag, Toast.LENGTH_SHORT).show();
        }
    }

}
