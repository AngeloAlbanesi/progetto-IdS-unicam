package it.unicam.cs.ids.piattaforma_agricola_locale.model.tracciabilita;

import java.util.List;

import it.unicam.cs.ids.piattaforma_agricola_locale.model.catalogo.Ingrediente;
import it.unicam.cs.ids.piattaforma_agricola_locale.model.catalogo.Prodotto;

public class FaseLavorazione {
    private int ordineFase;
    private String descrizione;
    private List<Ingrediente> ingredientiUtilizzati;
    private Prodotto prodottoRisultante;

    public FaseLavorazione(int ordineFase, String descrizione, List<Ingrediente> ingredientiUtilizzati, Prodotto prodottoRisultante) {
        this.ordineFase = ordineFase;
        this.descrizione = descrizione;
        this.ingredientiUtilizzati = ingredientiUtilizzati;
        this.prodottoRisultante = prodottoRisultante;
    }
    public void aggiungiIngrediente(Ingrediente ingrediente) {
        this.ingredientiUtilizzati.add(ingrediente);
    }
    public List<Ingrediente> getIngredientiUtilizzati() {
        return ingredientiUtilizzati;
    }
    public Prodotto getProdottoRisultante() {
        return prodottoRisultante;
    }

}