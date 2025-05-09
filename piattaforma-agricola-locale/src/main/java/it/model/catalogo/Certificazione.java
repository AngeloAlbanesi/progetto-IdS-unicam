>package it.model.catalogo;

import it.model.common.ElementoVerificabile;
import it.model.common.StatoVerificaContenuto;

public class Certificazione implements ElementoVerificabile {
    private String idCertificazione;
    private String nomeCertificazione;
    private String enteRilascio;
    private Date dataRilascio;
    private Date dataScadenza;
    private StatoVerificaContenuto statoVerifica;
    private String feedbackVerifica;


    public Certificazione(String idCertificazione, String nomeCertificazione, String enteRilascio, Date dataRilascio,
            Date dataScadenza) {
        this.idCertificazione = idCertificazione;
        this.nomeCertificazione = nomeCertificazione;
        this.enteRilascio = enteRilascio;
        this.dataRilascio = dataRilascio;
        this.dataScadenza = dataScadenza;
    }
    public void setStatoVerifica(StatoVerificaContenuto statoVerifica) {
        this.statoVerifica = statoVerifica;

    }

    public StatoVerificaContenuto getStatoVerifica() {
        return statoVerifica;
    }

    public String getIdCertificazione() {
        return idCertificazione;
    }
    public String getFeedbackVerifica() {
        return feedbackVerifica;
    }

    public void setFeedbackVerifica(String feedbackVerifica) {
        this.feedbackVerifica = feedbackVerifica;
    }

}