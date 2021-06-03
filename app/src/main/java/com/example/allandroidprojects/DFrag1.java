package com.example.allandroidprojects;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DFrag1 extends AppCompatActivity {
    Button b1,b2;
    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_frag1);
        b1=findViewById(R.id.Db1);
        b2=findViewById(R.id.Db2);
        fm=getSupportFragmentManager();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft=fm.beginTransaction();
                ft.add(R.id.frameLayout,new DFrag2());
                ft.addToBackStack("f1");
                ft.commit();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft=fm.beginTransaction();
                ft.add(R.id.frameLayout,new DFrag3());
                ft.addToBackStack("f1");
                ft.commit();

            }
        });

    }
}