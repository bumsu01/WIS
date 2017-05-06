package com.ynut.bumsu.wis;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bumsu on 2017-05-03.
 */

public class GamePlay_Level1_Activity extends Activity {

    Animation anim = null;

    LinearLayout pLinear, imgLinear;
    Button Btn_1, Btn_2, Btn_3, Btn_4, Btn_5, Btn_6, Btn_7, Btn_8;
    Button Btn_9, Btn_10, Btn_11, Btn_12, Btn_13, Btn_14, Btn_15, Btn_16  ;

    private int click_cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay_1);

        click_cnt = 1;

        pLinear = (LinearLayout) findViewById(R.id.Play_Level1_Background);
        imgLinear = (LinearLayout) findViewById(R.id.Img_Play_Level1);
        Btn_1 = (Button) findViewById(R.id.Btn_Play_Level1_Button1);
        Btn_2 = (Button) findViewById(R.id.Btn_Play_Level1_Button2);
        Btn_3 = (Button) findViewById(R.id.Btn_Play_Level1_Button3);
        Btn_4 = (Button) findViewById(R.id.Btn_Play_Level1_Button4);
        Btn_5 = (Button) findViewById(R.id.Btn_Play_Level1_Button5);
        Btn_6 = (Button) findViewById(R.id.Btn_Play_Level1_Button6);
        Btn_7 = (Button) findViewById(R.id.Btn_Play_Level1_Button7);
        Btn_8 = (Button) findViewById(R.id.Btn_Play_Level1_Button8);
        Btn_9 = (Button) findViewById(R.id.Btn_Play_Level1_Button9);
        Btn_10 = (Button) findViewById(R.id.Btn_Play_Level1_Button10);
        Btn_11 = (Button) findViewById(R.id.Btn_Play_Level1_Button11);
        Btn_12 = (Button) findViewById(R.id.Btn_Play_Level1_Button12);
        Btn_13 = (Button) findViewById(R.id.Btn_Play_Level1_Button13);
        Btn_14 = (Button) findViewById(R.id.Btn_Play_Level1_Button14);
        Btn_15 = (Button) findViewById(R.id.Btn_Play_Level1_Button15);
        Btn_16 = (Button) findViewById(R.id.Btn_Play_Level1_Button16);

        anim = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        anim.setDuration(1000);
        imgLinear.setAnimation(anim);

        //pLinear.setRotation(90.0f);
        imgLinear.setBackgroundResource(R.drawable.play_question);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public boolean AnswerCount() {
        if (click_cnt > 3)
            return false;
        else {
            if (click_cnt == 1) pLinear.setBackgroundResource(R.drawable.play_background_w1);
            if (click_cnt == 2) pLinear.setBackgroundResource(R.drawable.play_background_w2);
            if (click_cnt == 3) pLinear.setBackgroundResource(R.drawable.play_background_w3);
            click_cnt++;
            return true;
        }
    }

    public void Fail_Dialog() {
        new AlertDialog.Builder(this)
                .setTitle("실패")
                .setMessage("실패하셨습니다.")
                .setIcon(R.drawable.play_block_color)
                .setCancelable(false)
                .setNegativeButton("닫기",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                onBackPressed();
                            }
                        })
                .show();
    }

    public void Success_Dialog() {
        new AlertDialog.Builder(this)
                .setTitle("성공")
                .setMessage("성공하셨습니다.")
                .setIcon(R.drawable.play_block_color)
                .setCancelable(false)
                .setNegativeButton("닫기",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                onBackPressed();
                            }
                        })
                .show();
    }

    public void pClick(View v) {
        switch (v.getId()) {
            case R.id.Btn_Play_Level1_Button1:
                Log.v("Tag_Play", "Button AA Click");
                Btn_1.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button2:
                Log.v("Tag_Play", "Button AB Click");
                Btn_2.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button3:
                Log.v("Tag_Play", "Button AC Click");
                Btn_3.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button4:
                Log.v("Tag_Play", "Button AD Click");
                Btn_4.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button5:
                Log.v("Tag_Play", "Button BA Click");
                Btn_5.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button6:
                Log.v("Tag_Play", "Button BB Click");
                Btn_6.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button7:
                Log.v("Tag_Play", "Button BC Click");
                Btn_7.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button8:
                Log.v("Tag_Play", "Button BD Click");
                Btn_8.setBackgroundResource(R.drawable.play_block_color);
                Success_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button9:
                Log.v("Tag_Play", "Button CA Click");
                Btn_1.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button10:
                Log.v("Tag_Play", "Button CB Click");
                Btn_9.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button11:
                Log.v("Tag_Play", "Button CC Click");
                Btn_10.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button12:
                Log.v("Tag_Play", "Button CD Click");
                Btn_11.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button13:
                Log.v("Tag_Play", "Button DA Click");
                Btn_12.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button14:
                Log.v("Tag_Play", "Button DB Click");
                Btn_13.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button15:
                Log.v("Tag_Play", "Button DC Click");
                Btn_14.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button16:
                Log.v("Tag_Play", "Button DD Click");
                Btn_15.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Setting_Play:
                Log.v("Tag_Play", "Setting Button Click In Play");
                startActivity(new Intent(this, SettingActivity.class));
                break;
            default:
                break;
        }
    }
}