Feature: Generation de ticket de cinema
  Outil de génération de ticket de seance pour les cinema

  Scenario: Recuperation d'un ticket de cinema en fonction d'un numero de seance
    When L'utilisateur donne un numero de seance au generateur de ticket.
    Then On lui retourne un text contenant le numero de seance.
    Then On lui retourne un text contenant le titre du film.
    Then On lui retourne un text contenant la date et l'heure du film.
    Then On lui retourne un text contenant le cinema ou le film est projete.

