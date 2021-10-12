package full.cine.backend.seances.infra;

import full.cine.backend.seances.models.Seance;

import java.util.List;

public interface SeanceRepository {

    public Seance sauvegaderSeance(Seance seance);

    public List<Seance> recupererToutesLesSeances();
}
