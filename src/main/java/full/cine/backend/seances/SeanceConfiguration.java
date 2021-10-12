package full.cine.backend.seances;

import full.cine.backend.seances.infra.MongoDBSeanceRepository;
import full.cine.backend.seances.infra.SeanceRepository;
import full.cine.backend.seances.infra.SeanceRepositoryAdapter;
import full.cine.backend.seances.services.GestionnaireDeSeance;
import full.cine.backend.seances.services.GestionnaireDeSeanceBasique;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeanceConfiguration {

    @Bean
    public GestionnaireDeSeance gestionnaireDeSeance(SeanceRepository seanceRepository){
        return new GestionnaireDeSeanceBasique(seanceRepository);
    }


    @Bean
    public SeanceRepository seanceRepository(MongoDBSeanceRepository mongoDBSeanceRepository){
        return new SeanceRepositoryAdapter(mongoDBSeanceRepository);
    }
}
