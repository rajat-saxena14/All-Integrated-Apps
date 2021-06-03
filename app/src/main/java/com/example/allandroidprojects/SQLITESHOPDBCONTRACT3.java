package com.example.allandroidprojects;

import android.net.Uri;
import android.provider.BaseColumns;

public class SQLITESHOPDBCONTRACT3 {

    public static final String AUTHORITY="com.example.allandroidprojects";
    public static final Uri BASE_CONTENT_URI= Uri.parse("content://"+AUTHORITY);
    public static final String TABLE="PRODUCTS";

    public static class PRODUCTS_ENTRY implements BaseColumns{
        public static final Uri CONTENT_URI=BASE_CONTENT_URI.buildUpon().appendPath(TABLE).build();
        public static final String _ID="ID";
        public static final String NAME="NAME";
        public static final String PRICE="PRICE";
    }
}
