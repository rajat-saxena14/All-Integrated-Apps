package com.example.allandroidprojects;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SFrag1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_frag1);
        Log.i("flc","Activity: onCreate State Achieved");
        Toast.makeText(SFrag1.this, "Activity: onCreate State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("flc","Activity: onStart State Achieved");
        Toast.makeText(SFrag1.this, "Activity: onStart State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("flc","Activity: onStop State Achieved");
        Toast.makeText(SFrag1.this, "Activity: onStop State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("flc","Activity: onDestroy State Achieved");
        Toast.makeText(SFrag1.this, "Activity: onDestroy State Achieved",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("flc","Activity: onPause State Achieved");
        Toast.makeText(SFrag1.this, "Activity: onPause State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("flc","Activity: onResume State Achieved");
        Toast.makeText(SFrag1.this, "Activity: onResume State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("flc","Activity: onRestart State Achieved");
        Toast.makeText(SFrag1.this, "Activity: onRestart State Achieved",Toast.LENGTH_SHORT).show();
    }

}