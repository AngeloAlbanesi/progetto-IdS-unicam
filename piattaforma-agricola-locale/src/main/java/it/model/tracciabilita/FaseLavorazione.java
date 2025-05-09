package it.model.tracciabilita;

public class FaseLavorazione {
    private int ordineFase;
    private String Descrizione;
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