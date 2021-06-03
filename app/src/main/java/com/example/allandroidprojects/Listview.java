package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Listview extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String names[]={"CHOCOS","BISCUITS","BOOST"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lv=findViewById(R.id.lv);

        ArrayAdapter<String> ard=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
        lv.setAdapter(ard);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(Listview.this,names[position],Toast.LENGTH_SHORT).show();
    }
}