package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class eCarrello extends AppCompatActivity {

    private Button catalogo;
    private Button informazioni;
    private Button utente;
    private Button ordini;
    private Button acquista;
    private ImageView logo;
    private ImageView user;
    private TextView titolo;
    private TextView prezzo;
    private ImageView immagine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_carrello);

        catalogo = (Button) findViewById(R.id.button_catalogo4);
        informazioni = (Button) findViewById(R.id.button_info4);
        utente = (Button) findViewById(R.id.button_utente4);
        ordini = (Button) findViewById(R.id.button_ordini4);
        logo = (ImageView) findViewById(R.id.logo_contabilita);
        user = (ImageView) findViewById(R.id.image_user);
        acquista= (Button) findViewById(R.id.acquista);
        titolo= (TextView) findViewById(R.id.nome_prodotto1);
        prezzo= (TextView) findViewById(R.id.prezzo_prodotto1);
        immagine= (ImageView) findViewById(R.id.immagine_prodotto1);


        acquista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(eCarrello.this, acquisto.class);
                startActivity(intent);
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(eCarrello.this);
                adb.setTitle("Logout:");
                adb.setMessage("Sei sicuro di voler effettuare il logout?");
                adb.setNegativeButton("Annulla", null);
                adb.setPositiveButton("Esci", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent7= new Intent(eCarrello.this, aLogin.class);
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

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneHome ();
            }
        });

       String titoloProvvisorio= getIntent().getExtras().getString("nome");

       titolo.setText(titoloProvvisorio);

         switch (titoloProvvisorio){
            case "Caciocavallo": immagine.setImageResource(R.drawable.caciocavallo);
                prezzo.setText("€10");
                break;

            case "Formaggio Parmigiano": immagine.setImageResource(R.drawable.formaggioparmigiano);
                prezzo.setText("€7");
                break;

            case "Gorgonzola Dop": immagine.setImageResource(R.drawable.gorgonzoladop);
                prezzo.setText("€15");
                break;

            case "Mozzarella Dop": immagine.setImageResource(R.drawable.mozzarelladop);
                prezzo.setText("€9");
                break;

            case "Mozzarelline": immagine.setImageResource(R.drawable.mozzarelline);
                prezzo.setText("€5");
                break;

            case "Mozzarellona": immagine.setImageResource(R.drawable.mozzarellona);
                prezzo.setText("€17");
                break;

            case "Pecorino": immagine.setImageResource(R.drawable.pecorino);
                prezzo.setText("€4");
                break;

            case "Provolone": immagine.setImageResource(R.drawable.provolone);
                prezzo.setText("€13");
                break;

            case "Ricotta di pecora": immagine.setImageResource(R.drawable.ricottadipecora);
                prezzo.setText("€6");
                break;

            case "Treccia di mozzarella": immagine.setImageResource(R.drawable.trecciadimozzarella);
                prezzo.setText("€21");
                break;
        }
    }

    private void azioneCatalogo() {
        Intent intent1 = new Intent(eCarrello.this, cCatalogo.class);
        startActivity(intent1);
    }

    private void azioneInformazioni() {
        Intent intent2 = new Intent(eCarrello.this, dInformazioni.class);
        startActivity(intent2);
    }

    private void azioneUtente() {
        Intent intent3 = new Intent(eCarrello.this, fUtente.class);
        startActivity(intent3);
    }

    private void azioneOrdini() {
        Intent intent4 = new Intent(eCarrello.this, gOrdini.class);
        startActivity(intent4);
    }

    private void azioneHome() {
        Intent intent5 = new Intent(eCarrello.this, bHomePage.class);
        startActivity(intent5);

    }
}