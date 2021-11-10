package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class acquisto extends AppCompatActivity {

    private Button acquista;
    private ImageView back;
    private String nome;
    private EditText tit, numCarta, cVv, indirizzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acquisto);

        acquista= findViewById(R.id.acquisto);
        back= findViewById(R.id.CloseDialogImageView);
        tit= findViewById(R.id.nome_titolare0);
        numCarta= findViewById(R.id.numero_carta0);
        cVv= findViewById(R.id.cvv0);
        indirizzo= findViewById(R.id.consegna0);
        nome="";

        acquista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t= tit.getText().toString();
                String num= numCarta.getText().toString();
                String cv= cVv.getText().toString();
                String in= indirizzo.getText().toString();

                if (getIntent().getStringExtra("nomeProd") != null && !t.equals("") && !num.equals("") && !cv.equals("") && !in.equals("") ){
                    DataBase db= new DataBase(acquisto.this);
                    nome= getIntent().getExtras().getString("nomeProd");
                    db.aggiungiOrdine(nome, "des ", 0.3);
                    Intent intent= new Intent(acquisto.this, gOrdini.class);
                    intent.putExtra("nomeP", nome);
                    startActivity(intent);
                }
                else
                    Toast.makeText(acquisto.this, "Errore nell'inserimento", Toast.LENGTH_SHORT).show();
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