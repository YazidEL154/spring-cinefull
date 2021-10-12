package full.cine.backend.tickets;

import full.cine.backend.films.Film;
import full.cine.backend.seances.GestionnaireDeSeanceClient;
import full.cine.backend.seances.Seance;

import java.util.List;

public class FakeGestionnaireSeanceClient implements GestionnaireDeSeanceClient {
    @Override
    public List<Seance> retournerListeSeance() {
        return null;
    }

    @Override
    public double connaitrePrixSeance(String numeroSeance) {
        return 0;
    }

    @Override
    public Seance retournerSeanceParNumero(String numeroSeance) {
        Seance seance = new Seance();
        Film film = new Film();
        film.setTitre("L'histoire d'un test");
        seance.setNumero(numeroSeance);
        seance.setFilm(film);
        return seance;
    }

    @Override
    public List<Seance> retourneSeanceFiltreParFilm(String numeroFilm) {

        return null;
    }
}
