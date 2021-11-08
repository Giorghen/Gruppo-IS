package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class acquisto extends AppCompatActivity {

    private Button acquista;
    private ImageView back;
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acquisto);

        acquista= findViewById(R.id.acquisto);
        back= findViewById(R.id.CloseDialogImageView);
        nome="";

        acquista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getIntent().getStringExtra("nomeProd") != null){
                    DataBase db= new DataBase(acquisto.this);
                    nome= getIntent().getExtras().getString("nomeProd");
                    db.aggiungiOrdine(nome, "des ", 0.3);
                    Intent intent= new Intent(acquisto.this, gOrdini.class);
                    intent.putExtra("nomeP", nome);
                    startActivity(intent);
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(acquisto.this, eCarrello.class);
                startActivity(intent);
            }
        });


    }
}