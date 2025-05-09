package it.unicam.cs.ids.piattaforma_agricola_locale.model.catalogo;

import java.util.ArrayList;
import java.util.List;

import it.unicam.cs.ids.piattaforma_agricola_locale.model.common.Acquistabile;
import it.unicam.cs.ids.piattaforma_agricola_locale.model.common.ElementoVerificabile;
import it.unicam.cs.ids.piattaforma_agricola_locale.model.common.StatoVerificaContenuto;
import it.unicam.cs.ids.piattaforma_agricola_locale.model.utenti.Venditore;

public class Prodotto implements Acquistabile, ElementoVerificabile {

    private String idProdotto;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int quantitaDisponibile;
    private StatoVerificaContenuto statoVerifica;
    private String feedbackVerifica;
    private String categoriaProdotto;
    private Venditore venditore;
    private List<Certificazione> certificazioniProdotto;

    public Prodotto(String idProdotto, String nome, String descrizione, double prezzo, int quantitaDisponibile,Venditore venditore) {
        this.idProdotto = idProdotto;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;
        this.venditore = venditore;
        this.statoVerifica = StatoVerificaContenuto.NON_VERIFICATO;
        this.certificazioniProdotto = new ArrayList<>();
    }

    public String getId() {
        return idProdotto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantitaDisponibile() {
        return quantitaDisponibile;
    }
    public void setStatoVerifica(StatoVerificaContenuto statoVerifica) {
        this.statoVerifica = statoVerifica;

    }

    public StatoVerificaContenuto getStatoVerifica() {
        return statoVerifica;
    }

    public String getFeedbackVerifica() {
        return feedbackVerifica;
    }

    public void setFeedbackVerifica(String feedbackVerifica) {
        this.feedbackVerifica = feedbackVerifica;
    }
    public Venditore getVendore() {
        return venditore;
    }
    public void aggiungiCertificazione(Certificazione certificazione) {
        this.certificazioniProdotto.add(certificazione);
    }
    public List<Certificazione> getCertificazioni() {
        return certificazioniProdotto;
    }
    public void aggiornaQuantitaDisponibile(int quantita) {
        this.quantitaDisponibile += quantitaDisponibile;
    }

    @Override
    public String getIdElemento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIdElemento'");
    }
}