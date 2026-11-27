package it.diego.libreria.service;

import org.springframework.stereotype.Service;
import it.diego.libreria.repository.LibroRepository;
import java.util.List;
import it.diego.libreria.entity.Libro;
import java.util.Optional;
import it.diego.libreria.exception.LibroNonTrovatoException;
import it.diego.libreria.dto.LibroResponseDTO;
import java.util.ArrayList;

// Gestisce la logica applicativa relativa ai libri.
@Service
public class LibroService {

    // Repository necessario per recuperare i dati dei libri.
    private final LibroRepository libroRepository;

    // Constructor injection: riceve il Repository e inizializza il campo.
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    // Recupera tutti i libri e li converte in DTO.
    public List<LibroResponseDTO> getAllLibri() {

        List<Libro> libri = libroRepository.findAll();

        List<LibroResponseDTO> libriDTO = new ArrayList<>();

        for (Libro libro : libri) {
            libriDTO.add(convertiInDTO(libro));
        }

        return libriDTO;
    }

// Recupera un singolo libro tramite il suo ID e lo converte in DTO.
public LibroResponseDTO getLibroById(Integer id) {

    // Cerca il libro tramite il suo ID.
    Optional<Libro> libro = libroRepository.findById(id);

    if (libro.isPresent()) {
        return convertiInDTO(libro.get());
    } else {
        throw new LibroNonTrovatoException("Libro non trovato");
    }
}

    // Converte un libro Entity nel corrispondente DTO.
    private LibroResponseDTO convertiInDTO(Libro libro) {
        return new LibroResponseDTO(
                libro.getId(),
                libro.getTitolo(),
                libro.getDataPubblicazione(),
                libro.getGenere().getNome());
    }
}