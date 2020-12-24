package com.example.kotlinch11

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBHelper (context: Context): SQLiteOpenHelper(context,"mdatabase.db",null,4){
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE myTable(book text PRIMARY KEY, price integer NOT NULL)")

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS myTable")
        onCreate(db)
    }
}