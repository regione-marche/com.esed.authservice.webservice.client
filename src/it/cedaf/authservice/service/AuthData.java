/**
 * AuthData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.cedaf.authservice.service;

public class AuthData  implements java.io.Serializable {
    private java.lang.String authId;

    private java.lang.String aziendaDenominazione;

    private java.lang.String aziendaPIVA;

    private java.lang.String aziendaSedelegale;

    private java.lang.String aziendaSedelegaleCitta;

    private java.lang.String cellulare;

    private java.lang.String codiceFiscale;

    private java.lang.String cognome;

    private java.util.Calendar dataInserimento;

    private boolean demo;

    private java.util.Calendar documentoDataRilascio;

    private java.util.Calendar documentoDataScadenza;

    private java.lang.String documentoEnteRilascio;

    private java.lang.String documentoNumero;

    private java.lang.String documentoTipo;

    private java.lang.String domicilioCap;

    private java.lang.String domicilioCitta;

    private java.lang.String domicilioIndirizzo;

    private java.lang.String domicilioProvincia;

    private java.lang.String domicilioStato;

    private java.lang.String fax;

    private java.lang.String idCard;

    private java.lang.String lavoro;

    private java.lang.String livelloAutenticazione;

    private java.lang.String livelloPasswordPolicy;

    private java.lang.String mailAddress;

    private java.util.Calendar nascitaData;

    private java.lang.String nascitaLuogo;

    private java.lang.String nascitaProvincia;

    private java.lang.String nome;

    private java.lang.String pec;

    private java.lang.String professionistaAlbo;

    private java.lang.String professionistaEstremiAlbo;

    private java.lang.String residenzaCap;

    private java.lang.String residenzaCitta;

    private java.lang.String residenzaIndirizzo;

    private java.lang.String residenzaProvincia;

    private java.lang.String residenzaStato;

    private java.lang.String sesso;

    private java.lang.String telefono;

    private java.lang.String tipoSoggetto;

    private java.lang.String titolo;

    public AuthData() {
    }

    public AuthData(
           java.lang.String authId,
           java.lang.String aziendaDenominazione,
           java.lang.String aziendaPIVA,
           java.lang.String aziendaSedelegale,
           java.lang.String aziendaSedelegaleCitta,
           java.lang.String cellulare,
           java.lang.String codiceFiscale,
           java.lang.String cognome,
           java.util.Calendar dataInserimento,
           boolean demo,
           java.util.Calendar documentoDataRilascio,
           java.util.Calendar documentoDataScadenza,
           java.lang.String documentoEnteRilascio,
           java.lang.String documentoNumero,
           java.lang.String documentoTipo,
           java.lang.String domicilioCap,
           java.lang.String domicilioCitta,
           java.lang.String domicilioIndirizzo,
           java.lang.String domicilioProvincia,
           java.lang.String domicilioStato,
           java.lang.String fax,
           java.lang.String idCard,
           java.lang.String lavoro,
           java.lang.String livelloAutenticazione,
           java.lang.String livelloPasswordPolicy,
           java.lang.String mailAddress,
           java.util.Calendar nascitaData,
           java.lang.String nascitaLuogo,
           java.lang.String nascitaProvincia,
           java.lang.String nome,
           java.lang.String pec,
           java.lang.String professionistaAlbo,
           java.lang.String professionistaEstremiAlbo,
           java.lang.String residenzaCap,
           java.lang.String residenzaCitta,
           java.lang.String residenzaIndirizzo,
           java.lang.String residenzaProvincia,
           java.lang.String residenzaStato,
           java.lang.String sesso,
           java.lang.String telefono,
           java.lang.String tipoSoggetto,
           java.lang.String titolo) {
           this.authId = authId;
           this.aziendaDenominazione = aziendaDenominazione;
           this.aziendaPIVA = aziendaPIVA;
           this.aziendaSedelegale = aziendaSedelegale;
           this.aziendaSedelegaleCitta = aziendaSedelegaleCitta;
           this.cellulare = cellulare;
           this.codiceFiscale = codiceFiscale;
           this.cognome = cognome;
           this.dataInserimento = dataInserimento;
           this.demo = demo;
           this.documentoDataRilascio = documentoDataRilascio;
           this.documentoDataScadenza = documentoDataScadenza;
           this.documentoEnteRilascio = documentoEnteRilascio;
           this.documentoNumero = documentoNumero;
           this.documentoTipo = documentoTipo;
           this.domicilioCap = domicilioCap;
           this.domicilioCitta = domicilioCitta;
           this.domicilioIndirizzo = domicilioIndirizzo;
           this.domicilioProvincia = domicilioProvincia;
           this.domicilioStato = domicilioStato;
           this.fax = fax;
           this.idCard = idCard;
           this.lavoro = lavoro;
           this.livelloAutenticazione = livelloAutenticazione;
           this.livelloPasswordPolicy = livelloPasswordPolicy;
           this.mailAddress = mailAddress;
           this.nascitaData = nascitaData;
           this.nascitaLuogo = nascitaLuogo;
           this.nascitaProvincia = nascitaProvincia;
           this.nome = nome;
           this.pec = pec;
           this.professionistaAlbo = professionistaAlbo;
           this.professionistaEstremiAlbo = professionistaEstremiAlbo;
           this.residenzaCap = residenzaCap;
           this.residenzaCitta = residenzaCitta;
           this.residenzaIndirizzo = residenzaIndirizzo;
           this.residenzaProvincia = residenzaProvincia;
           this.residenzaStato = residenzaStato;
           this.sesso = sesso;
           this.telefono = telefono;
           this.tipoSoggetto = tipoSoggetto;
           this.titolo = titolo;
    }


    /**
     * Gets the authId value for this AuthData.
     * 
     * @return authId
     */
    public java.lang.String getAuthId() {
        return authId;
    }


    /**
     * Sets the authId value for this AuthData.
     * 
     * @param authId
     */
    public void setAuthId(java.lang.String authId) {
        this.authId = authId;
    }


    /**
     * Gets the aziendaDenominazione value for this AuthData.
     * 
     * @return aziendaDenominazione
     */
    public java.lang.String getAziendaDenominazione() {
        return aziendaDenominazione;
    }


    /**
     * Sets the aziendaDenominazione value for this AuthData.
     * 
     * @param aziendaDenominazione
     */
    public void setAziendaDenominazione(java.lang.String aziendaDenominazione) {
        this.aziendaDenominazione = aziendaDenominazione;
    }


    /**
     * Gets the aziendaPIVA value for this AuthData.
     * 
     * @return aziendaPIVA
     */
    public java.lang.String getAziendaPIVA() {
        return aziendaPIVA;
    }


    /**
     * Sets the aziendaPIVA value for this AuthData.
     * 
     * @param aziendaPIVA
     */
    public void setAziendaPIVA(java.lang.String aziendaPIVA) {
        this.aziendaPIVA = aziendaPIVA;
    }


    /**
     * Gets the aziendaSedelegale value for this AuthData.
     * 
     * @return aziendaSedelegale
     */
    public java.lang.String getAziendaSedelegale() {
        return aziendaSedelegale;
    }


    /**
     * Sets the aziendaSedelegale value for this AuthData.
     * 
     * @param aziendaSedelegale
     */
    public void setAziendaSedelegale(java.lang.String aziendaSedelegale) {
        this.aziendaSedelegale = aziendaSedelegale;
    }


    /**
     * Gets the aziendaSedelegaleCitta value for this AuthData.
     * 
     * @return aziendaSedelegaleCitta
     */
    public java.lang.String getAziendaSedelegaleCitta() {
        return aziendaSedelegaleCitta;
    }


    /**
     * Sets the aziendaSedelegaleCitta value for this AuthData.
     * 
     * @param aziendaSedelegaleCitta
     */
    public void setAziendaSedelegaleCitta(java.lang.String aziendaSedelegaleCitta) {
        this.aziendaSedelegaleCitta = aziendaSedelegaleCitta;
    }


    /**
     * Gets the cellulare value for this AuthData.
     * 
     * @return cellulare
     */
    public java.lang.String getCellulare() {
        return cellulare;
    }


    /**
     * Sets the cellulare value for this AuthData.
     * 
     * @param cellulare
     */
    public void setCellulare(java.lang.String cellulare) {
        this.cellulare = cellulare;
    }


    /**
     * Gets the codiceFiscale value for this AuthData.
     * 
     * @return codiceFiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this AuthData.
     * 
     * @param codiceFiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the cognome value for this AuthData.
     * 
     * @return cognome
     */
    public java.lang.String getCognome() {
        return cognome;
    }


    /**
     * Sets the cognome value for this AuthData.
     * 
     * @param cognome
     */
    public void setCognome(java.lang.String cognome) {
        this.cognome = cognome;
    }


    /**
     * Gets the dataInserimento value for this AuthData.
     * 
     * @return dataInserimento
     */
    public java.util.Calendar getDataInserimento() {
        return dataInserimento;
    }


    /**
     * Sets the dataInserimento value for this AuthData.
     * 
     * @param dataInserimento
     */
    public void setDataInserimento(java.util.Calendar dataInserimento) {
        this.dataInserimento = dataInserimento;
    }


    /**
     * Gets the demo value for this AuthData.
     * 
     * @return demo
     */
    public boolean isDemo() {
        return demo;
    }


    /**
     * Sets the demo value for this AuthData.
     * 
     * @param demo
     */
    public void setDemo(boolean demo) {
        this.demo = demo;
    }


    /**
     * Gets the documentoDataRilascio value for this AuthData.
     * 
     * @return documentoDataRilascio
     */
    public java.util.Calendar getDocumentoDataRilascio() {
        return documentoDataRilascio;
    }


    /**
     * Sets the documentoDataRilascio value for this AuthData.
     * 
     * @param documentoDataRilascio
     */
    public void setDocumentoDataRilascio(java.util.Calendar documentoDataRilascio) {
        this.documentoDataRilascio = documentoDataRilascio;
    }


    /**
     * Gets the documentoDataScadenza value for this AuthData.
     * 
     * @return documentoDataScadenza
     */
    public java.util.Calendar getDocumentoDataScadenza() {
        return documentoDataScadenza;
    }


    /**
     * Sets the documentoDataScadenza value for this AuthData.
     * 
     * @param documentoDataScadenza
     */
    public void setDocumentoDataScadenza(java.util.Calendar documentoDataScadenza) {
        this.documentoDataScadenza = documentoDataScadenza;
    }


    /**
     * Gets the documentoEnteRilascio value for this AuthData.
     * 
     * @return documentoEnteRilascio
     */
    public java.lang.String getDocumentoEnteRilascio() {
        return documentoEnteRilascio;
    }


    /**
     * Sets the documentoEnteRilascio value for this AuthData.
     * 
     * @param documentoEnteRilascio
     */
    public void setDocumentoEnteRilascio(java.lang.String documentoEnteRilascio) {
        this.documentoEnteRilascio = documentoEnteRilascio;
    }


    /**
     * Gets the documentoNumero value for this AuthData.
     * 
     * @return documentoNumero
     */
    public java.lang.String getDocumentoNumero() {
        return documentoNumero;
    }


    /**
     * Sets the documentoNumero value for this AuthData.
     * 
     * @param documentoNumero
     */
    public void setDocumentoNumero(java.lang.String documentoNumero) {
        this.documentoNumero = documentoNumero;
    }


    /**
     * Gets the documentoTipo value for this AuthData.
     * 
     * @return documentoTipo
     */
    public java.lang.String getDocumentoTipo() {
        return documentoTipo;
    }


    /**
     * Sets the documentoTipo value for this AuthData.
     * 
     * @param documentoTipo
     */
    public void setDocumentoTipo(java.lang.String documentoTipo) {
        this.documentoTipo = documentoTipo;
    }


    /**
     * Gets the domicilioCap value for this AuthData.
     * 
     * @return domicilioCap
     */
    public java.lang.String getDomicilioCap() {
        return domicilioCap;
    }


    /**
     * Sets the domicilioCap value for this AuthData.
     * 
     * @param domicilioCap
     */
    public void setDomicilioCap(java.lang.String domicilioCap) {
        this.domicilioCap = domicilioCap;
    }


    /**
     * Gets the domicilioCitta value for this AuthData.
     * 
     * @return domicilioCitta
     */
    public java.lang.String getDomicilioCitta() {
        return domicilioCitta;
    }


    /**
     * Sets the domicilioCitta value for this AuthData.
     * 
     * @param domicilioCitta
     */
    public void setDomicilioCitta(java.lang.String domicilioCitta) {
        this.domicilioCitta = domicilioCitta;
    }


    /**
     * Gets the domicilioIndirizzo value for this AuthData.
     * 
     * @return domicilioIndirizzo
     */
    public java.lang.String getDomicilioIndirizzo() {
        return domicilioIndirizzo;
    }


    /**
     * Sets the domicilioIndirizzo value for this AuthData.
     * 
     * @param domicilioIndirizzo
     */
    public void setDomicilioIndirizzo(java.lang.String domicilioIndirizzo) {
        this.domicilioIndirizzo = domicilioIndirizzo;
    }


    /**
     * Gets the domicilioProvincia value for this AuthData.
     * 
     * @return domicilioProvincia
     */
    public java.lang.String getDomicilioProvincia() {
        return domicilioProvincia;
    }


    /**
     * Sets the domicilioProvincia value for this AuthData.
     * 
     * @param domicilioProvincia
     */
    public void setDomicilioProvincia(java.lang.String domicilioProvincia) {
        this.domicilioProvincia = domicilioProvincia;
    }


    /**
     * Gets the domicilioStato value for this AuthData.
     * 
     * @return domicilioStato
     */
    public java.lang.String getDomicilioStato() {
        return domicilioStato;
    }


    /**
     * Sets the domicilioStato value for this AuthData.
     * 
     * @param domicilioStato
     */
    public void setDomicilioStato(java.lang.String domicilioStato) {
        this.domicilioStato = domicilioStato;
    }


    /**
     * Gets the fax value for this AuthData.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this AuthData.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the idCard value for this AuthData.
     * 
     * @return idCard
     */
    public java.lang.String getIdCard() {
        return idCard;
    }


    /**
     * Sets the idCard value for this AuthData.
     * 
     * @param idCard
     */
    public void setIdCard(java.lang.String idCard) {
        this.idCard = idCard;
    }


    /**
     * Gets the lavoro value for this AuthData.
     * 
     * @return lavoro
     */
    public java.lang.String getLavoro() {
        return lavoro;
    }


    /**
     * Sets the lavoro value for this AuthData.
     * 
     * @param lavoro
     */
    public void setLavoro(java.lang.String lavoro) {
        this.lavoro = lavoro;
    }


    /**
     * Gets the livelloAutenticazione value for this AuthData.
     * 
     * @return livelloAutenticazione
     */
    public java.lang.String getLivelloAutenticazione() {
        return livelloAutenticazione;
    }


    /**
     * Sets the livelloAutenticazione value for this AuthData.
     * 
     * @param livelloAutenticazione
     */
    public void setLivelloAutenticazione(java.lang.String livelloAutenticazione) {
        this.livelloAutenticazione = livelloAutenticazione;
    }


    /**
     * Gets the livelloPasswordPolicy value for this AuthData.
     * 
     * @return livelloPasswordPolicy
     */
    public java.lang.String getLivelloPasswordPolicy() {
        return livelloPasswordPolicy;
    }


    /**
     * Sets the livelloPasswordPolicy value for this AuthData.
     * 
     * @param livelloPasswordPolicy
     */
    public void setLivelloPasswordPolicy(java.lang.String livelloPasswordPolicy) {
        this.livelloPasswordPolicy = livelloPasswordPolicy;
    }


    /**
     * Gets the mailAddress value for this AuthData.
     * 
     * @return mailAddress
     */
    public java.lang.String getMailAddress() {
        return mailAddress;
    }


    /**
     * Sets the mailAddress value for this AuthData.
     * 
     * @param mailAddress
     */
    public void setMailAddress(java.lang.String mailAddress) {
        this.mailAddress = mailAddress;
    }


    /**
     * Gets the nascitaData value for this AuthData.
     * 
     * @return nascitaData
     */
    public java.util.Calendar getNascitaData() {
        return nascitaData;
    }


    /**
     * Sets the nascitaData value for this AuthData.
     * 
     * @param nascitaData
     */
    public void setNascitaData(java.util.Calendar nascitaData) {
        this.nascitaData = nascitaData;
    }


    /**
     * Gets the nascitaLuogo value for this AuthData.
     * 
     * @return nascitaLuogo
     */
    public java.lang.String getNascitaLuogo() {
        return nascitaLuogo;
    }


    /**
     * Sets the nascitaLuogo value for this AuthData.
     * 
     * @param nascitaLuogo
     */
    public void setNascitaLuogo(java.lang.String nascitaLuogo) {
        this.nascitaLuogo = nascitaLuogo;
    }


    /**
     * Gets the nascitaProvincia value for this AuthData.
     * 
     * @return nascitaProvincia
     */
    public java.lang.String getNascitaProvincia() {
        return nascitaProvincia;
    }


    /**
     * Sets the nascitaProvincia value for this AuthData.
     * 
     * @param nascitaProvincia
     */
    public void setNascitaProvincia(java.lang.String nascitaProvincia) {
        this.nascitaProvincia = nascitaProvincia;
    }


    /**
     * Gets the nome value for this AuthData.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this AuthData.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the pec value for this AuthData.
     * 
     * @return pec
     */
    public java.lang.String getPec() {
        return pec;
    }


    /**
     * Sets the pec value for this AuthData.
     * 
     * @param pec
     */
    public void setPec(java.lang.String pec) {
        this.pec = pec;
    }


    /**
     * Gets the professionistaAlbo value for this AuthData.
     * 
     * @return professionistaAlbo
     */
    public java.lang.String getProfessionistaAlbo() {
        return professionistaAlbo;
    }


    /**
     * Sets the professionistaAlbo value for this AuthData.
     * 
     * @param professionistaAlbo
     */
    public void setProfessionistaAlbo(java.lang.String professionistaAlbo) {
        this.professionistaAlbo = professionistaAlbo;
    }


    /**
     * Gets the professionistaEstremiAlbo value for this AuthData.
     * 
     * @return professionistaEstremiAlbo
     */
    public java.lang.String getProfessionistaEstremiAlbo() {
        return professionistaEstremiAlbo;
    }


    /**
     * Sets the professionistaEstremiAlbo value for this AuthData.
     * 
     * @param professionistaEstremiAlbo
     */
    public void setProfessionistaEstremiAlbo(java.lang.String professionistaEstremiAlbo) {
        this.professionistaEstremiAlbo = professionistaEstremiAlbo;
    }


    /**
     * Gets the residenzaCap value for this AuthData.
     * 
     * @return residenzaCap
     */
    public java.lang.String getResidenzaCap() {
        return residenzaCap;
    }


    /**
     * Sets the residenzaCap value for this AuthData.
     * 
     * @param residenzaCap
     */
    public void setResidenzaCap(java.lang.String residenzaCap) {
        this.residenzaCap = residenzaCap;
    }


    /**
     * Gets the residenzaCitta value for this AuthData.
     * 
     * @return residenzaCitta
     */
    public java.lang.String getResidenzaCitta() {
        return residenzaCitta;
    }


    /**
     * Sets the residenzaCitta value for this AuthData.
     * 
     * @param residenzaCitta
     */
    public void setResidenzaCitta(java.lang.String residenzaCitta) {
        this.residenzaCitta = residenzaCitta;
    }


    /**
     * Gets the residenzaIndirizzo value for this AuthData.
     * 
     * @return residenzaIndirizzo
     */
    public java.lang.String getResidenzaIndirizzo() {
        return residenzaIndirizzo;
    }


    /**
     * Sets the residenzaIndirizzo value for this AuthData.
     * 
     * @param residenzaIndirizzo
     */
    public void setResidenzaIndirizzo(java.lang.String residenzaIndirizzo) {
        this.residenzaIndirizzo = residenzaIndirizzo;
    }


    /**
     * Gets the residenzaProvincia value for this AuthData.
     * 
     * @return residenzaProvincia
     */
    public java.lang.String getResidenzaProvincia() {
        return residenzaProvincia;
    }


    /**
     * Sets the residenzaProvincia value for this AuthData.
     * 
     * @param residenzaProvincia
     */
    public void setResidenzaProvincia(java.lang.String residenzaProvincia) {
        this.residenzaProvincia = residenzaProvincia;
    }


    /**
     * Gets the residenzaStato value for this AuthData.
     * 
     * @return residenzaStato
     */
    public java.lang.String getResidenzaStato() {
        return residenzaStato;
    }


    /**
     * Sets the residenzaStato value for this AuthData.
     * 
     * @param residenzaStato
     */
    public void setResidenzaStato(java.lang.String residenzaStato) {
        this.residenzaStato = residenzaStato;
    }


    /**
     * Gets the sesso value for this AuthData.
     * 
     * @return sesso
     */
    public java.lang.String getSesso() {
        return sesso;
    }


    /**
     * Sets the sesso value for this AuthData.
     * 
     * @param sesso
     */
    public void setSesso(java.lang.String sesso) {
        this.sesso = sesso;
    }


    /**
     * Gets the telefono value for this AuthData.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this AuthData.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the tipoSoggetto value for this AuthData.
     * 
     * @return tipoSoggetto
     */
    public java.lang.String getTipoSoggetto() {
        return tipoSoggetto;
    }


    /**
     * Sets the tipoSoggetto value for this AuthData.
     * 
     * @param tipoSoggetto
     */
    public void setTipoSoggetto(java.lang.String tipoSoggetto) {
        this.tipoSoggetto = tipoSoggetto;
    }


    /**
     * Gets the titolo value for this AuthData.
     * 
     * @return titolo
     */
    public java.lang.String getTitolo() {
        return titolo;
    }


    /**
     * Sets the titolo value for this AuthData.
     * 
     * @param titolo
     */
    public void setTitolo(java.lang.String titolo) {
        this.titolo = titolo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthData)) return false;
        AuthData other = (AuthData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authId==null && other.getAuthId()==null) || 
             (this.authId!=null &&
              this.authId.equals(other.getAuthId()))) &&
            ((this.aziendaDenominazione==null && other.getAziendaDenominazione()==null) || 
             (this.aziendaDenominazione!=null &&
              this.aziendaDenominazione.equals(other.getAziendaDenominazione()))) &&
            ((this.aziendaPIVA==null && other.getAziendaPIVA()==null) || 
             (this.aziendaPIVA!=null &&
              this.aziendaPIVA.equals(other.getAziendaPIVA()))) &&
            ((this.aziendaSedelegale==null && other.getAziendaSedelegale()==null) || 
             (this.aziendaSedelegale!=null &&
              this.aziendaSedelegale.equals(other.getAziendaSedelegale()))) &&
            ((this.aziendaSedelegaleCitta==null && other.getAziendaSedelegaleCitta()==null) || 
             (this.aziendaSedelegaleCitta!=null &&
              this.aziendaSedelegaleCitta.equals(other.getAziendaSedelegaleCitta()))) &&
            ((this.cellulare==null && other.getCellulare()==null) || 
             (this.cellulare!=null &&
              this.cellulare.equals(other.getCellulare()))) &&
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            ((this.cognome==null && other.getCognome()==null) || 
             (this.cognome!=null &&
              this.cognome.equals(other.getCognome()))) &&
            ((this.dataInserimento==null && other.getDataInserimento()==null) || 
             (this.dataInserimento!=null &&
              this.dataInserimento.equals(other.getDataInserimento()))) &&
            this.demo == other.isDemo() &&
            ((this.documentoDataRilascio==null && other.getDocumentoDataRilascio()==null) || 
             (this.documentoDataRilascio!=null &&
              this.documentoDataRilascio.equals(other.getDocumentoDataRilascio()))) &&
            ((this.documentoDataScadenza==null && other.getDocumentoDataScadenza()==null) || 
             (this.documentoDataScadenza!=null &&
              this.documentoDataScadenza.equals(other.getDocumentoDataScadenza()))) &&
            ((this.documentoEnteRilascio==null && other.getDocumentoEnteRilascio()==null) || 
             (this.documentoEnteRilascio!=null &&
              this.documentoEnteRilascio.equals(other.getDocumentoEnteRilascio()))) &&
            ((this.documentoNumero==null && other.getDocumentoNumero()==null) || 
             (this.documentoNumero!=null &&
              this.documentoNumero.equals(other.getDocumentoNumero()))) &&
            ((this.documentoTipo==null && other.getDocumentoTipo()==null) || 
             (this.documentoTipo!=null &&
              this.documentoTipo.equals(other.getDocumentoTipo()))) &&
            ((this.domicilioCap==null && other.getDomicilioCap()==null) || 
             (this.domicilioCap!=null &&
              this.domicilioCap.equals(other.getDomicilioCap()))) &&
            ((this.domicilioCitta==null && other.getDomicilioCitta()==null) || 
             (this.domicilioCitta!=null &&
              this.domicilioCitta.equals(other.getDomicilioCitta()))) &&
            ((this.domicilioIndirizzo==null && other.getDomicilioIndirizzo()==null) || 
             (this.domicilioIndirizzo!=null &&
              this.domicilioIndirizzo.equals(other.getDomicilioIndirizzo()))) &&
            ((this.domicilioProvincia==null && other.getDomicilioProvincia()==null) || 
             (this.domicilioProvincia!=null &&
              this.domicilioProvincia.equals(other.getDomicilioProvincia()))) &&
            ((this.domicilioStato==null && other.getDomicilioStato()==null) || 
             (this.domicilioStato!=null &&
              this.domicilioStato.equals(other.getDomicilioStato()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.idCard==null && other.getIdCard()==null) || 
             (this.idCard!=null &&
              this.idCard.equals(other.getIdCard()))) &&
            ((this.lavoro==null && other.getLavoro()==null) || 
             (this.lavoro!=null &&
              this.lavoro.equals(other.getLavoro()))) &&
            ((this.livelloAutenticazione==null && other.getLivelloAutenticazione()==null) || 
             (this.livelloAutenticazione!=null &&
              this.livelloAutenticazione.equals(other.getLivelloAutenticazione()))) &&
            ((this.livelloPasswordPolicy==null && other.getLivelloPasswordPolicy()==null) || 
             (this.livelloPasswordPolicy!=null &&
              this.livelloPasswordPolicy.equals(other.getLivelloPasswordPolicy()))) &&
            ((this.mailAddress==null && other.getMailAddress()==null) || 
             (this.mailAddress!=null &&
              this.mailAddress.equals(other.getMailAddress()))) &&
            ((this.nascitaData==null && other.getNascitaData()==null) || 
             (this.nascitaData!=null &&
              this.nascitaData.equals(other.getNascitaData()))) &&
            ((this.nascitaLuogo==null && other.getNascitaLuogo()==null) || 
             (this.nascitaLuogo!=null &&
              this.nascitaLuogo.equals(other.getNascitaLuogo()))) &&
            ((this.nascitaProvincia==null && other.getNascitaProvincia()==null) || 
             (this.nascitaProvincia!=null &&
              this.nascitaProvincia.equals(other.getNascitaProvincia()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.pec==null && other.getPec()==null) || 
             (this.pec!=null &&
              this.pec.equals(other.getPec()))) &&
            ((this.professionistaAlbo==null && other.getProfessionistaAlbo()==null) || 
             (this.professionistaAlbo!=null &&
              this.professionistaAlbo.equals(other.getProfessionistaAlbo()))) &&
            ((this.professionistaEstremiAlbo==null && other.getProfessionistaEstremiAlbo()==null) || 
             (this.professionistaEstremiAlbo!=null &&
              this.professionistaEstremiAlbo.equals(other.getProfessionistaEstremiAlbo()))) &&
            ((this.residenzaCap==null && other.getResidenzaCap()==null) || 
             (this.residenzaCap!=null &&
              this.residenzaCap.equals(other.getResidenzaCap()))) &&
            ((this.residenzaCitta==null && other.getResidenzaCitta()==null) || 
             (this.residenzaCitta!=null &&
              this.residenzaCitta.equals(other.getResidenzaCitta()))) &&
            ((this.residenzaIndirizzo==null && other.getResidenzaIndirizzo()==null) || 
             (this.residenzaIndirizzo!=null &&
              this.residenzaIndirizzo.equals(other.getResidenzaIndirizzo()))) &&
            ((this.residenzaProvincia==null && other.getResidenzaProvincia()==null) || 
             (this.residenzaProvincia!=null &&
              this.residenzaProvincia.equals(other.getResidenzaProvincia()))) &&
            ((this.residenzaStato==null && other.getResidenzaStato()==null) || 
             (this.residenzaStato!=null &&
              this.residenzaStato.equals(other.getResidenzaStato()))) &&
            ((this.sesso==null && other.getSesso()==null) || 
             (this.sesso!=null &&
              this.sesso.equals(other.getSesso()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.tipoSoggetto==null && other.getTipoSoggetto()==null) || 
             (this.tipoSoggetto!=null &&
              this.tipoSoggetto.equals(other.getTipoSoggetto()))) &&
            ((this.titolo==null && other.getTitolo()==null) || 
             (this.titolo!=null &&
              this.titolo.equals(other.getTitolo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAuthId() != null) {
            _hashCode += getAuthId().hashCode();
        }
        if (getAziendaDenominazione() != null) {
            _hashCode += getAziendaDenominazione().hashCode();
        }
        if (getAziendaPIVA() != null) {
            _hashCode += getAziendaPIVA().hashCode();
        }
        if (getAziendaSedelegale() != null) {
            _hashCode += getAziendaSedelegale().hashCode();
        }
        if (getAziendaSedelegaleCitta() != null) {
            _hashCode += getAziendaSedelegaleCitta().hashCode();
        }
        if (getCellulare() != null) {
            _hashCode += getCellulare().hashCode();
        }
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        if (getCognome() != null) {
            _hashCode += getCognome().hashCode();
        }
        if (getDataInserimento() != null) {
            _hashCode += getDataInserimento().hashCode();
        }
        _hashCode += (isDemo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDocumentoDataRilascio() != null) {
            _hashCode += getDocumentoDataRilascio().hashCode();
        }
        if (getDocumentoDataScadenza() != null) {
            _hashCode += getDocumentoDataScadenza().hashCode();
        }
        if (getDocumentoEnteRilascio() != null) {
            _hashCode += getDocumentoEnteRilascio().hashCode();
        }
        if (getDocumentoNumero() != null) {
            _hashCode += getDocumentoNumero().hashCode();
        }
        if (getDocumentoTipo() != null) {
            _hashCode += getDocumentoTipo().hashCode();
        }
        if (getDomicilioCap() != null) {
            _hashCode += getDomicilioCap().hashCode();
        }
        if (getDomicilioCitta() != null) {
            _hashCode += getDomicilioCitta().hashCode();
        }
        if (getDomicilioIndirizzo() != null) {
            _hashCode += getDomicilioIndirizzo().hashCode();
        }
        if (getDomicilioProvincia() != null) {
            _hashCode += getDomicilioProvincia().hashCode();
        }
        if (getDomicilioStato() != null) {
            _hashCode += getDomicilioStato().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getIdCard() != null) {
            _hashCode += getIdCard().hashCode();
        }
        if (getLavoro() != null) {
            _hashCode += getLavoro().hashCode();
        }
        if (getLivelloAutenticazione() != null) {
            _hashCode += getLivelloAutenticazione().hashCode();
        }
        if (getLivelloPasswordPolicy() != null) {
            _hashCode += getLivelloPasswordPolicy().hashCode();
        }
        if (getMailAddress() != null) {
            _hashCode += getMailAddress().hashCode();
        }
        if (getNascitaData() != null) {
            _hashCode += getNascitaData().hashCode();
        }
        if (getNascitaLuogo() != null) {
            _hashCode += getNascitaLuogo().hashCode();
        }
        if (getNascitaProvincia() != null) {
            _hashCode += getNascitaProvincia().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getPec() != null) {
            _hashCode += getPec().hashCode();
        }
        if (getProfessionistaAlbo() != null) {
            _hashCode += getProfessionistaAlbo().hashCode();
        }
        if (getProfessionistaEstremiAlbo() != null) {
            _hashCode += getProfessionistaEstremiAlbo().hashCode();
        }
        if (getResidenzaCap() != null) {
            _hashCode += getResidenzaCap().hashCode();
        }
        if (getResidenzaCitta() != null) {
            _hashCode += getResidenzaCitta().hashCode();
        }
        if (getResidenzaIndirizzo() != null) {
            _hashCode += getResidenzaIndirizzo().hashCode();
        }
        if (getResidenzaProvincia() != null) {
            _hashCode += getResidenzaProvincia().hashCode();
        }
        if (getResidenzaStato() != null) {
            _hashCode += getResidenzaStato().hashCode();
        }
        if (getSesso() != null) {
            _hashCode += getSesso().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getTipoSoggetto() != null) {
            _hashCode += getTipoSoggetto().hashCode();
        }
        if (getTitolo() != null) {
            _hashCode += getTitolo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "AuthData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "authId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aziendaDenominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "aziendaDenominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aziendaPIVA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "aziendaPIVA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aziendaSedelegale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "aziendaSedelegale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aziendaSedelegaleCitta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "aziendaSedelegaleCitta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellulare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "cellulare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cognome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "cognome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInserimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "dataInserimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "demo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoDataRilascio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "documentoDataRilascio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoDataScadenza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "documentoDataScadenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoEnteRilascio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "documentoEnteRilascio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoNumero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "documentoNumero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "documentoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioCap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "domicilioCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioCitta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "domicilioCitta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioIndirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "domicilioIndirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "domicilioProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioStato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "domicilioStato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "idCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lavoro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "lavoro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("livelloAutenticazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "livelloAutenticazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("livelloPasswordPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "livelloPasswordPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "mailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nascitaData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "nascitaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nascitaLuogo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "nascitaLuogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nascitaProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "nascitaProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "pec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("professionistaAlbo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "professionistaAlbo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("professionistaEstremiAlbo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "professionistaEstremiAlbo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenzaCap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "residenzaCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenzaCitta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "residenzaCitta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenzaIndirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "residenzaIndirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenzaProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "residenzaProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenzaStato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "residenzaStato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "sesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSoggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "tipoSoggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "titolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
