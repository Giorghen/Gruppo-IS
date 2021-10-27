package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class fUtente extends AppCompatActivity {

    private Button catalogo;
    private Button informazioni;
    private Button carrello;
    private Button ordini;
    private ImageView logo;
    private ImageView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_area_utente);

        catalogo = (Button) findViewById(R.id.button_catalogo5);
        informazioni = (Button) findViewById(R.id.button_info5);
        carrello = (Button) findViewById(R.id.button_carrello5);
        ordini = (Button) findViewById(R.id.button_ordini5);
        logo = (ImageView) findViewById(R.id.logo_servizi);
        user = (ImageView) findViewById(R.id.image_user);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(fUtente.this);
                adb.setTitle("Logout:");
                adb.setMessage("Sei sicuro di voler effettuare il logout?");
                adb.setNegativeButton("Annulla", null);
                adb.setPositiveButton("Esci", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent7= new Intent(fUtente.this, aLogin.class);
                        startActivity(intent7);

                    }
                });
                adb.show();
            }
        });

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
                azioneCarrello();
            }
        });

        ordini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneOrdini();
            }
        });

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneHome ();
            }
        });
    }

    private void azioneCatalogo() {
        Intent intent1 = new Intent(fUtente.this, cCatalogo.class);
        startActivity(intent1);
    }

    private void azioneInformazioni() {
        Intent intent2 = new Intent(fUtente.this, dInformazioni.class);
        startActivity(intent2);
    }

    private void azioneCarrello() {
        Intent intent3 = new Intent(fUtente.this, eCarrello.class);
        startActivity(intent3);
    }

    private void azioneOrdini() {
        Intent intent4 = new Intent(fUtente.this, gOrdini.class);
        startActivity(intent4);
    }

    private void azioneHome() {
        Intent intent5 = new Intent(fUtente.this, bHomePage.class);
        startActivity(intent5);

    }
}
