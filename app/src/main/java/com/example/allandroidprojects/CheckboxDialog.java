package com.example.allandroidprojects;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CheckboxDialog extends AppCompatActivity {
    TextView text;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_checkboxdialog);
        super.onCreate(savedInstanceState);
        text = findViewById(R.id.click);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });
    }
    private void showAlertDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(CheckboxDialog.this);
        alertDialog.setTitle("This a dialog with some simple text...");
        alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(CheckboxDialog.this,"OK", Toast.LENGTH_SHORT).show();
            }
        });


        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        String[] items = {"Google","Apple","Microsoft"};
        boolean[] checkedItems = {false, false, false};
        alertDialog.setMultiChoiceItems(items, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                switch (which) {
                    case 0:
                        if(isChecked)
                            Toast.makeText(CheckboxDialog.this, "Google Checked", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        if(isChecked)
                            Toast.makeText(CheckboxDialog.this, "Apple Checked", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        if(isChecked)
                            Toast.makeText(CheckboxDialog.this, "Microsoft Checked", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        AlertDialog alert = alertDialog.create();
        alert.setCanceledOnTouchOutside(false);
        alert.show();
    }
}