package full.cine.backend.seances;

import java.util.List;

/**
 * Liste des spécifications pour la gestion des seances du point de vue d'un client.
 */
public interface GestionnaireDeSeanceClient {
    /**
     * Retourne la liste de toute les seances.
     *
     * @return
     */
    List<Seance> retournerListeSeance();

    /**
     * Retourne le prix d'une seance.
     *
     * @param numeroSeance de la seance en question.
     * @return le prix de la seance de numero numeroSeance
     */
    double connaitrePrixSeance(String numeroSeance);

    /**
     * Retoune la seance avec le numero numeroSeance si elle est dans la liste des seances disponible.
     *
     * @param numeroSeance de la seance a rechercher.
     * @return la seance en question.
     * @throws org.springframework.web.server.ResponseStatusException si la seance n'est pas disponible.
     */
    Seance retournerSeanceParNumero(String numeroSeance);

    /**
     * Retourne la liste des seance disponible pour un certain film.
     *
     * @param numeroFilm numero du film en question
     * @return list des seances du dit film.
     */
    List<Seance> retourneSeanceFiltreParFilm(String numeroFilm);
}
