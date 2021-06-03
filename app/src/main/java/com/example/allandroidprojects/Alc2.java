package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Alc2 extends AppCompatActivity {
    Button alc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc2);
        alc2=findViewById(R.id.alcb2);
        alc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii = new Intent(Alc2.this, Alc1.class);
                startActivity(ii);
            }
        });
        Toast.makeText(Alc2.this, "activity 2 : onCreate state Achieved", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(Alc2.this, "activity 2 : onStart state Achieved", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(Alc2.this, "activity 2 : onStop state Achieved", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(Alc2.this, "activity 2 : onDestory state Achieved", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(Alc2.this, "activity 2 : onPause state Achieved", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(Alc2.this, "activity 2 : onResume state Achieved", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(Alc2.this, "activity 2 : onRestart state Achieved", Toast.LENGTH_SHORT).show();
    }
}