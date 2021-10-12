package full.cine.backend.tickets;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TicketDeCinemaPapier implements TicketDeCinema{
    private String ticket;
}
