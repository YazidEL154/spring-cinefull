package full.cine.backend.seances.infra;

import full.cine.backend.seances.models.Seance;
import full.cine.backend.seances.models.SeanceDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDBSeanceRepository extends MongoRepository<Seance, String> {
}
