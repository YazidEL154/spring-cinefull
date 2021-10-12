package full.cine.backend.seances.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class SeanceDocument extends Seance {
    @Id
    private String numero;
}
