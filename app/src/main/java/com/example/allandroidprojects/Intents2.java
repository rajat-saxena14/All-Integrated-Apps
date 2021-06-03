package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Intents2 extends AppCompatActivity {
    TextView tv;
    Button c;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents2);
        tv=findViewById(R.id.t1);
        tv.setText("HELLO" +" "+getIntent().getExtras().getString("k1")+ "," + "\n" +"YOUR EMAIL ID : "+ getIntent().getExtras().getString("k2"));
        // tv.setText("HELLO " + getIntent().getStringExtra("k1") + getIntent().getStringExtra("k2"));
/*
        c=findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent("com.example.alc2020.MA");
                startActivity(a);
            }
        });
*/
    }
}
