package it.unicam.cs.ids.piattaforma_agricola_locale.model.tracciabilita;

import java.util.List;

public class ProcessoDiTrasformazione {
    private String idProcesso;
    private String nomeProcesso;
    private String descrizione;
    private List<FaseLavorazione> fasiLavorazione;

    public ProcessoDiTrasformazione(String idProcesso, String nomeProcesso, String descrizione, List<FaseLavorazione> fasiLavorazione) {
        this.idProcesso = idProcesso;
        this.nomeProcesso = nomeProcesso;
        this.descrizione = descrizione;
        this.fasiLavorazione = fasiLavorazione;
    }
    public void aggiungiFaseLavorazione(FaseLavorazione faseLavorazione) {
        this.fasiLavorazione.add(faseLavorazione);

    }
    public List<FaseLavorazione> getFasiLavorazione() {
        return fasiLavorazione;
    }
}