package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notifications1 extends AppCompatActivity {
    Button b,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications1);
        b=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            NotificationChannel c1 = new NotificationChannel("CHANNEL1", "CHANNEL 1", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel c2 = new NotificationChannel("CHANNEL2", "CHANNEL 2", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager nm = getSystemService(NotificationManager.class);
            nm.createNotificationChannel(c1);
            nm.createNotificationChannel(c2);
        }

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NotificationCompat.Builder builder=new NotificationCompat.Builder(Notifications1.this,"CHANNEL1");
                Intent i=new Intent(Notifications1.this,Notifications2.class);
                PendingIntent pi=PendingIntent.getActivity(Notifications1.this,0,i,0);
                builder.setContentTitle("MY NOTIFICATION")
                        .setContentText("you got a new Notification")
                        .setAutoCancel(true)
                        .setContentIntent(pi)
                        .setSmallIcon(R.mipmap.ic_launcher);
                Notification n=builder.build();
                NotificationManagerCompat nmc=NotificationManagerCompat.from(Notifications1.this);
                nmc.notify(12, n);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NotificationCompat.Builder builder=new NotificationCompat.Builder(Notifications1.this,"CHANNEL2");
                Intent i=new Intent(Notifications1.this,Notifications2.class);
                PendingIntent pi=PendingIntent.getActivity(Notifications1.this,0,i,0);
                builder.setContentTitle("MY NOTIFICATION FOR CHANNEL 2")
                        .setContentText("you got a new Notification")
                        .setAutoCancel(true)
                        .setContentIntent(pi)
                        .setSmallIcon(R.mipmap.ic_launcher);
                Notification n=builder.build();
                NotificationManagerCompat nmc=NotificationManagerCompat.from(Notifications1.this);
                nmc.notify(22, n);

            }
        });
    }
}