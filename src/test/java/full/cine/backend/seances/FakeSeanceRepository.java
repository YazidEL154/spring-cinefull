package full.cine.backend.seances;

import full.cine.backend.seances.infra.SeanceRepository;
import full.cine.backend.seances.models.Seance;

import java.util.ArrayList;
import java.util.List;

public class FakeSeanceRepository implements SeanceRepository {

    List<Seance> seances = new ArrayList<>();

    @Override
    public Seance sauvegaderSeance(Seance seance) {
        seances.add(seance);
        return seance;
    }

    public boolean existe(Seance seance){
        return seances.contains(seance);
    }

    @Override
    public List<Seance> recupererToutesLesSeances() {
        return seances;
    }
}
