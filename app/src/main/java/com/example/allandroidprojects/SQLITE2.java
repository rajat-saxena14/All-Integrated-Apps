package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SQLITE2 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;
    TextView tv;
    String[] p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_q_l_i_t_e2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        tv=findViewById(R.id.textView);
        p=new String[]{SQLITESHOPDBCONTRACT3.PRODUCTS_ENTRY.NAME,SQLITESHOPDBCONTRACT3.PRODUCTS_ENTRY.PRICE};
    }

    public void STOREDATA(View view) {
        ContentValues cv=new ContentValues();
        cv.put("NAME",e1.getText().toString());
        cv.put("PRICE",e2.getText().toString());
        Uri uri=getContentResolver().insert(SQLITESHOPDBCONTRACT3.PRODUCTS_ENTRY.CONTENT_URI,cv);
        Toast.makeText(this, uri.toString(),Toast.LENGTH_SHORT).show();
    }

    public void GetAllData(View view) {
        // String s=null;
        tv.setText("");
        Cursor c= getContentResolver().query(SQLITESHOPDBCONTRACT3.PRODUCTS_ENTRY.CONTENT_URI,p,null,null,null);
        while(c.moveToNext())
        {
            tv.setText(tv.getText().toString()+" "+c.getString(0)+"   "+c.getString(1) +"\n");
        }

    }

    public void DELDATA(View view) {

        int i=getContentResolver().delete(SQLITESHOPDBCONTRACT3.PRODUCTS_ENTRY.CONTENT_URI,SQLITESHOPDBCONTRACT3.PRODUCTS_ENTRY.NAME+"=?",new String[]{e1.getText().toString()});
        Toast.makeText(this,"DELETE",Toast.LENGTH_SHORT).show();
    }

    public void update(View view) {
        ContentValues cv=new ContentValues();
        cv.put("NAME",e1.getText().toString());
        cv.put("PRICE",e2.getText().toString());
        int i=getContentResolver().update(SQLITESHOPDBCONTRACT3.PRODUCTS_ENTRY.CONTENT_URI,cv,SQLITESHOPDBCONTRACT3.PRODUCTS_ENTRY.NAME+"=?",new String[]{e1.getText().toString()});
        Toast.makeText(this,"SUCCESSFULLY UPDATED",Toast.LENGTH_SHORT).show();
    }
}