/*
 *   Copyright (c) 2025 
 *   All rights reserved.
 */
package it.model.utenti;

import java.util.List;

import it.model.catalogo.Prodotto;

public abstract class Venditore extends Utente {
    private DatiAzienda datiAzienda;
    private List<Prodotto> prodottiOfferti;

    public Venditore(String idUtente, String nome, String cognome, String email, String passwordHash,
            String numeroTelefono, DatiAzienda datiAzienda,
            List<Prodotto> prodottiOfferti, TipoRuolo tipoRuolo, boolean isAttivo) {
        super(nome, cognome, email, passwordHash, numeroTelefono, idUtente, tipoRuolo, isAttivo);
        this.datiAzienda = datiAzienda;
        this.prodottiOfferti = prodottiOfferti;
    }

    public DatiAzienda getDatiAzienda() {
        return datiAzienda;
    }

    public List<Prodotto> getProdottiOfferti() {
        return prodottiOfferti;
    }

    public boolean aggiungiProdottoCatalogo(Prodotto prodotto) {
        return true;//TODO
        //return this.prodottiOfferti.add(prodotto);
    }

    public boolean rimuoviProdottoCatalogo(Prodotto prodotto) {
        return true;//TODO
        //return this.prodottiOfferti.remove(prodotto);
    }

    public boolean aggiornaProdottoCatalogo(Prodotto prodotto) {
        return true;//TODO
        //return this.prodottiOfferti.remove(prodotto);
    }

    public boolean gestisciOrdineRicevuto(){
        return true;//TODO:Completa metodo con anche i parametri del metodo
    }
}