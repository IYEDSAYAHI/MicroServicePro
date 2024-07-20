package tn.esprit.empreintems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.empreintems.entity.Empreinte;

public interface EmpreinteRepository extends MongoRepository<Empreinte, String> {
}
