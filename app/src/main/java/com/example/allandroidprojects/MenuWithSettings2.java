package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MenuWithSettings2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_with_settings2);
        getFragmentManager().beginTransaction().add(R.id.fl,new Settingsmenuapp()).commit();
    }
}