package com.example.eyeshieldtablelamp.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private Context context;
    private static final String DATABASE_NAME="TL.dp";    //数据库名称
    private static final int DATABASE_VERSION=1;                   //版本号

    private static final String TABLE_NAME="Eye_Shield_TL";
    //private static final String COLUMN_ID="_id";
    //private static final String COLUMN_AUTHOR="book_author";
    private static final String COLUMN_TITLE="Task_title";
    private static final String COLUMN_TIME="Task_time";

    DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +           //创建查询
                "(" +  COLUMN_TITLE + " TEXT, " + COLUMN_TIME + " TEXT );";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }
}
