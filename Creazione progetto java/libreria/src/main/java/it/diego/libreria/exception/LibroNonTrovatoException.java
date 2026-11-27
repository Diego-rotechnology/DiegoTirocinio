package it.diego.libreria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Eccezione personalizzata quando un libro non viene trovato.
@ResponseStatus(HttpStatus.NOT_FOUND)
public class LibroNonTrovatoException extends RuntimeException {

    // Costruttore che riceve il messaggio dell'eccezione.
    public LibroNonTrovatoException(String message) {
        super(message);
    }
}
