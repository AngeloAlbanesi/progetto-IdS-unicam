package it.model.common;

public interface ElementoVerificabile {
    public void setStatoVerifica(StatoVerificaContenuto statoVerifica);
    public StatoVerificaContenuto getStatoVerifica();
    public String getIdElemento();
    public String getFeedbackVerifica();
    public void setFeedbackVerifica(String feedbackVerifica);
}