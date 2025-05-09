package it.model.catalogo;

public class Ingrediente {
    private String nomeIngrediente;
    private String descrizioneIngrediente;
    private String origineDichiarata;
    public String quantitaUtilizzata;
    public boolean isLocaleVerificato;

    public Ingrediente(String nomeIngrediente, String descrizioneIngrediente, String quantitaUtilizzata, String origineDichiarata) {
        this.nomeIngrediente = nomeIngrediente;
        this.descrizioneIngrediente = descrizioneIngrediente;
        this.origineDichiarata = origineDichiarata;
        this.quantitaUtilizzata = quantiutilizzata;
        this.isLocaleVerificato = false;
    }
}