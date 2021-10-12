package full.cine.backend.seances;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireDeSeanceBasique implements GestionnaireDeSeance {

    private SeanceRepository repository;

    public GestionnaireDeSeanceBasique(SeanceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Seance ajouterUneSeance(Seance seance) {
        this.repository.sauvegaderSeance(seance);
        return seance;
    }

    @Override
    public void supprimerUneSeance(String numeroSeance) {

    }

    @Override
    public double calculerTauxRemplissage(String numeroSeance) {
        return 0;
    }

    @Override
    public List<Seance> retournerListeSeance() {
        return repository.recupererToutesLesSeances();
    }

    @Override
    public double connaitrePrixSeance(String numeroSeance) {
        return 0;
    }

    @Override
    public Seance retournerSeanceParNumero(String numeroSeance) {
        return null;
    }

    @Override
    public List<Seance> retourneSeanceFiltreParFilm(String numeroFilm) {
        return null;
    }
}
