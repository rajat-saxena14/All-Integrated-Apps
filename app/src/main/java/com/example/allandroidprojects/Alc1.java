package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Alc1 extends AppCompatActivity {
    Button alc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc1);
        alc=findViewById(R.id.alc1b1);
        alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Alc1.this, Alc2.class);
                startActivity(i);
            }
        });
        Toast.makeText(Alc1.this, "activity 1 : onCreate state Achieved", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(Alc1.this, "activity 1 : onStart state Achieved", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(Alc1.this, "activity 1 : onStop state Achieved", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(Alc1.this, "activity 1 : onDestory state Achieved", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(Alc1.this, "activity 1 : onPause state Achieved", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(Alc1.this, "activity 1 : onResume state Achieved", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(Alc1.this, "activity 1 : onRestart state Achieved", Toast.LENGTH_SHORT).show();
    }
}
