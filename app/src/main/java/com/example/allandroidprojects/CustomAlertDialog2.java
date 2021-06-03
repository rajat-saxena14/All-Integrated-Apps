package com.example.allandroidprojects;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

public class CustomAlertDialog2 extends AppCompatDialogFragment{
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        LayoutInflater li=getActivity().getLayoutInflater();
        View v=li.inflate(R.layout.activity_custom_alert_dialog2,null);
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("ACTION NEEDED").setView(v);
        Dialog d=builder.create();
        d.show();
        return d;

    }
}
