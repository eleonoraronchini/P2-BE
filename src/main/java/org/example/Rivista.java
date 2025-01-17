package org.example;

public class Rivista extends ElementoCatalogo{
    private Periodicità periodicità;

    public Rivista(int codiceISBN, String titolo, int annoDiPubblicazione, int numPagine, Periodicità periodicità) {
        super(codiceISBN, titolo, annoDiPubblicazione, numPagine);
        this.periodicità = periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                ", Periodicità: " + periodicità;
    }


}
