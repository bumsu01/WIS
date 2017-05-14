package com.ynut.bumsu.wis;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by bumsu on 2017-05-07.
 */

public class GamePlay_Level10_Activity extends Activity {

    Animation mAni1 = null;
    Animation mAni2 = null;
    Animation mAni3 = null;
    Animation mAni4 = null;
    Animation mAni5 = null;
    Animation mAni6 = null;
    Animation mAni7 = null;
    Animation mAni8 = null;
    Animation mAni9 = null;

    LinearLayout pLinear, imgLinear, lLinear_1, lLinear_2, lLinear_3, lLinear_4;
    Button Btn_1, Btn_2, Btn_3, Btn_4, Btn_5, Btn_6, Btn_7, Btn_8;
    Button Btn_9, Btn_10, Btn_11, Btn_12, Btn_13, Btn_14, Btn_15, Btn_16  ;

    private int wClick_cnt, aClick_cnt, answer_cnt;
    //private int answer[] = new int[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay_010);

        answer_cnt = 4;
        aClick_cnt = 0;
        wClick_cnt = 1;

        pLinear = (LinearLayout) findViewById(R.id.Play_Level_010_Background);
        lLinear_1 = (LinearLayout) findViewById(R.id.play_Level_010_line_1);
        lLinear_2 = (LinearLayout) findViewById(R.id.play_Level_010_line_2);
        lLinear_3 = (LinearLayout) findViewById(R.id.play_Level_010_line_3);
        lLinear_4 = (LinearLayout) findViewById(R.id.play_Level_010_line_4);
        imgLinear = (LinearLayout) findViewById(R.id.Img_Play_Level_010);
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

        Btn_1.setEnabled(false);
        Btn_2.setEnabled(false);
        Btn_3.setEnabled(false);
        Btn_4.setEnabled(false);
        Btn_5.setEnabled(false);
        Btn_6.setEnabled(false);
        Btn_7.setEnabled(false);
        Btn_8.setEnabled(false);
        Btn_9.setEnabled(false);
        Btn_10.setEnabled(false);
        Btn_11.setEnabled(false);
        Btn_12.setEnabled(false);
        Btn_13.setEnabled(false);
        Btn_14.setEnabled(false);
        Btn_15.setEnabled(false);
        Btn_16.setEnabled(false);
        imgLinear.setBackgroundResource(R.drawable.play_level_010);

