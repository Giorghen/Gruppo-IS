package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class gOrdini extends AppCompatActivity {

    private Button catalogo;
    private Button informazioni;
    private Button carrello;
    private Button utente;
    private ImageView logo;
    private ImageView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_ordini);

        catalogo = (Button) findViewById(R.id.button_catalogo6);
        informazioni = (Button) findViewById(R.id.button_info6);
        carrello = (Button) findViewById(R.id.button_carrello6);
        utente = (Button) findViewById(R.id.button_utente6);
        logo = (ImageView) findViewById(R.id.logo_rubrica);
        user = (ImageView) findViewById(R.id.image_user);

        catalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneCatalogo ();
            }
        });

        informazioni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneInformazioni ();
            }
        });

        carrello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneCarrello ();
            }
        });

        utente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneUtente ();
            }
        });

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneHome ();
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(gOrdini.this);
                adb.setTitle("Logout:");
                adb.setMessage("Sei sicuro di voler effettuare il logout?");
                adb.setNegativeButton("Annulla", null);
                adb.setPositiveButton("Esci", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent7= new Intent(gOrdini.this, aLogin.class);
                        startActivity(intent7);

                    }
                });
                adb.show();
            }
        });
    }

    private void azioneCatalogo (){
        Intent intent1 = new Intent (gOrdini.this, cCatalogo.class);
        startActivity(intent1);
    }

    private void azioneInformazioni (){
        Intent intent2 = new Intent (gOrdini.this, dInformazioni.class);
        startActivity(intent2);
    }

    private void azioneCarrello (){
        Intent intent3 = new Intent (gOrdini.this, eCarrello.class);
        startActivity(intent3);
    }

    private void azioneUtente (){
        Intent intent4 = new Intent(gOrdini.this, fUtente.class);
        startActivity(intent4);
    }

    private void azioneHome (){
        Intent intent5 = new Intent(gOrdini.this, bHomePage.class);
        startActivity(intent5);
    }
}