package it.model.tracciabilita;

import java.util.List;

import it.model.catalogo.Ingrediente;
import it.model.catalogo.Prodotto;

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