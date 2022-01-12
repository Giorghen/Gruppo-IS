package com.example.saf;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtenteDaoTest {

    @Test
    public void nomeCorto() {
        UtenteDao utente = new UtenteDao("Al", "Staiano", "CHTR5123789TPIYL", "al@gmail.com", "Mareggiata23", "via Rossi");
        boolean risultato = utente.lunghezzaNome();
        assertEquals(false, risultato);
    }

    @Test
    public void nomeCorretto(){
        UtenteDao utente = new UtenteDao("Alberto", "Staiano", "CHTR5123789TPIYL", "al@gmail.com", "Mareggiata23", "via Rossi");
        boolean risultato = utente.lunghezzaNome();
        assertEquals(true, risultato);
    }

    @Test
    public void cognomeCorto(){
        UtenteDao utente = new UtenteDao("Alfonso", "Stan", "CHTR5123789TPIYL", "al@gmail.com", "Mareggiata23", "via Rossi");
        boolean risultato = utente.lunghezzaCognome();
        assertEquals(false, risultato);
    }

    @Test
    public void cognomeCorretto(){
        UtenteDao utente = new UtenteDao("Antonio", "Staiano", "CHTR5123789TPIYL", "al@gmail.com", "Mareggiata23", "via Rossi");
        boolean risultato = utente.lunghezzaCognome();
        assertEquals(true, risultato);
    }

    @Test
    public void cfCorto(){
        UtenteDao utente = new UtenteDao("Andrea", "Staiano", "CHTR51237", "al@gmail.com", "Mareggiata23", "via Rossi");
        boolean risultato = utente.lunghezzaCf();
        assertEquals(false, risultato);
    }

    @Test
    public void cfLungo(){
        UtenteDao utente = new UtenteDao("Alessia", "Staiano", "CHTR5123789TPIYL4897", "al@gmail.com", "Mareggiata23", "via Rossi");
        boolean risultato = utente.lunghezzaNome();
        assertEquals(false, risultato);
    }

    @Test
    public void cfCorretto(){
        UtenteDao utente = new UtenteDao("Al", "Staiano", "CHTR5123789TPIYL", "al@gmail.com", "Mareggiata23", "via Rossi");
        boolean risultato = utente.lunghezzaCf();
        assertEquals(true, risultato);
    }

}