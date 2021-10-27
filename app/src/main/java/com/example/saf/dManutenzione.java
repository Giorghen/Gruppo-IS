package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class dManutenzione extends AppCompatActivity {

    private Button catalogo;
    private Button informazioni;
    private Button carrello;
    private Button utente;
    private Button ordini;
    private ImageView immagine;
    private ImageView logoMucca;
    private ImageView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_manutenzione);

        catalogo = (Button) findViewById(R.id.button_catalogo3);
        informazioni = (Button) findViewById(R.id.button_info3);
        carrello = (Button) findViewById(R.id.button_carrello3);
        utente = (Button) findViewById(R.id.button_utente3);
        ordini = (Button) findViewById(R.id.button_ordini3);
        immagine = (ImageView) findViewById(R.id.image_rubrica);
        logoMucca = (ImageView) findViewById(R.id.logo_manutenzione);
        user = (ImageView) findViewById(R.id.image_user);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(dManutenzione.this);
                adb.setTitle("Logout:");
                adb.setMessage("Sei sicuro di voler effettuare il logout?");
                adb.setNegativeButton("Annulla", null);
                adb.setPositiveButton("Esci", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent7= new Intent(dManutenzione.this, aLogin.class);
                        startActivity(intent7);

                    }
                });
                adb.show();
            }
        });

        catalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione1();
            }
        });

        informazioni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione2();
            }
        });

        logoMucca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione3();
            }
        });
    }

    private void azione1() {
        Intent intent1 = new Intent(dManutenzione.this, cDeposito.class);
        startActivity(intent1);
    }

    private void azione2() {
        Intent intent2 = new Intent(dManutenzione.this, fServizi.class);
        startActivity(intent2);
    }

    private void azione3() {
        Intent intent3 = new Intent(dManutenzione.this, bHomePage.class);
        startActivity(intent3);

    }
}

