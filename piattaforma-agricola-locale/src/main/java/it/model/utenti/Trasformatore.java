/*
 *   Copyright (c) 2025 
 *   All rights reserved.
 */
package it.model.utenti;

import java.util.List;
import it.model.catalogo.Prodotto;

import it.model.tracciabilita.ProcessoDiTrasformazione;

public class Trasformatore extends Venditore {
    private List<ProcessoDiTrasformazione> processiDiTrasformazione;

    public Trasformatore(String idUtente, String nome, String cognome, String email, String passwordHash,
            String numeroTelefono, DatiAzienda datiAzienda,
            List<Prodotto> prodottiOfferti, // Aggiunto per Venditore
            List<ProcessoDiTrasformazione> processiDiTrasformazione, // Specifico per Trasformatore
            TipoRuolo tipoRuolo, boolean isAttivo) {
        super(idUtente, nome, cognome, email, passwordHash, numeroTelefono, datiAzienda, prodottiOfferti, tipoRuolo,
                isAttivo);
        this.processiDiTrasformazione = processiDiTrasformazione;
    }

    public void aggiungiProcessoTrasformazione(ProcessoDiTrasformazione processo) {
        this.processiDiTrasformazione.add(processo);
    }
    public void rimuoviProcessoTrasformazione(ProcessoDiTrasformazione processo) {
        this.processiDiTrasformazione.remove(processo);
    }
    public List<ProcessoDiTrasformazione> getProcessiDiTrasformazione() {
        return processiDiTrasformazione;
    }
    public void setProcessiDiTrasformazione(List<ProcessoDiTrasformazione> processiDiTrasformazione) {
        this.processiDiTrasformazione = processiDiTrasformazione;
    }
}