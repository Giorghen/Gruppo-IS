package com.example.saf;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME= "SAFMilk.db";
    private static final int DATABASE_VERSION= 1;

    private static final String TABLE_NAME= "saf_ordini";
    private static final String COLUMN_ID= "_id";
    private static final String COLUMN_NOME_PROD= "nome_prodotto";
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
                COLUMN_NOME_PROD + " TEXT, " +
                COLUMN_DESCRIZIONE + " TEXT, " +
                COLUMN_PREZZO + " DOUBLE);";
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

    /**
     * Aggiunge un nuovo cliente registrato all'interno del database nella tabella cliente
     * utilizzando le informazioni che gli vengono fornite nei parametri
     * @param cf
     * @param nome
     * @param cognome
     * @param indirizzo
     * @param email
     * @param password
     */
    public void aggiungiCliente(String cf, String nome, String cognome, String indirizzo, String email, String password){

        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues cn= new ContentValues();

        cn.put(COLUMN_CF, cf);
        cn.put(COLUMN_NOME, nome);
        cn.put(COLUMN_COGNOME, cognome);
        cn.put(COLUMN_EMAIL, email);
        cn.put(COLUMN_INDIRIZZO, indirizzo);
        cn.put(COLUMN_PASSWORD, password);

        long result= db.insert(TABLE_NAME2, null, cn);

        if (result == -1){
            Toast.makeText(context, "Errore inserimento cliente", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Successo inserimento cliente", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Aggiunge un nuovo ordine effettuato all'interno della tabella ordini
     * @param des
     * @param prezzo
     */
    public void aggiungiOrdine (String nome, String des, double prezzo){

        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues cn= new ContentValues();

        cn.put(COLUMN_NOME_PROD, nome);
        cn.put(COLUMN_DESCRIZIONE, des);
        cn.put(COLUMN_PREZZO, prezzo);

        long result= db.insert(TABLE_NAME, null, cn);

        if (result == -1){
            Toast.makeText(context, "Errore inserimento ordine", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Successo inserimento ordine", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Controlla se un utente è registrato o meno: se è registra restituisce true, altrimenti
     * restituisce false.
     * Il controllo viene effettuato con le informazioni passate come parametro
     * @param em
     * @param pw
     * @return boolean
     */
    public boolean loginCliente (String em, String pw){

        boolean trovato= false;
        Cursor cr= null;

        SQLiteDatabase db= this.getReadableDatabase();
        String query= "SELECT * FROM " + TABLE_NAME2 + " WHERE " + em + " = " + COLUMN_EMAIL + " AND " + pw + " = " + COLUMN_PASSWORD;

        if (db != null){
            cr= db.rawQuery(query, null);
        }

        if (cr != null){
            trovato= true;
        }

        return trovato;
    }

    /**
     * Restituisce tutto il conetenuto della tabella ordini
     * @return cursor
     */
    public Cursor visualizzazioneTabellaOrdini(){

        String query= "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db= this.getReadableDatabase();
        Cursor cursor= null;

        if (db != null){
            cursor= db.rawQuery(query, null);
        }
        return cursor;
    }

    /**
     * Modifica i dati del cliente utilizzando le nuove informazioni che gli vengono
     * passate come parametri
     * @param row_id
     * @param cf
     * @param nome
     * @param cognome
     * @param indirizzo
     * @param em
     * @param pw
     */
    public void modificaDatiCliente (String row_id, String cf, String nome, String cognome, String indirizzo, String em, String pw){

        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues con= new ContentValues();

        con.put(COLUMN_CF, cf);
        con.put(COLUMN_NOME, nome);
        con.put(COLUMN_COGNOME, cognome);
        con.put(COLUMN_INDIRIZZO, indirizzo);
        con.put(COLUMN_EMAIL, em);
        con.put(COLUMN_PASSWORD, pw);

        long result= db.update(TABLE_NAME2, con, "_id=?", new String[]{row_id});

        if (result == -1){
            Toast.makeText(context, "Errore modifica dati cliente", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Successo modifica dati utente", Toast.LENGTH_SHORT).show();
        }

    }

}
