package com.example.saf;

public class Tipo {

    int imag;
    String nome, descrizione;
    Double prezzo;

    public Tipo(int imag, String nome, String desc, Double prezzo) {
        this.imag = imag;
        this.nome = nome;
        this.descrizione = desc;
        this.prezzo = prezzo;
    }

    public int getImage() {
        return imag;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return descrizione;
    }

    public Double getPrize() {
        return prezzo;
    }
}
