package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class cCatalogo extends AppCompatActivity {

    private Button informazioni;
    private Button carrello;
    private Button ordini;
    private Button utente;
    private ImageView mucca;
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
        setContentView(R.layout.activity_c_catalogo);

        informazioni = (Button) findViewById(R.id.button_info1);
        carrello = (Button) findViewById(R.id.button_carrello1);
        utente = (Button) findViewById(R.id.button_utente1);
        ordini = (Button) findViewById(R.id.button_ordini1);
        mucca = (ImageView) findViewById(R.id.logo_deposito);
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

        ordini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneOrdini ();
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
                AlertDialog.Builder adb = new AlertDialog.Builder(cCatalogo.this);
                adb.setTitle("Logout:");
                adb.setMessage("Sei sicuro di voler effettuare il logout?");
                adb.setNegativeButton("Annulla", null);
                adb.setPositiveButton("Esci", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent7= new Intent(cCatalogo.this, aLogin.class);
                        startActivity(intent7);

                    }
                });
                adb.show();
            }
        });
    }

    private void azioneInformazioni (){
        Intent intent1 = new Intent (cCatalogo.this, dInformazioni.class);
        startActivity(intent1);
    }

    private void azioneCarrello (){
        Intent intent2 = new Intent (cCatalogo.this, eCarrello.class);
        startActivity(intent2);
    }

    private void azioneUtente (){
        Intent intent3 = new Intent(cCatalogo.this, fUtente.class);
        startActivity(intent3);
    }

    private void azioneOrdini (){
        Intent intent4 = new Intent(cCatalogo.this, gOrdini.class);
        startActivity(intent4);
    }

    private void azioneHome (){
        Intent intent5 = new Intent(cCatalogo.this, bHomePage.class);
        startActivity(intent5);
    }

    private void azione1 (){
        Intent intent6= new Intent (cCatalogo.this, Prodotto.class);
        intent6.putExtra("nomeProdotto","Caciocavallo");
        startActivity(intent6);
    }

    private void azione2 (){
        Intent intent7= new Intent (cCatalogo.this, Prodotto.class);
        intent7.putExtra("nomeProdotto","Formaggio Parmigiano");
        startActivity(intent7);
    }

    private void azione3 (){
        Intent intent8= new Intent (cCatalogo.this, Prodotto.class);
        intent8.putExtra("nomeProdotto","Gorgonzola Dop");
        startActivity(intent8);
    }

    private void azione4 (){
        Intent intent9= new Intent (cCatalogo.this, Prodotto.class);
        intent9.putExtra("nomeProdotto","Mozzarella Dop");
        startActivity(intent9);
    }

    private void azione5 (){
        Intent intent10= new Intent (cCatalogo.this, Prodotto.class);
        intent10.putExtra("nomeProdotto","Mozzarelline");
        startActivity(intent10);
    }

    private void azione6 (){
        Intent intent11= new Intent (cCatalogo.this, Prodotto.class);
        intent11.putExtra("nomeProdotto","Mozzarellona");
        startActivity(intent11);
    }

    private void azione7 (){
        Intent intent12= new Intent (cCatalogo.this, Prodotto.class);
        intent12.putExtra("nomeProdotto","Pecorino");
        startActivity(intent12);
    }

    private void azione8 (){
        Intent intent13= new Intent (cCatalogo.this, Prodotto.class);
        intent13.putExtra("nomeProdotto","Provolone");
        startActivity(intent13);
    }

    private void azione9 (){
        Intent intent14= new Intent (cCatalogo.this, Prodotto.class);
        intent14.putExtra("nomeProdotto","Ricotta di pecora");
        startActivity(intent14);
    }

    private void azione10 (){
        Intent intent15= new Intent (cCatalogo.this, Prodotto.class);
        intent15.putExtra("nomeProdotto","Treccia di mozzarella");
        startActivity(intent15);
    }

}