package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MultipleIntents2 extends AppCompatActivity {
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_intents2);

        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);

        Intent i = getIntent();
        String str1 = i.getStringExtra("key1");
        tv1.setText(str1);
        String str2= i.getStringExtra("key2");
        tv2.setText(str2);

    }
}