package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class ToggleSwitchBtn extends AppCompatActivity {
    ToggleButton t;
    ImageView i;
    Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_switch_btn);

        t=findViewById(R.id.toggleButton);

        s=findViewById(R.id.switch1);
        i=findViewById(R.id.imageView);

        t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    i.setVisibility(View.VISIBLE);
                else
                    i.setVisibility(View.INVISIBLE);

            }
        });
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    i.setVisibility(View.VISIBLE);
                else
                    i.setVisibility(View.INVISIBLE);

            }
        });
    }
}