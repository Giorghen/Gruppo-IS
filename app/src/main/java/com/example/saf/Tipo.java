package com.example.saf;

public class Tipo {

    String nome, prezzo;

    public Tipo(String nome, String prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n){
        nome= n;
    }

    public String getPrize() {
        return prezzo;
    }

    public void setPrezzo(String p){
        prezzo= p;
    }
}
