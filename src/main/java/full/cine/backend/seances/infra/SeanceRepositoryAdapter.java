package full.cine.backend.seances.infra;

import full.cine.backend.seances.models.Seance;

import java.util.List;

public class SeanceRepositoryAdapter implements SeanceRepository{

    private MongoDBSeanceRepository repository;

    public SeanceRepositoryAdapter(MongoDBSeanceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Seance sauvegaderSeance(Seance seance) {
        return this.repository.save(seance);
    }

    @Override
    public List<Seance> recupererToutesLesSeances() {
        return this.repository.findAll();
    }

}
