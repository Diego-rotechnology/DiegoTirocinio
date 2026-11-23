package it.diego.libreria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

// Rappresenta la tabella libro del database.
@Entity
@Table(name = "libro")
public class Libro {

    // L'ID viene generato automaticamente dal database.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String titolo;

    // Può essere null se la data di pubblicazione non è conosciuta.
    @Column(name = "data_pubblicazione")
    private LocalDate dataPubblicazione;

    // Definisce una relazione molti-a-uno: più libri possono appartenere allo
    // stesso genere.
    @ManyToOne
    @JoinColumn(name = "id_genere")
    private Genere genere;

    // Consente al Service di impostare il titolo del libro.
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    // Consente al Service di leggere il titolo del libro.
    public String getTitolo() {
        return titolo;
    }

    // Consente al Service di impostare la data di pubblicazione.
    public void setDataPubblicazione(LocalDate dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    // Consente al Service di leggere la data di pubblicazione.
    public LocalDate getDataPubblicazione() {
        return dataPubblicazione;
    }

    // Consente al Service di associare un genere al libro.
    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    // Consente al Service di leggere il genere associato al libro.
    public Genere getGenere() {
        return genere;
    }

    // Consente al Service di leggere l'ID del libro.
    // L'ID viene generato automaticamente dal database tramite
    // GenerationType.IDENTITY.
    // Non prevediamo un setter perché non dobbiamo assegnarlo manualmente.
    public Integer getId() {
        return id;
    }
}
