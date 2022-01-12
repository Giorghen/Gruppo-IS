package com.example.saf;

public class UtenteDao {

    public UtenteDao(String no, String co, String cf, String em, String pw, String addres){
        nome= no;
        cognome= co;
        cF= cf;
        email= em;
        password= pw;
        indirizzo= addres;
    }

    /**
     * Controlla la lunghezza del nome.
     * Se il nome ha una lunghezza inferiore di 4 restituisce false, altrimenti restituisce true
     * @return valore booleano
     */
    public boolean lunghezzaNome(){

        boolean lunghezza= false;

        if(nome.length() >= 4)
            lunghezza= true;

        return lunghezza;
    }

    /**
     * Controlla la lunghezza del cognome.
     * Se il cognome ha una lunghezza inferiore di 4 restituisce false, altrimenti restituisce true
     * @return valore booleano
     */
    public boolean lunghezzaCognome(){

        boolean lunghezza= false;

        if(cognome.length() >= 4)
            lunghezza= true;

        return lunghezza;

    }

    /**
     * Controlla la lunghezza del codice fiscale.
     * Se il codice fiscale ha una lunghezza inferiore o maggiore di 16 viene restituito false,
     * mentre se è uguale a 16 viene restituito true.
     * @return valore booleano
     */
    public boolean lunghezzaCf(){

        boolean lunghezza= false;

        if(cF.length() == 16)
            lunghezza= true;

        return lunghezza;
    }

    private String nome, cognome, cF, email, password, indirizzo;
}