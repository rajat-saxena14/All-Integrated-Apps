package com.example.allandroidprojects;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Asynctask extends AppCompatActivity {
    ListView lv;
    ArrayAdapter<String> ad;
    String[] data=new String[]{"abc","def","ghi","jkl","mno","pqr","stu","vwx","xyz","mno","jkl","uvw","pqr"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asynctask);
        lv=findViewById(R.id.lv1);
        lv.setAdapter(new ArrayAdapter<>(Asynctask.this, android.R.layout.simple_list_item_1, new ArrayList<>()));
        MyClass ob=new MyClass();
        ob.execute();
    }
    class MyClass extends AsyncTask<String,String,String>{
        @Override
        protected void onPreExecute(){
            ad= (ArrayAdapter<String>)lv.getAdapter();
        }

        @Override
        protected String doInBackground(String... strings){
            for(String a:data){
                publishProgress(a);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            return  "LOADING COMPLETED";
        }

        @Override
        protected void onProgressUpdate(String... values){
            super.onPreExecute();
            ad.add(values[0]);
        }
        @Override
        protected void onPostExecute(String s){
            super.onPostExecute(s);
            Toast.makeText(Asynctask.this, s, Toast.LENGTH_SHORT).show();
        }
    }
}