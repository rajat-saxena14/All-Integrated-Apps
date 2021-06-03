package com.example.allandroidprojects;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLITESHOPDB2 extends SQLiteOpenHelper {
    SQLiteDatabase db;


    public SQLITESHOPDB2(@Nullable Context context) {
        super(context, "MYDB.db", null, 1);
        this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String s="CREATE TABLE PRODUCTS(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME VARCHAR, PRICE TEXT)";
        sqLiteDatabase.execSQL(s);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS PRODUCTS");
        onCreate(sqLiteDatabase);

    }

    public long insertindatabase(String s, String s1) {
        db=this.getWritableDatabase();
        ContentValues c =new ContentValues();
        c.put("NAME",s);
        c.put("PRICE",s1);
        return db.insert("PRODUCTS", null,c);


    }

    public Cursor findfromdatabase(String id) {
        db=this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM PRODUCTS WHERE ID=?", new String[]{id});
    }

    public Cursor findallfromdatabase() {
        db=this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM PRODUCTS", null);

    }

    public int deletefromdatabase(String toString) {
        db = this.getWritableDatabase();
        return db.delete("PRODUCTS", "ID=?", new String[]{toString});
    }

}
