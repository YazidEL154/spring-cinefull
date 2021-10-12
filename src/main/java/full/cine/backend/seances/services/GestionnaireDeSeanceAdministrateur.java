package full.cine.backend.seances.services;

import full.cine.backend.seances.models.Seance;

/**
 * Liste des spécifications pour la gestion des seances du point de vue d'un administrateur.
 */
public interface GestionnaireDeSeanceAdministrateur {
    /**
     * Ajoute une seance a la liste des seances disponibles.
     *
     * @param seance a ajouter.
     * @return la seance au format sauvegardé.
     */
    Seance ajouterUneSeance(Seance seance);

    /**
     * Supprime une seance de la liste des seances disponibles.
     *
     * @param numeroSeance de la seance a supprimer.
     */
    void supprimerUneSeance(String numeroSeance);

    /**
     * Retourne le taux de remplissage d'une seance.
     *
     * @param numeroSeance numero de la seance en question.
     * @return valeur entre 0 et 1 représentant le taux de remplissage
     * en fonction du nombre de place..
     */
    double calculerTauxRemplissage(String numeroSeance);
}
