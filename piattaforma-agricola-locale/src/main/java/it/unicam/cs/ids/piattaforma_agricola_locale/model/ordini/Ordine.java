package it.unicam.cs.ids.piattaforma_agricola_locale.model.ordini;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import it.unicam.cs.ids.piattaforma_agricola_locale.model.utenti.Acquirente;

public class Ordine {
    private String idOrdine;
    private LocalDate dataOraOrdine;
    private double importoTotale;
    private StatoOrdine statoCorrente;
    private Acquirente acquirente;
    private List<RigaOrdine> righeOrdine;

    public Ordine (String idOrdine, Acquirente acquirente)
    {
        this.idOrdine = idOrdine;
        this.acquirente = acquirente;
        this.dataOraOrdine = LocalDate.now();
    }
    public void SetstatoCorrente(StatoOrdine statoCorrente) {
        this.statoCorrente = statoCorrente;
    }
    public StatoOrdine getStatoCorrente() {
        return statoCorrente;
    }
    public void aggiungiRiga(RigaOrdine riga) {
        this.righeOrdine.add(riga);
    }
    public List<RigaOrdine> getRigaOrdine() {
        return righeOrdine;
    }
    public void calcolaImportoTotale() {
        this.importoTotale = 0;
        for (RigaOrdine riga : this.righeOrdine) {
            this.importoTotale += riga.getPrezzoSubtotale();
        }
    }
    public void conferma() {
        this.statoCorrente = StatoOrdine.CONFERMATA;
    }
    public void paga() {
        this.statoCorrente = StatoOrdine.PAGATA;
    }
    public void annulla() {
        this.statoCorrente = StatoOrdine.ANNULLATA;
    }
    public Acquirente getAcquirente() {
        return acquirente;
    }

}