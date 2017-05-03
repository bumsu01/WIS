package com.ynut.bumsu.wis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private BackPressCloseHandler backPressCloseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backPressCloseHandler = new BackPressCloseHandler(this);
    }

    public void mClick(View v) {
        switch (v.getId()) {
            case R.id.Btn_Level_Mode:
                Log.v("Tag_Main", "Game Select Mode Click.");
                startActivity(new Intent(this, GameSelectActivity.class));
                break;
            case R.id.Btn_Bluetooth_Connect:
                Log.v("Tag_Main", "Connect Bluetooth Mode Click.");
                startActivity(new Intent(this, ConnectActivity.class));
                break;
            case R.id.Btn_Login:
                Log.v("Tag_Main", "Login Button Click.");
                //startActivity(new Intent(this, ConnectActivity.class));
                break;
            case R.id.Btn_Setting:
                Log.v("Tag_Main", "Login Button Click.");
                startActivity(new Intent(this, SettingActivity.class));
                break;
            default:
                break;
        }

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        backPressCloseHandler.onBackPressed();
    }
}
