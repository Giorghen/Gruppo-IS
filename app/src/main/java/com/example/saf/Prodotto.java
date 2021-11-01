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

public class Prodotto extends AppCompatActivity {

    private Button aggiungi;
    private TextView titolo;
    private  TextView descrizione;
    private TextView prezzo;
    private ImageView immagine;
    private ImageView mucca;
    private ImageView user;
    private String titoloProvvisorio;
    private String prezzoTemp;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prodotto);
         aggiungi= findViewById(R.id.aggiungi_carrello);
         titolo= findViewById(R.id.nome_prodotto);
         descrizione= findViewById(R.id.descrizione_prodotto);
         prezzo= findViewById(R.id.prezzo_prodotto);
         immagine= findViewById(R.id.immagine_prodotto);
        mucca = (ImageView) findViewById(R.id.logo_contenitore);
        user = (ImageView) findViewById(R.id.image_user);
        titoloProvvisorio= "";
        prezzoTemp= "";

        mucca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneHome ();
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(Prodotto.this);
                adb.setTitle("Logout:");
                adb.setMessage("Sei sicuro di voler effettuare il logout?");
                adb.setNegativeButton("Annulla", null);
                adb.setPositiveButton("Esci", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent7= new Intent(Prodotto.this, aLogin.class);
                        startActivity(intent7);

                    }
                });
                adb.show();
            }
        });

        titoloProvvisorio= getIntent().getExtras().getString("nomeProdotto").toString();

         titolo.setText(titoloProvvisorio);

         switch (titoloProvvisorio){
             case "Caciocavallo": descrizione.setText("Descrizione 1");
             immagine.setImageResource(R.drawable.caciocavallo);
             prezzo.setText("€10");
             prezzoTemp= "€10";
             break;

             case "Formaggio Parmigiano": descrizione.setText("Descrizione 2");
                 immagine.setImageResource(R.drawable.formaggioparmigiano);
                 prezzo.setText("€7");
                 prezzoTemp= "€7";

                 break;

             case "Gorgonzola Dop": descrizione.setText("Descrizione 3");
                 immagine.setImageResource(R.drawable.gorgonzoladop);
                 prezzo.setText("€15");
                 prezzoTemp= "€15";

                 break;

             case "Mozzarella Dop": descrizione.setText("Descrizione 4");
                 immagine.setImageResource(R.drawable.mozzarelladop);
                 prezzo.setText("€9");
                 prezzoTemp= "€9";

                 break;

             case "Mozzarelline": descrizione.setText("Descrizione 5");
                 immagine.setImageResource(R.drawable.mozzarelline);
                 prezzo.setText("€5");
                 prezzoTemp= "€5";

                 break;

             case "Mozzarellona": descrizione.setText("Descrizione 6");
                 immagine.setImageResource(R.drawable.mozzarellona);
                 prezzo.setText("€17");
                 prezzoTemp= "€17";

                 break;

             case "Pecorino": descrizione.setText("Descrizione 7");
                 immagine.setImageResource(R.drawable.pecorino);
                 prezzo.setText("€4");
                 prezzoTemp= "€4";

                 break;

             case "Provolone": descrizione.setText("Descrizione 8");
                 immagine.setImageResource(R.drawable.provolone);
                 prezzo.setText("€13");
                 prezzoTemp= "€13";

                 break;

             case "Ricotta di pecora": descrizione.setText("Descrizione 9");
                 immagine.setImageResource(R.drawable.ricottadipecora);
                 prezzo.setText("€6");
                 prezzoTemp= "€6";

                 break;

             case "Treccia di mozzarella": descrizione.setText("Descrizione 10");
                 immagine.setImageResource(R.drawable.trecciadimozzarella);
                 prezzo.setText("€21");
                 prezzoTemp= "€21";

                 break;
         }

         aggiungi.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 intent= new Intent(Prodotto.this, eCarrello.class);
                 intent.putExtra("nome", titoloProvvisorio);
                 intent.putExtra("prezzo", prezzoTemp);
                 startActivity(intent);
             }
         });

    }

    private void azioneHome (){
        Intent intent5 = new Intent(Prodotto.this, bHomePage.class);
        startActivity(intent5);
    }
}