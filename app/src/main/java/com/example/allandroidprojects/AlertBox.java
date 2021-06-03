package com.example.allandroidprojects;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertBox extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_box);
        b=findViewById(R.id.Alb1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(AlertBox.this);
                builder.setTitle("ACTION NEEDED").setMessage("Do you Want to Leave?").setCancelable(true)  //setConcelable is invisible dialog box user touch activity
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AlertBox.this, "You Clicked on the Yes Button", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AlertBox.this, "You Clicked on the NO Button", Toast.LENGTH_SHORT).show();

                            }
                        });
                Dialog d=builder.create();
                d.show();


                //builder.setMessage("Do you Want to Leave?");



            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(AlertBox.this);
        builder.setTitle("ACTION NEEDED").setMessage("Do you Want to Leave?").setCancelable(true)  //setConcelable is invisible dialog box user touch activity
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });
        Dialog d=builder.create();
        d.show();
    }
}