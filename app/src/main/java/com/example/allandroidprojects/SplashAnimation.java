package com.example.allandroidprojects;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashAnimation extends AppCompatActivity {

    private static int SPLASH_SCREEN=8700;
    Animation topAnim, bottomAnim, rotate, slideR,slideL;
    ImageView iv;
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_animation);

        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        rotate= AnimationUtils.loadAnimation(this, R.anim.rotate);
        slideR = AnimationUtils.loadAnimation(this, R.anim.slider);
        slideL = AnimationUtils.loadAnimation(this, R.anim.slidel);

        iv=findViewById(R.id.iv);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);


        iv.startAnimation(rotate);
        t1.setAnimation(topAnim);
        t2.setAnimation(bottomAnim);
        t3.setAnimation(slideR);
        t4.setAnimation(slideL);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashAnimation.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        },SPLASH_SCREEN);

    }
}