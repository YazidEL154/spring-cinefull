package full.cine.backend.seances;

import full.cine.backend.seances.models.Seance;
import full.cine.backend.seances.services.GestionnaireDeSeance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("seances")
@CrossOrigin
public class SeanceController {

    @Autowired
    public GestionnaireDeSeance gestionnaire;

    @GetMapping("")
    public List<Seance> receupereToutesLesSeances(){
        return gestionnaire.retournerListeSeance();
    }
}
