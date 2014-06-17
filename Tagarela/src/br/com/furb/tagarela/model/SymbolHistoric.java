package br.com.furb.tagarela.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SYMBOL_HISTORIC.
 */
public class SymbolHistoric {

    private java.util.Date date;
    private Long symbolID;
    private Long tutorID;
    private Long userID;
    private Long serverID;
    private Boolean sincronized;
    private Long id;

    public SymbolHistoric() {
    }

    public SymbolHistoric(Long id) {
        this.id = id;
    }

    public SymbolHistoric(java.util.Date date, Long symbolID, Long tutorID, Long userID, Long serverID, Boolean sincronized, Long id) {
        this.date = date;
        this.symbolID = symbolID;
        this.tutorID = tutorID;
        this.userID = userID;
        this.serverID = serverID;
        this.sincronized = sincronized;
        this.id = id;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public Long getSymbolID() {
        return symbolID;
    }

    public void setSymbolID(Long symbolID) {
        this.symbolID = symbolID;
    }

    public Long getTutorID() {
        return tutorID;
    }

    public void setTutorID(Long tutorID) {
        this.tutorID = tutorID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getServerID() {
        return serverID;
    }

    public void setServerID(Long serverID) {
        this.serverID = serverID;
    }

    public Boolean getSincronized() {
        return sincronized;
    }

    public void setSincronized(Boolean sincronized) {
        this.sincronized = sincronized;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
