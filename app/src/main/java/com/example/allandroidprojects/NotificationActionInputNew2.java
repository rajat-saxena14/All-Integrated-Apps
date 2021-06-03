package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.app.RemoteInput;
import android.os.Bundle;
import android.widget.TextView;

public class NotificationActionInputNew2 extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_action_input_new2);
        t=findViewById(R.id.textView);
        Bundle b= RemoteInput.getResultsFromIntent(getIntent());
        t.setText(b.getString("rply"));
    }
}