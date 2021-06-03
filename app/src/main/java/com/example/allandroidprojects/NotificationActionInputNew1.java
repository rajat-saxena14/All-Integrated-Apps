package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.RemoteInput;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class NotificationActionInputNew1 extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_action_input_new1);
        b= findViewById(R.id.button);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel c1=new NotificationChannel("CHANNEL1","CHANNEL1", NotificationManager.IMPORTANCE_HIGH);
            NotificationManager nm=getSystemService(NotificationManager.class);
            nm.createNotificationChannel(c1);

        }
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i=new Intent(NotificationActionInputNew1.this, NotificationActionInputNew2.class);
                PendingIntent pi= PendingIntent.getActivity(NotificationActionInputNew1.this, 0,i,0);

                RemoteInput.Builder rbuilder=new RemoteInput.Builder("rply");
                rbuilder.setLabel("please type your reply");
                RemoteInput ri=rbuilder.build();

                NotificationCompat.Action.Builder actionbuilder= new NotificationCompat.Action.Builder(R.mipmap.ic_launcher,"REPLY",pi);
                actionbuilder.addRemoteInput(ri);
                NotificationCompat.Action action1=actionbuilder.build();

                NotificationCompat.Builder builder=new NotificationCompat.Builder(NotificationActionInputNew1.this,"CHANNEL1");
                builder.setContentTitle("MY NOTIFICATION")
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentText("YOU GOT A NEW NOTIFICATION")
                        .addAction(action1)
                        .setAutoCancel(true);

                Notification n=builder.build();
                NotificationManagerCompat nmc=NotificationManagerCompat.from(NotificationActionInputNew1.this);
                nmc.notify(55,n);
            }
        });
    }
}