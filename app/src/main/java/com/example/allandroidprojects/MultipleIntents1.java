package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultipleIntents1 extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_intents);

        b1= (Button)findViewById(R.id.mi1b1);
        b2= (Button)findViewById(R.id.mi1b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MultipleIntents1.this,MultipleIntents2.class);
                i.putExtra("key1","Welcome to activity2 entry point with the help of intent1 data transfer");
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MultipleIntents1.this,MultipleIntents2.class);
                i.putExtra("key2","Welcome to activity2 entry point with the help of intent2 data transfer");
                startActivity(i);
            }
        });


    }
}