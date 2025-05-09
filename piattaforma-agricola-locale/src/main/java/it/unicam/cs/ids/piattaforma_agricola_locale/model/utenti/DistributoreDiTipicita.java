/*
 *   Copyright (c) 2025 
 *   All rights reserved.
 */
package it.unicam.cs.ids.piattaforma_agricola_locale.model.utenti;
import java.util.List;

import it.unicam.cs.ids.piattaforma_agricola_locale.model.catalogo.Pacchetto;
import it.unicam.cs.ids.piattaforma_agricola_locale.model.catalogo.Prodotto;

public class DistributoreDiTipicita extends Venditore {
// Costruttore overload per factory (solo parametri base Venditore)
    public DistributoreDiTipicita(String idUtente, String nome, String cognome, String email, String passwordHash,
            String numeroTelefono, DatiAzienda datiAzienda,
            java.util.List<Prodotto> prodottiOfferti, TipoRuolo tipoRuolo, boolean isAttivo) {
        super(idUtente, nome, cognome, email, passwordHash, numeroTelefono, datiAzienda, prodottiOfferti, tipoRuolo, isAttivo);
        this.pacchettiOfferti = new java.util.ArrayList<>();
    }

    private List<Pacchetto> pacchettiOfferti;

    public DistributoreDiTipicita(String idUtente, String nome, String cognome, String email, String passwordHash,
            String numeroTelefono, DatiAzienda datiAzienda,
            List<Prodotto> prodottiOfferti, List<Pacchetto> pacchettiOfferti, TipoRuolo tipoRuolo, boolean isAttivo) {
        super(idUtente, nome, cognome, email, passwordHash, numeroTelefono, datiAzienda,
                prodottiOfferti, tipoRuolo, isAttivo);
        this.pacchettiOfferti = pacchettiOfferti;
    }

    public Pacchetto creaPacchetto(){
        return null;//TODO : creare pacchetto, anche i parametri del metodo 
    }

    public boolean aggiungiPacchettoCatalogo(Pacchetto pacchetto){
        return false;//TODO : aggiungere pacchetto al catalogo
    }

    public boolean rimuoviPacchettoCatalogo(Pacchetto pacchetto){
        return false;//TODO : rimuovere pacchetto dal catalogo
    }

    public List<Pacchetto> getPacchettiOfferti() {
        return pacchettiOfferti;
    }
    
}