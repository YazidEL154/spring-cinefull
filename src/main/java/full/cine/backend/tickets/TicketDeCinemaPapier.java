package full.cine.backend.tickets;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class TicketDeCinemaPapier implements TicketDeCinema{
    private String ticket;

    @Override
    public String getTicket() {
        return ticket;
    }

}
