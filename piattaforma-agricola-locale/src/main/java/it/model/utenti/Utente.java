package it.model.utenti;

public abstract class Utente {
    private String nome;
    private String cognome;
    private String email;
    private String passwordHash;
    private String numeroTelefono;
    protected TipoRuolo tipoRuolo;
    private boolean isAttivo;

    public Utente(String nome, String cognome, String email, String passwordHash, String numeroTelefono,
            TipoRuolo tipoRuolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.passwordHash = passwordHash;
        this.numeroTelefono = numeroTelefono;
        this.tipoRuolo = tipoRuolo;
        this.isAttivo = true; // Imposta isAttivo a true per default
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public TipoRuolo getTipoRuolo() {
        return tipoRuolo;
    }

    public void setTipoRuolo(TipoRuolo tipoRuolo) {
        this.tipoRuolo = tipoRuolo;
    }

    public boolean modificaPassword(String nuovaPassword) {

        // TODO: implementare la logica per modificare la password
        // Ad esempio, potresti aggiornare il campo passwordHash con un nuovo hash della
        // password
        // Restituisci true se la modifica è avvenuta con successo, altrimenti false
        return false;
    }

    public void disattivaAccount() {
        this.isAttivo = false;
    }

    public void riattivaAccount() {
        this.isAttivo = true;
    }

    public boolean isAttivo() {
        return isAttivo;
    }
}