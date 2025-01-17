package org.example;


public class ElementoCatalogo {
    protected int codiceISBN;
    protected String titolo;
    protected int annoDiPubblicazione;
    protected int numPagine;

    public ElementoCatalogo (int codiceISBN, String titolo, int annoDiPubblicazione, int numPagine){
        this.codiceISBN=codiceISBN;
        this.titolo=titolo;
        this.annoDiPubblicazione=annoDiPubblicazione;
        this.numPagine=numPagine;

    }
    public int getCodiceISBN() {
        return codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getNumPagine() {
        return numPagine;
    }


    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }


    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setCodiceISBN(int codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    @Override
    public String toString() {
        return
                "CodiceISBN:" + codiceISBN +
                ", Titolo: " + titolo +
                ", Anno di pubblicazione:" + annoDiPubblicazione +
                ", Numero di pagine:" + numPagine
                ;
    }
}
