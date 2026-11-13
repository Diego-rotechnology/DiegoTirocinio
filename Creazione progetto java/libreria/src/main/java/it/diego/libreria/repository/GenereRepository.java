package it.diego.libreria.repository;

import it.diego.libreria.entity.Genere;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface GenereRepository extends JpaRepository<Genere, Integer> {

Optional<Genere> findByNome(String nome);
}
