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
    private DataBase db;



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

        prod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione1();
            }
        });

        prod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione2();
            }
        });

        prod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione3();
            }
        });

        prod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione4();
            }
        });

        prod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione5();
            }
        });

        prod6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione6();
            }
        });

        prod7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione7();
            }
        });

        prod8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione8();
            }
        });

        prod9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione9();
            }
        });

        prod10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azione10();
            }
        });

        manutenzione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneManutenzione ();
            }
        });

        servizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneServizi ();
            }
        });

        mucca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneHome ();
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

    private void azioneManutenzione (){
        Intent intent3 = new Intent (cDeposito.this, dManutenzione.class);
        startActivity(intent3);
    }

    private void azioneServizi (){
        Intent intent5 = new Intent (cDeposito.this, fServizi.class);
        startActivity(intent5);
    }

    private void azioneHome (){
        Intent intent7 = new Intent(cDeposito.this, bHomePage.class);
        startActivity(intent7);
    }

    private void azione1 (){
        db.inserimentoNuovoProdotto("Mozzarella DOP","Rigorosamente prodotto con latte fresco senza conservanti", 5.0, 10);
    }

    private void azione2 (){
        db.inserimentoNuovoProdotto("Mozzarella DOP","Rigorosamente prodotto con latte fresco senza conservanti", 5.0, 10);
    }

    private void azione3 (){
        db.inserimentoNuovoProdotto("Mozzarella DOP","Rigorosamente prodotto con latte fresco senza conservanti", 5.0, 10);
    }

    private void azione4 (){
        db.inserimentoNuovoProdotto("Mozzarella DOP","Rigorosamente prodotto con latte fresco senza conservanti", 5.0, 10);
    }

    private void azione5 (){
        db.inserimentoNuovoProdotto("Mozzarella DOP","Rigorosamente prodotto con latte fresco senza conservanti", 5.0, 10);
    }

    private void azione6 (){
        db.inserimentoNuovoProdotto("Mozzarella DOP","Rigorosamente prodotto con latte fresco senza conservanti", 5.0, 10);
    }

    private void azione7 (){
        db.inserimentoNuovoProdotto("Mozzarella DOP","Rigorosamente prodotto con latte fresco senza conservanti", 5.0, 10);
    }

    private void azione8 (){
        db.inserimentoNuovoProdotto("Mozzarella DOP","Rigorosamente prodotto con latte fresco senza conservanti", 5.0, 10);
    }

    private void azione9 (){
        db.inserimentoNuovoProdotto("Mozzarella DOP","Rigorosamente prodotto con latte fresco senza conservanti", 5.0, 10);
    }

    private void azione10 (){
        db.inserimentoNuovoProdotto("Mozzarella DOP","Rigorosamente prodotto con latte fresco senza conservanti", 5.0, 10);
    }

}
