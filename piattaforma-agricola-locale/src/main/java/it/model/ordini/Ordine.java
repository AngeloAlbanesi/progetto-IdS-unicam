package it.model.ordini;

public class Ordine {
    private String idOrdine;
    private Date dataOraOrdine;
    private double importoTotale;
    privare StatoOrdine statoCorrente;
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