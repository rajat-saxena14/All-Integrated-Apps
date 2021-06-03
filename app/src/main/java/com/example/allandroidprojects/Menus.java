package com.example.allandroidprojects;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class Menus extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    TextView tv;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);
        tv = findViewById(R.id.menutv);
        cl = findViewById(R.id.cl);
        registerForContextMenu(tv);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.context_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.r:
                cl.setBackgroundColor(getResources().getColor(R.color.RED));
                break;

            case R.id.b:
                cl.setBackgroundColor(getResources().getColor(R.color.BLUE));
                break;
            case R.id.g:
                cl.setBackgroundColor(getResources().getColor(R.color.GREEN));
                break;
            case R.id.w:
                cl.setBackgroundColor(getResources().getColor(R.color.white));
                break;

        }
        return super.onContextItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menus:
                break;
            case R.id.menua:
                AlertDialog.Builder builder = new AlertDialog.Builder(Menus.this);
                LayoutInflater factory = LayoutInflater.from(Menus.this);
                final View view = factory.inflate(R.layout.aboutus, null);
                builder.setTitle("About Us")
                        .setIcon(R.drawable.logo)
                        .setView(view)
                        .setMessage(Html.fromHtml("This Application is Developed by "+"<br>"+"<b>"+"<i>"+"Rajat Saxena"+"</i>"+"</b>"))
                        .setCancelable(true)  //setConcelable is invisible dialog box user touch activity
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                Dialog d = builder.create();
                d.show();

                break;
            case R.id.menuc:
                AlertDialog.Builder builder1 = new AlertDialog.Builder(Menus.this);
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
                AlertDialog.Builder builder2 = new AlertDialog.Builder(Menus.this);
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

    public void showpopup(View view) {
        PopupMenu p = new PopupMenu(this, view);
        p.inflate(R.menu.popup_menu);
        p.setOnMenuItemClickListener(this);
        p.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.r:
                cl.setBackgroundColor(getResources().getColor(R.color.RED));
                break;

            case R.id.b:
                cl.setBackgroundColor(getResources().getColor(R.color.BLUE));
                break;
            case R.id.g:
                cl.setBackgroundColor(getResources().getColor(R.color.GREEN));
                break;
            case R.id.w:
                cl.setBackgroundColor(getResources().getColor(R.color.white));
                break;
        }


        return false;
    }
}