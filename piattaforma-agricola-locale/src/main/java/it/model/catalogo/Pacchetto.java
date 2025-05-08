package it.model.catalogo;

import it.model.common.Acquistabile;

public class Pacchetto implements Acquistabile {
    private String idPacchetto;
    private String nome;
    private String descrizione;
    private double prezzoPacchetto;
    private List <Acquistabile> elementiInclusi;
    private DistributoreDiTipicita distributore;

    public Pacchetto(String idPacchetto, String nome, String descrizione, double prezzoPacchetto,
            List <Acquistabile> elementiInclusi, DistributoreDiTipicita distributore) {
        this.idPacchetto = idPacchetto;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzoPacchetto = prezzoPacchetto;
        this.elementiInclusi = elementiInclusi;
        this.distributore = distributore;
    }

    public String getId() {
        return idPacchetto;
    }
    public String getNome() {
        return nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public double getPrezzo() {
        return prezzoPacchetto;
    }

}