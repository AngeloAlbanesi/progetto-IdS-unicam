package it.model.common;

public class ContenutoInRevisione {
    public void approva(ElementoVerificabile elemento) {

    }

    public void respingi(ElementoVerificabile elemento) {
    }

    public void richiediModifica(ElementoVerificabile elemento) {

    }

    public StatoVerificaValori getNomeStato(){
        return StatoVerificaValori.IN_REVISIONE;
    }
}