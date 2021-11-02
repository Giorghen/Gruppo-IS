package com.example.saf;

public class Utente {

    public Utente(String codice,String nm, String cm, String ind, String em, String pw){
        cf= codice;
        nome= nm;
        cognome= cm;
        indirizzo= ind;
        email= em;
        password= pw;
    }

    public String getCf(){
        return cf;
    }

    public void setCf(String nuovo){
        cf= nuovo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nuovo){
        nome= nuovo;
    }

    public String getCognome(){
        return cognome;
    }

    public void setCognome(String nuovo){
        cognome= nuovo;
    }

    public String getIndirizzo(){
        return indirizzo;
    }

    public void setIndirizzo(String nuovo){
        indirizzo= nuovo;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String nuovo){
        email= nuovo;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String nuovo){
        password= nuovo;
    }

    private String cf, nome, cognome, indirizzo, email, password;

}
