package com.example.allandroidprojects;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MenuWithSettings1 extends AppCompatActivity {
    ConstraintLayout cl;
    TextView t1,t2;
    SharedPreferences sp,sp1;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_with_settings1);
        cl=findViewById(R.id.home);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        sp= PreferenceManager.getDefaultSharedPreferences(this);
        sp1=getSharedPreferences("com.example.allandroidprojects_preferences.xml",MODE_PRIVATE);
    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.onmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        switch (item.getItemId())
        {
            case R.id.s:
                Intent i=new Intent(MenuWithSettings1.this,MenuWithSettings2.class);
                startActivity(i);
                break;

            case R.id.e:

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume(){
        super.onResume();
        cl.setBackgroundColor(Color.parseColor(sp.getString("l1","#ffffff")));
        s1=sp.getString("e1","RAJAT");
        t1.setText(s1);
        s2=sp.getString("e2","20");
        t2.setText(s2);
    }
}