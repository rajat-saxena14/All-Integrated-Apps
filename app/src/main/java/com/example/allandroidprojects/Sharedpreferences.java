package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sharedpreferences extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2,e3,e4;
    TextView t1,t2,t3,t4;
    String s1,s2,s3,s4;
    SharedPreferences p;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);


        // p = getPreferences(MODE_PRIVATE);
        p=getSharedPreferences("myfile",MODE_PRIVATE);
        editor=p.edit();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                editor.putString("key", s1);
                editor.putString("key2", s2);
                editor.putString("key3", s3);
                editor.putString("key4", s4);
                editor.putString("key1", "Rajat Saxena");
                editor.commit();
                Toast.makeText(Sharedpreferences.this,"DATA STORED SUCCESSFULLY", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=p.getString("key", "nothing");
                s2=p.getString("key2", "nothing");
                s3=p.getString("key3", "nothing");
                s4=p.getString("key4", "nothing");

                t1.setText(s1);
                t2.setText(s2);
                t3.setText(s3);
                t4.setText(s4);

            }
        });

    }
}