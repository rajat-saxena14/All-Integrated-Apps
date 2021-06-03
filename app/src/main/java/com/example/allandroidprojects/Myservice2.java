package com.example.allandroidprojects;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Myservice2 extends Service {
    public static boolean b = true;
    int counter;
    MyserviceBinder binder=new MyserviceBinder();

    @Override
    public void onCreate() {
        Log.i("message", "onCreate CALLED");
        Toast.makeText(this,"onCreate CALLED",Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Log.i("message", "onStart CALLED");
        Toast.makeText(this,"onStart CALLED",Toast.LENGTH_SHORT).show();
        super.onStart(intent, startId);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("message", "onStartCommand CALLED");
        Toast.makeText(this,"onStartCommand CALLED",Toast.LENGTH_SHORT).show();

        new Thread(new Runnable() {
            @Override
            public void run() {

                counter=1;
                Log.i("message", "NEW THREAD STARTED"+ Thread.currentThread().getId());

                while(b)
                {
                    Log.i("message", "counter incremented  " + (++counter));
                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.i("message", "onDestroy CALLED");
        Toast.makeText(this," onDestroy CALLED",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    class MyserviceBinder extends Binder{
        public Myservice2 findservice(){
            return Myservice2.this;

        }
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i("message", "onUnbind  CALLED");
        Toast.makeText(this,"onUnbind  CALLED",Toast.LENGTH_SHORT).show();
        return super.onUnbind(intent);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("message", "onBind  CALLED");
        Toast.makeText(this,"onbind  CALLED",Toast.LENGTH_SHORT).show();
        return binder;
    }

    public int getCounter(){
        Log.i("message", "getCounter  CALLED");
        Toast.makeText(this,"Service Progress",Toast.LENGTH_SHORT).show();
        return counter;
    }
}
