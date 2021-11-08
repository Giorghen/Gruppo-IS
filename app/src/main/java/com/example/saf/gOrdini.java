package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class gOrdini extends AppCompatActivity {

    private Button catalogo;
    private Button informazioni;
    private Button carrello;
    private Button utente;
    private ImageView logo;
    private ImageView user;
    private ImageView img_ordine;
    private TextView titolo_ordine;
    private LinearLayout l;
    private String nome;
    private int i;
    private ArrayList<String> li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_ordini);

        catalogo = (Button) findViewById(R.id.button_catalogo6);
        informazioni = (Button) findViewById(R.id.button_info6);
        carrello = (Button) findViewById(R.id.button_carrello6);
        utente = (Button) findViewById(R.id.button_utente6);
        logo = (ImageView) findViewById(R.id.logo_rubrica);
        user = (ImageView) findViewById(R.id.image_user);
        img_ordine= (ImageView) findViewById(R.id.immagine_ordine);
        titolo_ordine= (TextView) findViewById(R.id.nome_ordine);
        l= (LinearLayout) findViewById(R.id.lin);
        nome= "";
        i= 1;

        DataBase db= new DataBase(gOrdini.this);
        li= db.visualizzazioneTabellaOrdini();

        for (int i= 0; i < li.size(); i++)
            System.out.println ("Prodotto: " + li.get(i).toString());

        TextView text = new TextView(this);
        text.setId(i);
        //text.setText();
        text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        text.setTextColor(Color.parseColor("#D81B60"));
        text.setTextSize(25);
        l.addView(text);


        if (getIntent().getStringExtra("nomeP") != null){
            nome= getIntent().getExtras().getString("nomeP");

            titolo_ordine.setText(nome);

            switch (nome){
                case "Caciocavallo": img_ordine.setImageResource(R.drawable.caciocavallo);
                break;

                case "Formaggio Parmigiano": img_ordine.setImageResource(R.drawable.formaggioparmigiano);
                break;

                case "Gorgonzola Dop": img_ordine.setImageResource(R.drawable.gorgonzoladop);
                break;

                case "Mozzarella Dop": img_ordine.setImageResource(R.drawable.mozzarelladop);
                break;

                case "Mozzarelline": img_ordine.setImageResource(R.drawable.mozzarelline);
                break;

                case "Mozzarellona": img_ordine.setImageResource(R.drawable.mozzarellona);
                break;

                case "Pecorino": img_ordine.setImageResource(R.drawable.pecorino);
                break;

                case "Provolone": img_ordine.setImageResource(R.drawable.provolone);
                break;

                case "Ricotta di pecora": img_ordine.setImageResource(R.drawable.ricottadipecora);
                break;

                case "Treccia di mozzarella": img_ordine.setImageResource(R.drawable.trecciadimozzarella);
                break;

            }
        }

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

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azioneHome ();
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(gOrdini.this);
                adb.setTitle("Logout:");
                adb.setMessage("Sei sicuro di voler effettuare il logout?");
                adb.setNegativeButton("Annulla", null);
                adb.setPositiveButton("Esci", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent7= new Intent(gOrdini.this, aLogin.class);
                        startActivity(intent7);

                    }
                });
                adb.show();
            }
        });
    }

    private void azioneCatalogo (){
        Intent intent1 = new Intent (gOrdini.this, cCatalogo.class);
        startActivity(intent1);
    }

    private void azioneInformazioni (){
        Intent intent2 = new Intent (gOrdini.this, dInformazioni.class);
        startActivity(intent2);
    }

    private void azioneCarrello (){
        Intent intent3 = new Intent (gOrdini.this, eCarrello.class);
        startActivity(intent3);
    }

    private void azioneUtente (){
        Intent intent4 = new Intent(gOrdini.this, fUtente.class);
        startActivity(intent4);
    }

    private void azioneHome (){
        Intent intent5 = new Intent(gOrdini.this, bHomePage.class);
        startActivity(intent5);
    }
}