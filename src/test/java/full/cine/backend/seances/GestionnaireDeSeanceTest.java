package full.cine.backend.seances;

import full.cine.backend.seances.models.Seance;
import full.cine.backend.seances.services.GestionnaireDeSeance;
import full.cine.backend.seances.services.GestionnaireDeSeanceBasique;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pour la gestion des seances")
class GestionnaireDeSeanceTest {

    static FakeSeanceRepository repository = new FakeSeanceRepository();
    static GestionnaireDeSeance gestionnaireDeSeance = new GestionnaireDeSeanceBasique(repository);
    static List<Seance> seances = gestionnaireDeSeance.retournerListeSeance();
    static Seance seanceDeTest = new Seance();

    @BeforeAll
    static void before(){
        repository.sauvegaderSeance(seanceDeTest);
    }


    @Test
    @DisplayName("Je peux recuperer l'ensemble des seances sous forme de liste")
    public void recupererLesSeances(){
        assertTrue(seances instanceof List);
    }

    @Test
    @DisplayName("Je peux sauvegarder une nouvelle seance")
    public void sauvegarderUneSeance(){
        Seance nouvelleSeance = gestionnaireDeSeance.ajouterUneSeance(new Seance());
        assertNotNull(nouvelleSeance);
        assertTrue(repository.existe(nouvelleSeance));
    }

    @Test
    @DisplayName("Je peux recuperer l'ensemble des seances sous forme de liste contenant les seances precedement enregistres")
    public void recupererLesSeancesEnregistre(){
        assertTrue(seances.contains(seanceDeTest));
    }

}