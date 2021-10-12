package full.cine.backend.seances;

import java.util.List;

public interface SeanceRepository {

    public Seance sauvegaderSeance(Seance seance);

    public List<Seance> recupererToutesLesSeances();
}
