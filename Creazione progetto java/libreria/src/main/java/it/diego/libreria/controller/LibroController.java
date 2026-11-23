package it.diego.libreria.controller;

import it.diego.libreria.service.LibroService;
import org.springframework.web.bind.annotation.RestController;
import it.diego.libreria.entity.Libro;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

// Gestisce le richieste HTTP relative ai libri.
@RestController
public class LibroController {

    // Service necessario per gestire le operazioni sui libri.
    private final LibroService libroService;

    // Constructor injection: riceve il Service e inizializza il campo.
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    // Gestisce la richiesta HTTP GET per recuperare tutti i libri.
    @GetMapping("/libri")
    public List<Libro> getAllLibri() {
        return libroService.getAllLibri();
    }
}