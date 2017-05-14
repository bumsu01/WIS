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
            case R.id.Btn_Level4_GameSelect:
                Log.v("Tag_GameSelect", "Game Select Level 4");
                startActivity(new Intent(this, GamePlay_Level4_Activity.class));
                break;
            case R.id.Btn_Level5_GameSelect:
                Log.v("Tag_GameSelect", "Game Select Level 5");
                startActivity(new Intent(this, GamePlay_Level5_Activity.class));
                break;
            case R.id.Btn_Level6_GameSelect:
                Log.v("Tag_GameSelect", "Game Select Level 6");
                startActivity(new Intent(this, GamePlay_Level6_Activity.class));
                break;
            case R.id.Btn_Level7_GameSelect:
                Log.v("Tag_GameSelect", "Game Select Level 7");
                startActivity(new Intent(this, GamePlay_Level7_Activity.class));
                break;
            case R.id.Btn_Level8_GameSelect:
                Log.v("Tag_GameSelect", "Game Select Level 8");
                startActivity(new Intent(this, GamePlay_Level8_Activity.class));
                break;
            case R.id.Btn_Level9_GameSelect:
                Log.v("Tag_GameSelect", "Game Select Level 9");
                startActivity(new Intent(this, GamePlay_Level9_Activity.class));
                break;
            case R.id.Btn_Level10_GameSelect:
                Log.v("Tag_GameSelect", "Game Select Level 10");
                startActivity(new Intent(this, GamePlay_Level10_Activity.class));
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