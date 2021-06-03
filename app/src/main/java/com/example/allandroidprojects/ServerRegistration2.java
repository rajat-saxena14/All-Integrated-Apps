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

import static com.android.volley.Request.Method.POST;

public class ServerRegistration2 extends AppCompatActivity {
    RequestQueue q1;
    EditText e5,e6;
    StringRequest sq1;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_registration2);
        e5=findViewById(R.id.e5);
        e6=findViewById(R.id.e6);
        url="http://192.168.43.250/app/b.php";
    }
    public void LOGMEIN(View view){
        sq1= new StringRequest(POST,url,new Response.Listener<String>(){
            @Override
            public void onResponse(String response){
                Toast.makeText(ServerRegistration2.this,response,Toast.LENGTH_SHORT).show();
                if(response.equals("SUCCESS")) {
                    Intent i = new Intent(ServerRegistration2.this, ServerRegistration3.class);
                    startActivity(i);
                }
            }
        }, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error){
                Toast.makeText(ServerRegistration2.this, "SOMETHING WRONG HAPPENED", Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> h=new HashMap<>();
                h.put("UNAME",e5.getText().toString());
                h.put("PASS",e6.getText().toString());
                return h;
            }
        };
        q1= Volley.newRequestQueue(getApplicationContext());
        q1.add(sq1);
    }
}