package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class PreferenceActivity2 extends AppCompatActivity {
    Button b2;
    SharedPreferences sp;
    SharedPreferences.Editor ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference2);

        b2=findViewById(R.id.b2);
        sp=getSharedPreferences("myfile",MODE_PRIVATE);
        ed=sp.edit();
        Intent i= new Intent(PreferenceActivity2.this, PreferenceActivity1.class);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.remove("loginstatus");
                ed.commit();
                startActivity(i);
            }
        });

    }
}