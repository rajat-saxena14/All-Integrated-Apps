package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContentProviders extends AppCompatActivity {
    Button b1;
    TextView t1;
    String[] p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_providers);
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_CONTACTS,Manifest.permission.WRITE_CONTACTS}, PackageManager.PERMISSION_GRANTED);
        b1=findViewById(R.id.b1);
        p=new String[]{ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY,ContactsContract.CommonDataKinds.Phone.NUMBER};
        t1=findViewById(R.id.t1);
    }

    public void ReteriveContactsName(View view) {
        ContentResolver cr=getContentResolver();
        t1.setText(" ");
        Cursor c=cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,p,null,null,null);
        while (c.moveToNext()){
            t1.setText(t1.getText().toString()+" "+c.getString(0)+" "+c.getString(1)+"\n");

        }

    }
}