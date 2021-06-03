package com.example.allandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class RadioImage extends AppCompatActivity {
    RadioGroup rg;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_image);
        iv=findViewById(R.id.iv);
        rg=findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (group.getCheckedRadioButtonId())
                {
                    case R.id.r1:
                        iv.setImageResource(R.drawable.a);
                        break;

                    case R.id.r2:
                        iv.setImageResource(R.drawable.b);
                        break;

                    case R.id.r3:
                        iv.setImageResource(R.drawable.c);
                        break;
                }
            }
        });
    }
}