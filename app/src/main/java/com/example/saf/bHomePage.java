package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class bHomePage extends AppCompatActivity {

    private Button catalogo;
    private Button informazioni;
    private Button carrello;
    private Button utente;
    private Button ordini;
    private ImageView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_home_page);

    catalogo = (Button) findViewById(R.id.button_catalogo);
    informazioni = (Button) findViewById(R.id.button_info);
    carrello = (Button) findViewById(R.id.button_carrello);
    utente = (Button) findViewById(R.id.button_utente);
    ordini = (Button) findViewById(R.id.button_ordini);
    user = (ImageView) findViewById(R.id.image_user);

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

    carrello.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            azione3 ();
        }
    });

    utente.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           azione4 ();
        }
    });

    ordini.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           azione5 ();
        }
    });

    user.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder adb = new AlertDialog.Builder(bHomePage.this);
            adb.setTitle("Logout:");
            adb.setMessage("Sei sicuro di voler effettuare il logout?");
            adb.setNegativeButton("Annulla", null);
            adb.setPositiveButton("Esci", new AlertDialog.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent7= new Intent(bHomePage.this, aLogin.class);
                    startActivity(intent7);

                }
            });
            adb.show();
        }
    });
    }

    private void azione1 (){
        Intent intent1 = new Intent(bHomePage.this, cCatalogo.class);
        startActivity(intent1);
    }

    private void azione2 (){
        Intent intent2 = new Intent (bHomePage.this, dInformazioni.class);
        startActivity(intent2);
    }

    private void azione3 (){
        Intent intent3 = new Intent (bHomePage.this, eCarrello.class);
        startActivity(intent3);
    }

    private void azione4 (){
        Intent intent4 = new Intent (bHomePage.this, fUtente.class);
        /*String cf= intent4.getExtras().getString("codiceFiscale");
        String nome= intent4.getExtras().getString("nome");
        String cognome= intent4.getExtras().getString("cognome");
        String indirizzo= intent4.getExtras().getString("indirizzo");
        String email= intent4.getExtras().getString("email");
        String password= intent4.getExtras().getString("password");*/
        startActivity(intent4);
    }

    private void azione5 (){
        Intent intent5 = new Intent (bHomePage.this, gOrdini.class);
        startActivity(intent5);
    }

}
