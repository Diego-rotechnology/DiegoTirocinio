package it.diego.libreria.dto;

import java.time.LocalDate;

// DTO utilizzato per trasferire al client i dati del libro.
public class LibroResponseDTO {

    // Contiene il nome del genere, non l'intero oggetto Genere
    private Integer id;
    private String titolo;
    private LocalDate dataPubblicazione;
    private String genere;

    // Costruisce il DTO assegnando i dati ricevuti ai suoi attributi.
    public LibroResponseDTO(Integer id, String titolo, LocalDate dataPubblicazione, String genere) {
        this.id = id;
        this.titolo = titolo;
        this.dataPubblicazione = dataPubblicazione;
        this.genere = genere;

    }

    public Integer getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getDataPubblicazione() {
        return dataPubblicazione;
    }

    public String getGenere() {
        return genere;
    }

}
