package it.diego.libreria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Rappresenta la tabella genere del database.
@Entity
@Table(name = "genere")
public class Genere {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Identifica il nome del genere letterario.
    private String nome;

    // Consente al Service di impostare il nome del genere.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Consente al Service di leggere il nome del genere.
    public String getNome() {
        return nome;
    }

    // Consente al Service di leggere l'ID del genere.
    // L'ID viene generato automaticamente tramite GenerationType.IDENTITY.
    // Non prevediamo un setter perché non dobbiamo assegnarlo manualmente.
    public Integer getId() {
        return id;
    }


}
