package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ServerRegistration3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_registration3);
    }
    public void logout(View view) {
        Toast.makeText(ServerRegistration3.this,"USER LOGGED OUT SUCCESSFULLY!",Toast.LENGTH_SHORT).show();
        
    }
}