package com.softworldtechnologies.appgaseta.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.softworldtechnologies.appgaseta.view.MainActivity;

public class GasEtaDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "gaseta.db";
    public static final int DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public GasEtaDB(MainActivity context) {
        super ( context, DB_NAME, null, DB_VERSION );
        db = getWritableDatabase ();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlTabelaCombustivel =
                "CREATE TABLE Combustivel ( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nomeDoCombustivel TEXT, " +
                "precoDoCombustivel REAL, " +
                "recomendacao TEXT)";

        db.execSQL ( sqlTabelaCombustivel );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
