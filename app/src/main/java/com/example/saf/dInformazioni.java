package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class dInformazioni extends AppCompatActivity {

    private Button catalogo;
    private Button carrello;
    private Button utente;
    private Button ordini;
    private ImageView logoMucca;
    private ImageView user;
    private ImageView numero_tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_informazioni);

        catalogo = (Button) findViewById(R.id.button_catalogo3);
        carrello = (Button) findViewById(R.id.button_carrello3);
        utente = (Button) findViewById(R.id.button_utente3);
        ordini = (Button) findViewById(R.id.button_ordini3);
        logoMucca = (ImageView) findViewById(R.id.logo_manutenzione);
        user = (ImageView) findViewById(R.id.image_user);
        numero_tel= (ImageView) findViewById(R.id.numero_telefono);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(dInformazioni.this);
                adb.setTitle("Logout:");
                adb.setMessage("Sei sicuro di voler effettuare il logout?");
                adb.setNegativeButton("Annulla", null);
                adb.setPositiveButton("Esci", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent7= new Intent(dInformazioni.this, aLogin.class);
                        startActivity(intent7);
                    }
                });
                adb.show();
            }
        });

        numero_tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(Intent.ACTION_DIAL);
                intent10.setData(Uri.parse("tel:123456789"));
                startActivity(intent10);
            }
        });

        catalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneCatalogo();
            }
        });

        carrello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneCarrello();
            }
        });

        utente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneUtente();
            }
        });

        ordini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneOrdini();
            }
        });

        logoMucca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneHome();
            }
        });
    }

    private void azioneCatalogo() {
        Intent intent1 = new Intent(dInformazioni.this, cCatalogo.class);
        startActivity(intent1);
    }

    private void azioneCarrello() {
        Intent intent2 = new Intent(dInformazioni.this, eCarrello.class);
        startActivity(intent2);
    }

    private void azioneUtente() {
        Intent intent3 = new Intent(dInformazioni.this, fUtente.class);
        startActivity(intent3);
    }

    private void azioneOrdini() {
        Intent intent4 = new Intent(dInformazioni.this, gOrdini.class);
        startActivity(intent4);
    }

    private void azioneHome() {
        Intent intent5 = new Intent(dInformazioni.this, bHomePage.class);
        startActivity(intent5);

    }
}

