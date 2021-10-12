package full.cine.backend.tickets;

import full.cine.backend.seances.Seance;

public interface GenerateurTicket {

    TicketDeCinema genererUnTicket(String numeroSeance);
}
