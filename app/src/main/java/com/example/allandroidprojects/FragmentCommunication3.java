package com.example.allandroidprojects;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentCommunication3 extends Fragment {
    TextView t;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.activity_fragment_communication3, container, false);
        t=v.findViewById(R.id.t1);
        return v;
    }
    void setDataOnTextview(String s){
        t.setText("Hello "+s);
    }
}