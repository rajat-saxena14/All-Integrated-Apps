package com.example.allandroidprojects;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;


public class MainActivity extends AppCompatActivity  {
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);

        Myadapter ad=new Myadapter(MainActivity.this);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent i=new Intent(view.getContext(), Alc1.class);
                    startActivity(i);
                }
                if(position==1)
                {
                    Intent i=new Intent(view.getContext(), Intents1.class);
                    startActivity(i);
                }
                if(position==2)
                {
                    Intent i=new Intent(view.getContext(), MultipleIntents1.class);
                    startActivity(i);
                }
                if(position==3)
                {
                    Intent i=new Intent(view.getContext(), Form1.class);
                    startActivity(i);
                }
                if(position==4)
                {
                    Intent i=new Intent(view.getContext(), LinearLayoutCalculator.class);
                    startActivity(i);
                }
                if(position==5)
                {
                    Intent i=new Intent(view.getContext(), RelativeLayoutFB.class);
                    startActivity(i);
                }
                if(position==6)
                {
                    Intent i=new Intent(view.getContext(), RadioImage.class);
                    startActivity(i);
                }
                if(position==7)
                {
                    Intent i=new Intent(view.getContext(), Checkbox.class);
                    startActivity(i);
                }
                if(position==8)
                {
                    Intent i=new Intent(view.getContext(), CheckboxDialog.class);
                    startActivity(i);
                }
                if(position==9)
                {
                    Intent i=new Intent(view.getContext(), ToggleSwitchBtn.class);
                    startActivity(i);
                }
                if(position==10)
                {
                    Intent i=new Intent(view.getContext(), SFrag1.class);
                    startActivity(i);
                }
                if(position==11)
                {
                    Intent i=new Intent(view.getContext(), DFrag1.class);
                    startActivity(i);
                }
                if(position==12)
                {
                    Intent i=new Intent(view.getContext(), FragmentCommunication1.class);
                    startActivity(i);
                }
                if(position==13)
                {
                    Intent i=new Intent(view.getContext(), Progressbar.class);
                    startActivity(i);
                }
                if(position==14)
                {
                    Intent i=new Intent(view.getContext(), Seekbar.class);
                    startActivity(i);
                }
                if(position==15)
                {
                    Intent i=new Intent(view.getContext(), WebBrowser.class);
                    startActivity(i);
                }
                if(position==16)
                {
                    Intent i=new Intent(view.getContext(), MusicPlayer.class);
                    startActivity(i);
                }
                if(position==17)
                {
                    Intent i=new Intent(view.getContext(), MyMusicPlayer.class);
                    startActivity(i);
                }
                if(position==18)
                {
                    Intent i=new Intent(view.getContext(), VideoPlayer.class);
                    startActivity(i);
                }
                if(position==19)
                {
                    Intent i=new Intent(view.getContext(), AlertBox.class);
                    startActivity(i);
                }
                if(position==20)
                {
                    Intent i=new Intent(view.getContext(), CustomAlertDialog1.class);
                    startActivity(i);
                }
                if(position==21)
                {
                    Intent i=new Intent(view.getContext(), Menus.class);
                    startActivity(i);
                }
                if(position==22)
                {
                    Intent i=new Intent(view.getContext(), Listview.class);
                    startActivity(i);
                }
                if(position==23)
                {
                    Intent i=new Intent(view.getContext(), CustomToast1.class);
                    startActivity(i);
                }
                if(position==24)
                {
                    Intent i=new Intent(view.getContext(), Notifications1.class);
                    startActivity(i);
                }
                if(position==25)
                {
                    Intent i=new Intent(view.getContext(), NotificationActionInputNew1.class);
                    startActivity(i);
                }
                if(position==26)
                {
                    Intent i=new Intent(view.getContext(), Sharedpreferences.class);
                    startActivity(i);
                }
                if(position==27)
                {
                    Intent i=new Intent(view.getContext(), PreferenceActivity1.class);
                    startActivity(i);
                }
                if(position==28)
                {
                    Intent i=new Intent(view.getContext(), MenuWithSettings1.class);
                    startActivity(i);
                }
                if(position==29)
                {
                    Intent i=new Intent(view.getContext(), SQLITE1.class);
                    startActivity(i);
                }
                if(position==30)
                {
                    Intent i=new Intent(view.getContext(), ContentProviders.class);
                    startActivity(i);
                }
                if(position==31)
                {
                    Intent i=new Intent(view.getContext(), Myservice1.class);
                    startActivity(i);
                }
                if(position==32)
                {
                    Intent i=new Intent(view.getContext(), Asynctask.class);
                    startActivity(i);
                }
                if(position==33)
                {
                    Intent i=new Intent(view.getContext(), ServerRegistration1.class);
                    startActivity(i);
                }
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.mainoptionmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menus:
                break;
            case R.id.menua:
                LayoutInflater factory = LayoutInflater.from(MainActivity.this);
                final View view = factory.inflate(R.layout.aboutus, null);
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("About Us")
                       .setMessage(Html.fromHtml("This Bundle of Applications is Developed by "+"<b>"+"<i>"+"Rajat Saxena."+"</i>"+"</b>"))
                       .setCancelable(true)  //setConcelable is invisible dialog box user touch activity
                       .setIcon(R.drawable.logo)
                       .setView(view)
                       .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                Dialog d = builder.create();
                d.show();

                break;
            case R.id.menuc:
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                builder1.setTitle("Contact us")
                        .setMessage(Html.fromHtml("Please Contact the Application Developer on "+"<b>"+"<i>"+"Rajat14.rs@gmail.com"+"</i>"+"</b>"))
                        .setCancelable(true)
                        .setIcon(R.drawable.logo)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                Dialog dd = builder1.create();
                dd.show();

                break;
            case R.id.menuq:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
                builder2.setTitle("").setMessage("Are you sure to quit the Application?").setCancelable(true)
                        .setPositiveButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                Dialog ed = builder2.create();
                ed.show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}