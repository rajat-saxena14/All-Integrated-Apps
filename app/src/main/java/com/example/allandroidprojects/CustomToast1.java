package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomToast1 extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast1);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater i=getLayoutInflater();
                View v1 =i.inflate(R.layout.activity_custom_toast2,null);
                Toast t=new Toast(CustomToast1.this);
                t.setView(v1);
                t.setGravity(Gravity.BOTTOM,0,0);
                t.show();


            }
        });
    }
}