package it.diego.libreria.service;

import org.springframework.stereotype.Service;
import it.diego.libreria.repository.LibroRepository;
import java.util.List;
import it.diego.libreria.entity.Libro;

// Gestisce la logica applicativa relativa ai libri.
@Service
public class LibroService {

    // Repository necessario per recuperare i dati dei libri.
    private final LibroRepository libroRepository;

    // Constructor injection: riceve il Repository e inizializza il campo.
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    // Recupera tutti i libri attraverso il Repository.
    public List<Libro> getAllLibri() {
        return libroRepository.findAll();
    }
}