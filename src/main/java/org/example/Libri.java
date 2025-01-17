package org.example;

public class Libri extends ElementoCatalogo {
    private String autore;
    private String genere;

    public Libri(int codiceISBN, String titolo, int annoDiPubblicazione, int numPagine, String autore, String genere) {
        super(codiceISBN, titolo, annoDiPubblicazione, numPagine);
        this.autore = autore;
        this.genere = genere;

    }


    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        ", Autore:" + autore +
                        ", Genere:" + genere
                ;
    }



}
