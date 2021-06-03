package com.example.allandroidprojects;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class PreferenceActivity1 extends AppCompatActivity {
    Button b1;
    CheckBox c1;
    EditText e1,e2;
    String s1,s2;
    SharedPreferences sp;
    SharedPreferences.Editor ed;
    Boolean status=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference1);

        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        c1=findViewById(R.id.c1);
        sp=getSharedPreferences("myfile",MODE_PRIVATE);
        ed=sp.edit();
        Intent i= new Intent(PreferenceActivity1.this, PreferenceActivity2.class);

        status=sp.getBoolean("loginstatus",false);
        c1.setChecked(status);
        if(status)
        {
            startActivity(i);
            finish();
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if(s1.equals("user")&&s2.equals("pass"))
                {
                    if(c1.isChecked())
                    {
                        ed.putBoolean("loginstatus",true);
                        ed.commit();
                    }
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}