package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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
        l= (LinearLayout) findViewById(R.id.lin);
        li= new ArrayList<String>();
        nome= "";

        DataBase db= new DataBase(gOrdini.this);

        i= db.numeroProdottiSalvati();

        if(i > 0){
            li= db.visualizzazioneTabellaOrdini();
        }

        if (li.size() > 0){
            for (int i= 0; i < li.size(); i++){
                TextView text = new TextView(this);
                String nome= li.get(i);
                text.setText(nome);
                LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(10, 10, 0, 0);
                text.setLayoutParams(params);
                text.setTypeface(Typeface.DEFAULT_BOLD);
                text.setTextColor(Color.parseColor("#D81B60"));
                text.setTextSize(25);
                l.addView(text);

                ImageView img= new ImageView(this);
                LinearLayout.LayoutParams params1= new LinearLayout.LayoutParams(150, 150);
                params1.setMargins(10, 10, 0, 0);
                img.setLayoutParams(params1);
                switch (nome){
                    case "Caciocavallo": img.setImageResource(R.drawable.caciocavallo);
                        l.addView(img);
                        break;

                    case "Formaggio Parmigiano": img.setImageResource(R.drawable.formaggioparmigiano);
                        l.addView(img);
                        break;

                    case "Gorgonzola Dop": img.setImageResource(R.drawable.gorgonzoladop);
                        l.addView(img);
                        break;

                    case "Mozzarella Dop": img.setImageResource(R.drawable.mozzarelladop);
                        l.addView(img);
                        break;

                    case "Mozzarelline": img.setImageResource(R.drawable.mozzarelline);
                        l.addView(img);
                        break;

                    case "Mozzarellona": img.setImageResource(R.drawable.mozzarellona);
                        l.addView(img);
                        break;

                    case "Pecorino": img.setImageResource(R.drawable.pecorino);
                        l.addView(img);
                        break;

                    case "Provolone": img.setImageResource(R.drawable.provolone);
                        l.addView(img);
                        break;

                    case "Ricotta di pecora": img.setImageResource(R.drawable.ricottadipecora);
                        l.addView(img);
                        break;

                    case "Treccia di mozzarella": img.setImageResource(R.drawable.trecciadimozzarella);
                        l.addView(img);
                        break;

                }
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