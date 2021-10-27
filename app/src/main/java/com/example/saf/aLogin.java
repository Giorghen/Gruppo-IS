package com.example.saf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class aLogin extends AppCompatActivity {
    private EditText surname;
    private EditText credenziali2;
    private Button accedi;
    private Button registra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_login);

        surname =(EditText)findViewById(R.id.email);
        credenziali2 =(EditText)findViewById(R.id.password);
        accedi= (Button) findViewById(R.id.button);
        registra= (Button) findViewById(R.id.button2);

        accedi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
              azione (surname.getText().toString(), credenziali2.getText().toString());
            }
        });

        registra.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(aLogin.this, registrazione.class);
                startActivity(intent);
            }
        });
    }

    private void azione (String userName, String userPassword){
        if ((userName.equals("direttore@gmail.com")) && (userPassword.equals("mozzarella"))){
            Intent intent= new Intent(aLogin.this, bHomePage.class);
            startActivity(intent);
        }
    }
}
