package tn.esprit.livrems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.livrems.entity.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {
}
