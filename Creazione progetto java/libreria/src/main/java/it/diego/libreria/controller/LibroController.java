package it.diego.libreria.controller;

import it.diego.libreria.service.LibroService;
import org.springframework.web.bind.annotation.RestController;
import it.diego.libreria.entity.Libro;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Gestisce le richieste HTTP relative ai libri.
@RestController
// Definisce il percorso comune agli endpoint di questo Controller.
@RequestMapping("/libri")
public class LibroController {

    // Service necessario per gestire le operazioni sui libri.
    private final LibroService libroService;

    // Constructor injection: riceve il Service e inizializza il campo.
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    // Gestisce la richiesta GET per recuperare tutti i libri.
    @GetMapping
    public List<Libro> getAllLibri() {
        return libroService.getAllLibri();
    }

    // Recupera un singolo libro tramite il suo ID.
    @GetMapping("/{id}")
    public Libro getLibroById(@PathVariable Integer id) {
        return libroService.getLibroById(id);
    }
}