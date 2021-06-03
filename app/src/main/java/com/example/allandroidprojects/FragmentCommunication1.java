package com.example.allandroidprojects;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class FragmentCommunication1 extends AppCompatActivity implements  FragmentCommunication2.DataListener {
    FragmentCommunication2 f1;
    FragmentCommunication3 f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_communication1);
        f1=new FragmentCommunication2();
        f2=new FragmentCommunication3();
        getSupportFragmentManager().beginTransaction().replace(R.id.f1,f1).replace(R.id.f2,f2).commit();

    }


    @Override
    public void sendDataToActivity(String s) {
        f2.setDataOnTextview(s);

    }
}
