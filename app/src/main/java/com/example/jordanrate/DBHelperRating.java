package com.example.jordanrate;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelperRating extends SQLiteOpenHelper {

    public static final String DBNAME="Rating.db";

    public DBHelperRating(Context context){
        super(context, "Rating.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create table RATING_TABLE(SHOE_ID INTEGER primary key ,RATING FLOAT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop Table if exists RATING_TABLE");
    }

    public Boolean insertData (int ID , float rating) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("SHOE_ID", ID);
        contentValues.put("RATING", rating);
        long result = MyDB.insert("RATING_TABLE", null, contentValues);
        if (result == -1) return false;
        else
            return true;
    }public float Rating(int ID , float rating){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        Cursor cursor=MyDB.rawQuery("select * from RATING_TABLE where SHOE_ID =  and password = ? ",new String[]{username,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;

    }
}
