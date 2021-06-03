package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Myservice1 extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5;
    Intent is;
    TextView t1;
    ServiceConnection con;
    boolean binding;
    Myservice2 myservice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myservice1);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        t1=findViewById(R.id.t1);
        is=new Intent(getApplicationContext(),Myservice2.class);
        Log.i("message", "MAIN THREAD STARTED"+ Thread.currentThread().getId());
        Toast.makeText(this,"MAIN THREAD STARTED",Toast.LENGTH_SHORT).show();
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b1:
                Myservice2.b=true;
                Toast.makeText(this,"Start Service",Toast.LENGTH_SHORT).show();
                startService(is);
                break;

            case R.id.b2:
                Myservice2.b=false;
                Toast.makeText(this,"Stop Service",Toast.LENGTH_SHORT).show();
                stopService(is);
                break;

            case R.id.b3:
                Toast.makeText(this,"onServiceConnected CALLED",Toast.LENGTH_SHORT).show();
                if(con==null){
                    con=new ServiceConnection(){


                        @Override
                        public void onServiceConnected(ComponentName name, IBinder service) {
                            Log.i("message", "onServiceConnected CALLED");

                            Myservice2.MyserviceBinder obj=(Myservice2.MyserviceBinder) service;
                            myservice=obj.findservice();
                            binding=true;
                        }

                        @Override
                        public void onServiceDisconnected(ComponentName name) {
                            binding =false;

                        }
                    };
                }
                bindService(is,con, Context.BIND_AUTO_CREATE);

                break;

            case R.id.b4:
                if(binding){
                    unbindService(con);
                    binding =false;

                }
                break;

            case R.id.b5:
                if(binding) {
                    t1.setText(String.valueOf(myservice.getCounter()));
                }
                else{
                    t1.setText("NO SERVICE IS CONNECTED RIGHT NOW");
                }
                break;

            default:
                break;
        }

    }
}