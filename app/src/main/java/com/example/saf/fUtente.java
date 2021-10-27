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
    private Button utente;
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
        utente = (Button) findViewById(R.id.button_utente5);
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
                azione1 ();
            }
        });

        informazioni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione2 ();
            }
        });

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione3 ();
            }
        });
    }

    private void azione1 (){
        Intent intent1 = new Intent(fUtente.this, cCatalogo.class);
        startActivity(intent1);
    }

    private void azione2 (){
        Intent intent2 = new Intent (fUtente.this, dInformazioni.class);
        startActivity(intent2);
    }

    private void azione3 () {
        Intent intent3 = new Intent (fUtente.this, bHomePage.class);
        startActivity(intent3);
    }
}
