package com.example.allandroidprojects;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SFrag2 extends Fragment {
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("flc","FRAGMENT: onCreateView State Achieved");
        Toast.makeText(getActivity(),"FRAGMENT: onCreateView State Achieved",Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.activity_s_frag2, container, false);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("flc","FRAGMENT: onAttach State Achieved");
        Toast.makeText(getActivity(),"FRAGMENT: onAttach State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("flc","FRAGMENT: onActivityCreated State Achieved");
        Toast.makeText(getActivity(),"FRAGMENT: onActivityCreated State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("flc","FRAGMENT: onStart State Achieved");
        Toast.makeText(getActivity(),"FRAGMENT: onStart State Achieved",Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.i("flc","FRAGMENT: onResume State Achieved");
        Toast.makeText(getActivity(),"FRAGMENT: onResume State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("flc","FRAGMENT: onPause State Achieved");
        Toast.makeText(getActivity(),"FRAGMENT: onPause State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("flc","FRAGMENT: onStop State Achieved");
        Toast.makeText(getActivity(),"FRAGMENT: onStop State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("flc","FRAGMENT: onDestroy State Achieved");
        Toast.makeText(getActivity(),"FRAGMENT: onDestroy State Achieved",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("flc","FRAGMENT: onDetach State Achieved");
        Toast.makeText(getActivity(),"FRAGMENT: onDetach State Achieved",Toast.LENGTH_SHORT).show();
    }
}