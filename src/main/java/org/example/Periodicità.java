package org.example;



public enum Periodicità {
    settimanale ("settimanale"),
    mensile ("mensile"),
    semestrale ("semestrale");

    private final String descrizione;

    Periodicità(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public String toString() {
        return
                 descrizione
                ;
    }
}
