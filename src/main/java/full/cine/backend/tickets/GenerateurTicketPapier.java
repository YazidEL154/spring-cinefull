package full.cine.backend.tickets;

import full.cine.backend.films.Film;
import full.cine.backend.seances.GestionnaireDeSeanceClient;
import full.cine.backend.seances.Seance;

public class GenerateurTicketPapier implements GenerateurTicket{

    private GestionnaireDeSeanceClient gestionnaireDeSeanceClient;

    public GenerateurTicketPapier(GestionnaireDeSeanceClient gestionnaireDeSeanceClient) {
        this.gestionnaireDeSeanceClient = gestionnaireDeSeanceClient;
    }

    @Override
    public TicketDeCinema genererUnTicket(String numeroSeance) {
        Seance seance = gestionnaireDeSeanceClient.retournerSeanceParNumero(numeroSeance);
        Film film = seance.getFilm();
        String message = creationDuMessage(numeroSeance, film.getTitre(), seance.getDebut().toString());
        return new TicketDeCinemaPapier(message);
    }

    private String creationDuMessage(String numeroSeance, String titreFilm, String date){
        return  "numero de seance: "+numeroSeance+
                "\nTitre du film: "+titreFilm+
                "\ndate: "+date;
    }
}
