package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class cDeposito extends AppCompatActivity {

    private Button manutenzione;
    private Button ordini;
    private Button servizi;
    private Button contabilita;
    private ImageView mucca;
    private Button latte;
    private ImageView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_deposito);

        manutenzione = (Button) findViewById(R.id.button_manutenzione1);
        ordini = (Button) findViewById(R.id.button_ordini1);
        servizi = (Button) findViewById(R.id.button_servizi1);
        contabilita = (Button) findViewById(R.id.button_contabilità1);
        mucca = (ImageView) findViewById(R.id.logo_deposito);
        latte = (Button) findViewById(R.id.bottone_Visualizza);
        user = (ImageView) findViewById(R.id.image_user);

        manutenzione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione3 ();
            }
        });

        ordini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione4 ();
            }
        });

        servizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione5 ();
            }
        });

        mucca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione7 ();
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(cDeposito.this);
                adb.setTitle("Logout:");
                adb.setMessage("Sei sicuro di voler effettuare il logout?");
                adb.setNegativeButton("Annulla", null);
                adb.setPositiveButton("Esci", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent7= new Intent(cDeposito.this, aLogin.class);
                        startActivity(intent7);

                    }
                });
                adb.show();
            }
        });
    }

    private void azione3 (){
        Intent intent3 = new Intent (cDeposito.this, dManutenzione.class);
        startActivity(intent3);
    }

    private void azione4 (){
        Intent intent4 = new Intent (cDeposito.this, eOrdini.class);
        startActivity(intent4);
    }

    private void azione5 (){
        Intent intent5 = new Intent (cDeposito.this, fServizi.class);
        startActivity(intent5);
    }

    private void azione7 (){
        Intent intent7 = new Intent(cDeposito.this, bHomePage.class);
        startActivity(intent7);
    }

}
