package com.example.saf;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME= "SAFMilk.db";
    private static final int DATABASE_VERSION= 1;

    private static final String TABLE_NAME= "saf_ordini";
    private static final String COLUMN_ID= "_id";
    private static final String COLUMN_DESCRIZIONE= "descrizione";
    private static final String COLUMN_PREZZO= "prezzo";

    private static final String TABLE_NAME2= "saf_cliente";
    private static final String COLUMN_CF= "cf";
    private static final String COLUMN_NOME= "nome";
    private static final String COLUMN_COGNOME= "cognome";
    private static final String COLUMN_INDIRIZZO= "indirizzo";
    private static final String COLUMN_EMAIL= "email";
    private static final String COLUMN_PASSWORD= "password";

    public DataBase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query= "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_DESCRIZIONE + " TEXT, " +
                COLUMN_PREZZO + " FLOAT);";
        db.execSQL(query);

        String query2= "CREATE TABLE " + TABLE_NAME2 + " (" +
                COLUMN_CF + " TEXT PRIMARY KEY, " +
                COLUMN_NOME + " TEXT, " +
                COLUMN_COGNOME + " TEXT, " +
                COLUMN_INDIRIZZO + " TEXT, " +
                COLUMN_EMAIL + " TEXT, " +
                COLUMN_PASSWORD + " TEXT);";

        db.execSQL(query2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        onCreate(db);
    }
}
