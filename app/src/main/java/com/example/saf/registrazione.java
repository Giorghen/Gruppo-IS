package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class registrazione extends AppCompatActivity {

    private ImageView back;
    private Button registrati;
    private DataBase db;
    private TextView nome;
    private TextView cognome;
    private TextView cf;
    private TextView email;
    private TextView indirizzo;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione);

        db= new DataBase(this);
        nome= findViewById(R.id.nome_cliente);
        cognome= findViewById(R.id.cognome_cliente);
        cf= findViewById(R.id.cf_cliente);
        email= findViewById(R.id.email_cliente);
        indirizzo= findViewById(R.id.indirizzo_cliente);
        password= findViewById(R.id.password_cliente);
        back = findViewById(R.id.indietro);
        registrati= findViewById(R.id.registrati);

        registrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DataBase db= new DataBase(registrazione.this);
                String nm= nome.getText().toString();
                String cn= cognome.getText().toString();
                String cF= cf.getText().toString();
                String em= email.getText().toString();
                String pw= password.getText().toString();
                String ind= indirizzo.getText().toString();

                db.aggiungiCliente(cF, nm, cn, ind, em, pw);
                Intent intent= new Intent(registrazione.this, bHomePage.class);
                intent.putExtra("codiceFiscale", cF);
                intent.putExtra("nome", nm);
                intent.putExtra("cognome", cn);
                intent.putExtra("indirizzo", ind);
                intent.putExtra("email", em);
                intent.putExtra("password", pw);
                startActivity(intent);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(registrazione.this, aLogin.class);
                startActivity(intent);
            }
        });
    }

}