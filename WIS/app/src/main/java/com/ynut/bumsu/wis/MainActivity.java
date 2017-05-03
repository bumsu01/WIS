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
                startActivity(new Intent(this, GameSelectActivity.class));
                Log.v("Tag_Main", "Game Select Mode Click.");
                break;
            case R.id.Btn_Bluetooth_Connect:
                startActivity(new Intent(this, ConnectActivity.class));
                Log.v("Tag_Main", "Connect Bluetooth Mode Click.");
                break;
            case R.id.Btn_Login:
                //startActivity(new Intent(this, ConnectActivity.class));
                Log.v("Tag_Main", "Login Button Click.");
                break;
            case R.id.Btn_Setting:
                startActivity(new Intent(this, SettingActivity.class));
                Log.v("Tag_Main", "Login Button Click.");
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
