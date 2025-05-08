package it.model.utenti;

import java.util.List;

import it.model.catalogo.Prodotto;

public abstract class Venditore extends Utente {
    private DatiAzienda datiAzienda;
    private List<Prodotto> prodottiOfferti;

    public Venditore(String nome, String cognome, String email, String password, DatiAzienda datiAzienda,
            List<Prodotto> prodottiOfferti) {
        super(nome, cognome, email, password, password, tipoRuolo);
        this.datiAzienda = datiAzienda;
        this.prodottiOfferti = prodottiOfferti;
    }

    public DatiAzienda getDatiAzienda() {
        return datiAzienda;
    }

    public List<Prodotto> getProdottiOfferti() {
        return prodottiOfferti;
    }
}