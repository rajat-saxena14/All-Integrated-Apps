package com.example.allandroidprojects;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Form2 extends AppCompatActivity {

    TextView recieved1,recieved2,recieved3,recieved4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);

        recieved1 = (TextView)findViewById(R.id.tv1);
        recieved2 = (TextView)findViewById(R.id.tv2);
        recieved3 = (TextView)findViewById(R.id.tv3);
        recieved4 = (TextView)findViewById(R.id.tv4);


        // create the get Intent object
        Intent i = getIntent();
        Bundle extras= i.getExtras();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str1 = i.getStringExtra("message_key1");
        String str2 = i.getStringExtra("message_key2");
        String str3 = i.getStringExtra("message_key3");
        String str4 = i.getStringExtra("message_key4");




        // display the string into textView
        recieved1.setText(str1);
        recieved2.setText(str2);
        recieved3.setText(str3);
        recieved4.setText(str4);

    }
}