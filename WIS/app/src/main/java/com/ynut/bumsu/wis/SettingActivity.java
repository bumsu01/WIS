package com.ynut.bumsu.wis;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by bumsu on 2017-05-03.
 */

public class SettingActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void sClick(View v) {
        switch (v.getId()) {
            case R.id.Btn_Back_Setting:
                Log.v("Tag_Setting", "Back Button Click In SettingActivity.");
                super.onBackPressed();
                break;
            default:
                break;
        }

    }
}
