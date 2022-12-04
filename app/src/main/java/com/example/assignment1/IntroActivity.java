package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class IntroActivity extends AppCompatActivity {
    private TextView bio;
    ImageView logo;
    Animation anim,anim2;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        bio = findViewById(R.id.bio);
        logo = findViewById(R.id.logo);

        anim = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        bio.setAnimation(anim);

        anim2 = AnimationUtils.loadAnimation(this,R.anim.rotat);
        logo.setAnimation(anim2);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}