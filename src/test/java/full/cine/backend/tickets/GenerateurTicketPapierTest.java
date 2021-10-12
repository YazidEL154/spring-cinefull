package full.cine.backend.tickets;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Lors de la creation d'un ticket de cinema, Quand on donne un numero de seance")
class GenerateurTicketPapierTest {

    // GIVEN
    String titre = "L'histoire d'un test";
    LocalDateTime date = LocalDateTime.now();
    GenerateurTicket generateurTicket = new GenerateurTicketPapier(new FakeGestionnaireSeanceClient(titre, date));
    String numeroSeance = "TEST1234";
    TicketDeCinema ticket = generateurTicket.genererUnTicket(numeroSeance);
    String stringTicket = ticket.getTicket().toString();

    @Test
    @DisplayName("alors le ticket retourne un String")
    public void testGenerationTicketPapierestString(){
        assertTrue(ticket.getTicket() instanceof String);
    }

    @Test
    @DisplayName("alors le ticket retourne un message contenant le numero de la seance")
    public void testGenerationTicketPapierContientNumeroSeance(){
        assertTrue(stringTicket.contains(numeroSeance));
    }

    @Test
    @DisplayName("alors le ticket retourne un message contenant le titre du film")
    public void testGenerationTicketPapierContientTitreFilm(){
        assertTrue(stringTicket.contains(titre));
    }

    @Test
    @DisplayName("alors le ticket retourne un message contenant l'heure et la date du film")
    public void testGenerationTicketPapierContientHeureETDate(){
        assertTrue(stringTicket.contains(date.toString()));
    }
}