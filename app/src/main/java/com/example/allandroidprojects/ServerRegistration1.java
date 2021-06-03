package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

import static  com.android.volley.Request.Method.POST;
public class ServerRegistration1 extends AppCompatActivity {
    RequestQueue q;
    EditText e1,e2,e3;
    StringRequest sq;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_registration1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        url="http://192.168.43.250/app/a.php";
    }
    public void REGISTERME(View view){
        sq= new StringRequest(POST,url,new Response.Listener<String>(){
            @Override
            public void onResponse(String response){
                Toast.makeText(ServerRegistration1.this,response,Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error){
                Toast.makeText(ServerRegistration1.this, "SOMETHING WRONG HAPPENED", Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError{
                Map<String,String> h=new HashMap<>();
                h.put("UNAME",e1.getText().toString());
                h.put("PASS",e2.getText().toString());
                h.put("PHONE",e3.getText().toString());
                return h;
            }
        };
        q= Volley.newRequestQueue(getApplicationContext());
        q.add(sq);
    }
    public void go2ac2(View view){
        startActivity(new Intent(ServerRegistration1.this,ServerRegistration2.class));
    }
}