package full.cine.backend.tickets;

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
        String ticket = "Ticket de cinema !!!\n" +
                "Film             : " + seance.getFilm().getTitre() +
                "numero de seance : " + seance.getNumero();
        return new TicketDeCinemaPapier(ticket);
    }
}
