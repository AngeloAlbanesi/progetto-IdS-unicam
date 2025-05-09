package it.model.ordini;

import it.model.common.Acquistabile;

public class RigaOrdine {
    private String idRiga;
    private Acquistabile acquistabile;
    private int quantitaOrdinata;
    private double prezzoUnitarioAlMomentoOrdine;

    public RigaOrdine(Acquistabile acquistabile, int quantitaOrdinata, double prezzoUnitarioAlMomentoOrdine) {
        this.acquistabile = acquistabile;
        this.quantitaOrdinata = quantitaOrdinata;
        this.prezzoUnitarioAlMomentoOrdine = prezzoUnitarioAlMomentoOrdine;
    }

    public Acquistabile getAcquistabile() {
        return acquistabile;
    }
    public int getQuantitaOrdinata() {
        return quantitaOrdinata;
    }
    public double getPrezzoSubtotale() {
        return prezzoUnitarioAlMomentoOrdine * quantitaOrdinata;
    }
}