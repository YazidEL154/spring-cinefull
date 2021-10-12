package full.cine.backend.films;

import java.util.List;

/**
 * Liste des spécifications pour la gestion des films.
 */
public interface GestionnaireDeFilm {

    /**
     * Retourne la liste de tout les films
     * @return la liste des films
     */
    List<Film> retournerListeFilm();

    /**
     * Ajoute un film a la liste des film disponibles.
     * @param film a ajouter.
     * @return le film au format sauvegardé.
     */
    Film ajouterUnFilm(Film film);

    /**
     * Supprimer un filme de la liste des films disponibles.
     * @param numeroFilm numero du film a supprimer.
     */
    void supprimerUnFilm(String numeroFilm);

}
