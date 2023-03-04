@tag
Feature: Authentification 
  Nous allons faire l authentification du site orange

  @tag1
  Scenario: Authentification valide 
    Given ouvrir l URL de l application    
    When saisir le login  
    And  saisir le PW 
    And cliquer sur le bouton se connecter
    Then ouverture de la page accueil