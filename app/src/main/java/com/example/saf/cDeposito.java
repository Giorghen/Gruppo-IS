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
    private Button prod1;
    private Button prod2;
    private Button prod3;
    private Button prod4;
    private Button prod5;
    private Button prod6;
    private Button prod7;
    private Button prod8;
    private Button prod9;
    private Button prod10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_deposito);

        manutenzione = (Button) findViewById(R.id.button_catalogo1);
        servizi = (Button) findViewById(R.id.button_utente1);
        contabilita = (Button) findViewById(R.id.button_ordini1);
        mucca = (ImageView) findViewById(R.id.logo_deposito);
        /*latte = (Button) findViewById(R.id.bottone_Visualizza);*/
        user = (ImageView) findViewById(R.id.image_user);
        prod1= findViewById(R.id.prodotto1);
        prod2= findViewById(R.id.prodotto2);
        prod3= findViewById(R.id.prodotto3);
        prod4= findViewById(R.id.prodotto4);
        prod5= findViewById(R.id.prodotto5);
        prod6= findViewById(R.id.prodotto6);
        prod7= findViewById(R.id.prodotto7);
        prod8= findViewById(R.id.prodotto8);
        prod9= findViewById(R.id.prodotto9);
        prod10= findViewById(R.id.prodotto10);


        manutenzione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione3 ();
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

    private void azione5 (){
        Intent intent5 = new Intent (cDeposito.this, fServizi.class);
        startActivity(intent5);
    }

    private void azione7 (){
        Intent intent7 = new Intent(cDeposito.this, bHomePage.class);
        startActivity(intent7);
    }

}
