package it.model.common;

public class ContenutoApprovato {

    public void approva(ElementoVerificabile elemento) {
        try {
            elemento.setStatoVerifica(StatoVerificaContenuto.APPROVATO);
        } catch {
            throw new UnsupportedOperationException("Impossibile approvare l'elemento");
        }

    }
    public void respingi (ElementoVerificabile elemento) {

    }
    public void richiediModifica (ElementoVerificabile elemento) {

    }



    public StatoVerificaValori getNomeStato()
    {
        return StatoVerificaValori.APPROVATO;
    }
}