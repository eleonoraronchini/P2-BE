package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Archivio {
    static Scanner scanner = new Scanner(System.in);
    static Set<Libri> listaLibri = new HashSet<Libri>();


    public static void addContenutoLibro() {


        // Dati di esempio per creare un libro
        System.out.println("Inserisci il titolo del libro:");
        String titoloAdd = scanner.nextLine();

        System.out.println("Inserisci codice ISBN del libro");
        int codiceISBNAdd = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci l'autore del libro:");
        String autoreAdd = scanner.nextLine();

        System.out.println("Inserisci il genere del libro:");
        String genereAdd = scanner.nextLine();

        System.out.println("Inserisci l'anno di pubblicazione del libro:");
        int annoDiPubblicazioneAdd = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci il numero di pagine del libro:");
        int numPagineAdd = Integer.parseInt(scanner.nextLine());

        Libri libroaggiunto = new Libri(codiceISBNAdd, titoloAdd, annoDiPubblicazioneAdd, numPagineAdd, autoreAdd, genereAdd);


        if (listaLibri.stream().anyMatch(libro -> libro.getCodiceISBN() == libroaggiunto.getCodiceISBN())) {
            System.out.println("Libro con questo codice ISBN già presente nel catalogo!");
        } else {
            listaLibri.add(libroaggiunto);
            System.out.println("Libro aggiunto al catalogo con successo!");
        }

        System.out.println("Catalogo libri: " + listaLibri);


    }

    static Set<Rivista> listaRiviste = new HashSet<Rivista>();

    public static void addContenutoRivista() {

        Scanner scanner = new Scanner(System.in);
        // Dati di esempio per creare un libro
        System.out.println("Inserisci il titolo della rivista:");
        String titoloAdd = scanner.nextLine();

        System.out.println("Inserisci codice ISBN delLa rivista");
        int codiceISBNAdd = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci l'anno di pubblicazione della rivista:");
        int annoDiPubblicazioneAdd = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci il numero di pagine della rivista:");
        int numPagineAdd = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci con quale periodicità viene pubblicata la rivista (settimanale, mensile, semestrale):");
        Periodicità periodicitaInput = Periodicità.valueOf(scanner.nextLine());


        Rivista rivistaAggiunta = new Rivista(codiceISBNAdd, titoloAdd, annoDiPubblicazioneAdd, numPagineAdd, periodicitaInput);

        if (listaRiviste.stream().anyMatch(r -> r.getCodiceISBN() == rivistaAggiunta.getCodiceISBN())) {
            System.out.println("Libro con questo codice ISBN già presente nel catalogo!");
        } else {
            listaRiviste.add(rivistaAggiunta);
            System.out.println("Rivista aggiunta al catalogo con successo!");
        }

        System.out.println("Catalogo riviste: " + listaRiviste);


    }


    public static void removeContenutoLibroByISBN() {
        System.out.println("Inserisci codice ISBN del libro che vuoi rimuovere dal catalogo");
        int codiceISBNAdd = Integer.parseInt(scanner.nextLine());
        Optional<Libri> libroDaRimuovere = listaLibri.stream().filter(l -> l.getCodiceISBN() == codiceISBNAdd).findFirst();
        if (libroDaRimuovere.isPresent()) {
            listaLibri.remove(libroDaRimuovere.get());
            System.out.println("Libro con codice ISBN: " + codiceISBNAdd + " rimosso dal catalogo con successo!");
            System.out.println("Catalogo libri: " + listaLibri);
        } else {
            System.out.println("Libro con questo codice ISBN non presente nel catalogo!");
        }
        ;
    }

    public static void removeContenutoRivistaByISBN() {
        System.out.println("Inserisci codice ISBN della rivista che vuoi eliminare dal catalogo");
        int codiceISBNAdd = Integer.parseInt(scanner.nextLine());
        Optional<Rivista> rivistaDaRimuovere = listaRiviste.stream().filter(r -> r.getCodiceISBN() == codiceISBNAdd).findFirst();
        if (rivistaDaRimuovere.isPresent()) {
            listaRiviste.remove(rivistaDaRimuovere.get());
            System.out.println("La rivista con il codice ISBN: " + codiceISBNAdd + " è stata rimossa dal catalogo");
            System.out.print("Catalogo riviste: " + listaRiviste);
        } else {
            System.out.println("La rivista con il seguente codice ISBN: " + codiceISBNAdd + "non è presente all'interno del catalogo!");

        }
    }

    public static void searchRivistaByYear() {
        List<Rivista> RivisteFiltrateperAnno = new ArrayList<Rivista>();
        System.out.println("Inserisci l'anno di pubblicazione della rivista da cercare:");
        int annoDiPubblicazioneAdd = Integer.parseInt(scanner.nextLine());
        RivisteFiltrateperAnno = listaRiviste.stream().filter(r -> r.getAnnoDiPubblicazione() == annoDiPubblicazioneAdd).collect(Collectors.toList());
        if (RivisteFiltrateperAnno.isEmpty()) {
            System.out.println("Nessuna rivista trovata nel catalogo!");

        } else { System.out.println("Il risultato della ricerca è: " + RivisteFiltrateperAnno);
        }
    }
    public static void searchLibriByYear() {
        List<Libri> LibriFiltratiperAnno = new ArrayList<Libri>();
        System.out.println("Inserisci l'anno di pubblicazione del libro da cercare:");
        int annoDiPubblicazioneAdd = Integer.parseInt(scanner.nextLine());
        LibriFiltratiperAnno = listaLibri.stream().filter(l -> l.getAnnoDiPubblicazione() == annoDiPubblicazioneAdd).collect(Collectors.toList());
        if (LibriFiltratiperAnno.isEmpty()) {
            System.out.println("Nessun libro trovato nel catalogo!");

        } else { System.out.println("Il risultato della ricerca è: " + LibriFiltratiperAnno);
        }
    }
    public static void searchLibriByAuthor() {
        List<Libri> LibriFiltratiperAutore = new ArrayList<Libri>();
        System.out.println("Inserisci l'autore del libro da cercare:");
        String autoreAdd = scanner.nextLine();
        LibriFiltratiperAutore = listaLibri.stream().filter(l -> l.getAutore().equals(autoreAdd)).collect(Collectors.toList());
        if (LibriFiltratiperAutore.isEmpty()) {
            System.out.println("Nessun libro trovato nel catalogo!");

        } else { System.out.println("Il risultato della ricerca è: " + LibriFiltratiperAutore);
        }
    }

}


