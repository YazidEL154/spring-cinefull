package full.cine.backend.tickets;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Lors de la creation d'un ticket de cinema, Quand on donne un numero de seance")
class GenerateurTicketPapierTest {

    // GIVEN
    GenerateurTicket generateurTicket = new GenerateurTicketPapier(new FakeGestionnaireSeanceClient());

    @Test
    @DisplayName("alors le ticket retourne un String")
    public void testGenerationTicketPapierestString(){
        // WHEN
        String numeroSeance = "TEST1234";
        TicketDeCinema ticket = generateurTicket.genererUnTicket(numeroSeance);

        // THEN
        assertTrue(ticket.getTicket() instanceof String);
    }

    @Test
    @DisplayName("alors le ticket retourne un String contenant le numero de la seance")
    public void testGenerationTicketPapierContientNumeroSeance(){
        // WHEN
        String numeroSeance = "TEST1234";
        TicketDeCinema ticket = generateurTicket.genererUnTicket(numeroSeance);
        String stringTicket = ticket.getTicket().toString();
        // THEN
        assertTrue(stringTicket.contains(numeroSeance));
    }

    @Test
    @DisplayName("alors le ticket retourne un String contenant le titre du film")
    public void testGenerationTicketPapierContientTitreFilm(){
        // WHEN
        String numeroSeance = "TEST1234";
        TicketDeCinema ticket = generateurTicket.genererUnTicket(numeroSeance);
        String stringTicket = ticket.getTicket().toString();
        // THEN
        assertTrue(stringTicket.contains("L'histoire d'un test"));
    }

}