package com.example.allandroidprojects;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentCommunication2 extends Fragment {
    Button b1;
    EditText e;
    DataListener dl;
    public interface DataListener{
        void sendDataToActivity(String s);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.activity_fragment_communication2, container, false);
        b1=v.findViewById(R.id.b1);
        e=v.findViewById(R.id.e1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl.sendDataToActivity(e.getText().toString());
            }
        });
        return v;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dl= (DataListener) context;
    }
}