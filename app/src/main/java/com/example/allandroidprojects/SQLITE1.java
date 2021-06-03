package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SQLITE1 extends AppCompatActivity {
    EditText e1,e2,e3;
    SQLITESHOPDB2 db;
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_q_l_i_t_e1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        t=findViewById(R.id.t1);
        db=new SQLITESHOPDB2(SQLITE1.this);
    }

    public void STOREDETAILS(View view) {
        long result = db.insertindatabase(e2.getText().toString(),e3.getText().toString());
        if(result>=0){
            Toast.makeText(this, "DATA SUCCESSFULLY INSERTED IN DATABASE", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "DATA NOT INSERTED IN DATABASE", Toast.LENGTH_SHORT).show();

        }
    }

    public void FINDPRODUCT(View view) {
        Cursor c =  db.findfromdatabase(e1.getText().toString());
        if(c.moveToNext()){
            e2.setText(c.getString(1));
            e3.setText(c.getString(2));
        }
    }

    public void SHOWALL(View view) {
        t.setText("");
        Cursor c =  db.findallfromdatabase();
        while (c.moveToNext()){
            t.setText(t.getText().toString()+String.valueOf(c.getInt(0))+ "   "+c.getString(1)+"   "+c.getString(2) +"\n");
        }
    }

    public void DELETEPRODUCT(View view) {
        int i= db.deletefromdatabase(e1.getText().toString());
        e1.setText("");
        e2.setText("");
        e3.setText("");

        Toast.makeText(this, "PRODUCT DELETED SUCCESSFULLY",Toast.LENGTH_SHORT).show();
        SHOWALL(view);
    }
    public void MAINACTIVITY2(View view) {
        startActivity(new Intent(SQLITE1.this,SQLITE2.class));
    }
}