        mAni1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_circle_090);
        mAni2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_circle_090);
        mAni3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_uncircle_090);
        mAni4 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_uncircle_090);
        mAni5 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_uncircle_090);
        mAni6 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left1_to_right4);
        mAni7 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left2_to_right3);
        mAni8 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right3_to_left2);
        mAni9 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right4_to_left1);

        mAni1.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) { imgLinear.startAnimation(mAni2); }
            public void onAnimationRepeat(Animation animation) {
                ;
            }
            public void onAnimationStart(Animation animation) { ; }
        });
        mAni2.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) { imgLinear.startAnimation(mAni3); }
            public void onAnimationRepeat(Animation animation) {
                ;
            }
            public void onAnimationStart(Animation animation) { ; }
        });
        mAni3.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) { imgLinear.startAnimation(mAni4); }
            public void onAnimationRepeat(Animation animation) {
                ;
            }
            public void onAnimationStart(Animation animation) { ; }
        });
        mAni4.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) { imgLinear.startAnimation(mAni5); }
            public void onAnimationRepeat(Animation animation) {
                ;
            }
            public void onAnimationStart(Animation animation) { ; }
        });
        mAni5.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                imgLinear.setBackgroundResource(R.color.none);
                Btn_1.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_2.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_3.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_4.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_5.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_6.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_7.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_8.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_9.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_10.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_11.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_12.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_13.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_14.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_15.setBackgroundResource(R.drawable.play_block_color_none);
                Btn_16.setBackgroundResource(R.drawable.play_block_color_none);
                lLinear_1.startAnimation(mAni6); }
            public void onAnimationRepeat(Animation animation) {
                ;
            }
            public void onAnimationStart(Animation animation) { ; }
        });
        mAni6.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) { ; }
            public void onAnimationRepeat(Animation animation) {
                ;
            }
            public void onAnimationStart(Animation animation) { lLinear_2.startAnimation(mAni7); }
        });
        mAni7.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) { ; }
            public void onAnimationRepeat(Animation animation) {
                ;
            }
            public void onAnimationStart(Animation animation) { lLinear_3.startAnimation(mAni8); }
        });
        mAni8.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) { ; }
            public void onAnimationRepeat(Animation animation) {
                ;
            }
            public void onAnimationStart(Animation animation) { lLinear_4.startAnimation(mAni9); }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                imgLinear.setBackgroundResource(R.drawable.play_question);
                imgLinear.setAnimation(mAni1);
                onBtnClickAnnoy();
            }
        }, 1500);
    }

    public void onBtnClickAnnoy()
    {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Btn_1.setEnabled(true);
                Btn_2.setEnabled(true);
                Btn_3.setEnabled(true);
                Btn_4.setEnabled(true);
                Btn_5.setEnabled(true);
                Btn_6.setEnabled(true);
                Btn_7.setEnabled(true);
                Btn_8.setEnabled(true);
                Btn_9.setEnabled(true);
                Btn_10.setEnabled(true);
                Btn_11.setEnabled(true);
                Btn_12.setEnabled(true);
                Btn_13.setEnabled(true);
                Btn_14.setEnabled(true);
                Btn_15.setEnabled(true);
                Btn_16.setEnabled(true);
            }
        }, 1000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public boolean AnswerCount() {
        if (wClick_cnt > 3)
            return false;
        else {
            if (wClick_cnt == 1) pLinear.setBackgroundResource(R.drawable.play_background_w1);
            if (wClick_cnt == 2) pLinear.setBackgroundResource(R.drawable.play_background_w2);
            if (wClick_cnt == 3) pLinear.setBackgroundResource(R.drawable.play_background_w3);
            wClick_cnt++;
            return true;
        }
    }

    public void Fail_Dialog() {
        new AlertDialog.Builder(this)
                .setTitle("실패")
                .setMessage("실패하셨습니다.")
                .setIcon(R.drawable.play_block_color_wrong)
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
                Btn_1.setBackgroundResource(R.drawable.play_block_color);
                Btn_1.setEnabled(false);
                aClick_cnt++;
                if (aClick_cnt == answer_cnt) Success_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button2:
                Log.v("Tag_Play", "Button AB Click");
                Btn_2.setBackgroundResource(R.drawable.play_block_color);
                Btn_2.setEnabled(false);
                aClick_cnt++;
                if (aClick_cnt == answer_cnt) Success_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button3:
                Log.v("Tag_Play", "Button AC Click");
                Btn_3.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button4:
                Log.v("Tag_Play", "Button AD Click");
                Btn_4.setBackgroundResource(R.drawable.play_block_color);
                Btn_4.setEnabled(false);
                aClick_cnt++;
                if (aClick_cnt == answer_cnt) Success_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button5:
                Log.v("Tag_Play", "Button BA Click");
                Btn_5.setBackgroundResource(R.drawable.play_block_color);
                Btn_5.setEnabled(false);
                aClick_cnt++;
                if (aClick_cnt == answer_cnt) Success_Dialog();
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
                Btn_8.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button9:
                Log.v("Tag_Play", "Button CA Click");
                Btn_9.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button10:
                Log.v("Tag_Play", "Button CB Click");
                Btn_10.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button11:
                Log.v("Tag_Play", "Button CC Click");
                Btn_11.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button12:
                Log.v("Tag_Play", "Button CD Click");
                Btn_12.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button13:
                Log.v("Tag_Play", "Button DA Click");
                Btn_13.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button14:
                Log.v("Tag_Play", "Button DB Click");
                Btn_14.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button15:
                Log.v("Tag_Play", "Button DC Click");
                Btn_15.setBackgroundResource(R.drawable.play_block_color_wrong);
                if (AnswerCount() == false) Fail_Dialog();
                break;
            case R.id.Btn_Play_Level1_Button16:
                Log.v("Tag_Play", "Button DD Click");
                Btn_16.setBackgroundResource(R.drawable.play_block_color_wrong);
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