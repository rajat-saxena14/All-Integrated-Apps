package com.example.allandroidprojects;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashAnimation1 extends AppCompatActivity {

    private static int SPLASH_SCREEN=6500;
    MediaPlayer startups;
    Animation topAnim, rotate, slideR;
    ImageView iv1,iv2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_animation1);

        startups= MediaPlayer.create(SplashAnimation1.this,R.raw.startup);
        startups.start();

        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_animation);
        rotate= AnimationUtils.loadAnimation(this, R.anim.rotate);
        slideR = AnimationUtils.loadAnimation(this, R.anim.slider);

        iv2=findViewById(R.id.iv1);
        t1=findViewById(R.id.t1);



        iv2.startAnimation(rotate);
        t1.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashAnimation1.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        },SPLASH_SCREEN);

    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}