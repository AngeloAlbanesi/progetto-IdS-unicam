package it.model.ordini;

public interface StatoOrdine {
public void conferma(Ordine ordine);
public void paga(Ordine ordine);
public void annulla(Ordine ordine);
public void prepara(Ordine ordine);
public void spedisci(Ordine ordine);
public void consegna(Ordine ordine);
public StatoOrdineValori getNomeStato();
}