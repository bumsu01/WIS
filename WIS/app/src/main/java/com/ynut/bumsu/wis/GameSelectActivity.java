package com.ynut.bumsu.wis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by bumsu on 2017-05-03.
 */

public class GameSelectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameselect);
    }

    public void gsClick(View v) {
        switch (v.getId()) {
            case R.id.Btn_Level1_GameSelect:
                Log.v("Tag_GameSelect", "Game Select Level 1");
                startActivity(new Intent(this, GamePlay_Level1_Activity.class));
                break;
            case R.id.Btn_Level2_GameSelect:
                Log.v("Tag_GameSelect", "Game Select Level 2");
                startActivity(new Intent(this, GamePlay_Level2_Activity.class));
                break;
            case R.id.Btn_Level3_GameSelect:
                Log.v("Tag_GameSelect", "Game Select Level 3");
                startActivity(new Intent(this, GamePlay_Level3_Activity.class));
                break;
            case R.id.Btn_Setting_GameSelect:
                Log.v("Tag_GameSelect", "Setting Button Click In Game Level Mode.");
                startActivity(new Intent(this, SettingActivity.class));
                break;
            default:
                break;
        }

    }
}