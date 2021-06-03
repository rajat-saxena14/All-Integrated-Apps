package com.example.allandroidprojects;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.regex.Matcher;

public class SQLITESHOPDBPROVIDER4 extends ContentProvider {
    SQLITESHOPDB2 sdb;
    SQLiteDatabase mydb;

    public static UriMatcher matcher=createUriMatcher();
    public static final int T =500;
    public static final int T_ID =501;

    private static UriMatcher createUriMatcher() {
        UriMatcher m=new UriMatcher(UriMatcher.NO_MATCH);
        m.addURI(SQLITESHOPDBCONTRACT3.AUTHORITY,SQLITESHOPDBCONTRACT3.TABLE,T);
        m.addURI(SQLITESHOPDBCONTRACT3.AUTHORITY,SQLITESHOPDBCONTRACT3.TABLE+"/#",T_ID);
        return m;

    }

    @Override
    public boolean onCreate() {
        Context c=getContext();
        sdb=new SQLITESHOPDB2(c);
        mydb= sdb.getWritableDatabase();

        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        mydb=sdb.getReadableDatabase();
        Cursor c1=null;
        Uri u=null;
        switch (matcher.match(uri))
        {
            case T:
                c1=mydb.query(SQLITESHOPDBCONTRACT3.TABLE,strings,null ,null,null,null,null);

                break;

            case T_ID:
                break;

            default:
                //   throw new UnsupportedOperationException("error");
                break;
        }

        return c1;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        String s=null;
        switch (matcher.match(uri))
        {
            case T:
                s="vnd.android.cursor.dir/vnd.com.example.allandroidprojects";

                break;

            case T_ID:
                s="vnd.android.cursor.item/vnd.com.example.allandroidprojects";
                break;

            default:
                //   throw new UnsupportedOperationException("error");
                break;
        }

        return s;


    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        mydb=sdb.getWritableDatabase();
        Uri u=null;
        switch (matcher.match(uri))
        {
            case T:
                long l=mydb.insert(SQLITESHOPDBCONTRACT3.TABLE,null , contentValues);
                if(l>0){
                    // u=Uri.parse(SHOPDBCONTRACT.PRODUCTS_ENTRY.CONTENT_URI+"/"+1);
                    u= ContentUris.withAppendedId(SQLITESHOPDBCONTRACT3.PRODUCTS_ENTRY.CONTENT_URI,1);
                }
                getContext().getContentResolver().notifyChange(u,null);
                break;

            case T_ID:
                break;

            default:
                //   throw new UnsupportedOperationException("error");
                break;
        }
        return u;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        mydb=sdb.getWritableDatabase();
        int i=0;
        switch (matcher.match(uri))
        {
            case T:
                i=mydb.delete(SQLITESHOPDBCONTRACT3.TABLE,s,strings);

                break;

            case T_ID:
                break;

            default:
                //   throw new UnsupportedOperationException("error");
                break;
        }

        return i;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        mydb=sdb.getWritableDatabase();
        int i=0;
        switch (matcher.match(uri))
        {
            case T:
                i=mydb.update(SQLITESHOPDBCONTRACT3.TABLE,contentValues,s,strings);

                break;

            case T_ID:
                break;

            default:
                //   throw new UnsupportedOperationException("error");
                break;
        }

        return i;

    }
}
