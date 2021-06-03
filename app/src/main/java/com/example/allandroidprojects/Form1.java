package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Form1 extends AppCompatActivity {

    // define the variable
    Button b;
    EditText name,rollno,course,branch;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);
        b = (Button)findViewById(R.id.b1);
        name = (EditText)findViewById(R.id.name);
        rollno = (EditText)findViewById(R.id.rollno);
        course = (EditText)findViewById(R.id.course);
        branch = (EditText)findViewById(R.id.branch);


        // add the OnClickListener in sender button
        // after clicked this button following Instruction will run
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                // get the value which input by user in EditText
                // and convert it to string
                String str1 = name.getText().toString();
                String str2 = rollno.getText().toString();
                String str3 = course.getText().toString();
                String str4 = branch.getText().toString();


                Bundle extras=new Bundle();
                extras.putString("message_key1", str1);
                extras.putString("message_key2", str2);
                extras.putString("message_key3", str3);
                extras.putString("message_key4", str4);



                // Create the Intent object of this class Context() to Second_activity class
                Intent i = new Intent(getApplicationContext(), Form2.class);
                // now by putExtras method put the value in key, value pair transfer data to intent object
                i.putExtras(extras);
                // start the Intent
                startActivity(i);
            }
        });
    }
}