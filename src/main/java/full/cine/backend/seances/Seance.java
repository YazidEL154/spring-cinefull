package full.cine.backend.seances;

import full.cine.backend.films.Film;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Seance de cinema pour un film donné.
 */
@AllArgsConstructor
@NoArgsConstructor
public class Seance {

    @Getter @Setter
    private String numero;
    @Getter @Setter
    private LocalDateTime debut;
    @Getter @Setter
    private Film film;
    @Getter @Setter
    private Cinema cinema;
    @Getter @Setter
    private double prix;

}
