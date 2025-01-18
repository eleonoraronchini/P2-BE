package org.example;


import static org.example.Archivio.*;

public class Main {
    public static void main(String[] args) {
      /*  addContenutoLibro();
        addContenutoLibro();
        removeContenutoLibroByISBN();
        searchLibriByYear();
        searchLibriByAuthor(); */

       addContenutoRivista();
       addContenutoRivista();
       removeContenutoRivistaByISBN();
       searchRivistaByYear();

       statisticheDelCatalogo();
       updateElementoCatalogoByISBN();

        try {
            searchElementoCatalogoBYISBN();
        } catch (ISBNNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
