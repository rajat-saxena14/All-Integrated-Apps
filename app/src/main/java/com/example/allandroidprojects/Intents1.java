package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Intents1 extends AppCompatActivity {
    Button b;
    EditText e,ee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents1);
        b=findViewById(R.id.b1);
        e=findViewById(R.id.e1);
        ee=findViewById(R.id.e2);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Intents1.this,Intents2.class);
                String s1=e.getText().toString();
                String s2=ee.getText().toString();

                Bundle bundle=new Bundle();
                bundle.putString("k1",s1);
                bundle.putString("k2",s2);

                i.putExtras(bundle);

                // i.putExtra("k1",s1);
                //i.putExtra("k2",s2);


                //Intent i = new Intent("com.example.alc2020.MA");
                //Intent i= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

    }
}