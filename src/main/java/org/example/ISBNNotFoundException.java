package org.example;

public class ISBNNotFoundException extends Exception{
    public ISBNNotFoundException(int ISBN){
       super(String.valueOf(ISBN));
       System.out.println("L'elemento con il seguente codice ISBN " +ISBN+ " non è presente nel catalogo");

    }
}
