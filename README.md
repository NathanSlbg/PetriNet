#Petrinet

##Lancer le code

Pour executer le code il faut utiliser la classe main qui contient un exemple d'utilisation du réseau de Pétri.

##Lancer les tests

Pour lancer un test : selectionnez une classe, Run as, JUnit test

## Changements entre l'implémentation et le modèle de conception

Edge_in : ajout d'une variable place et de la méthode Affichage  
Edge_out : ajout d'une variable place et de la méthode Affichage  
Place : ajout des méthodes get et add (permet d'ajouter les jetons nécessaires suite à un step).  
Transition : ajout des variables qui sont des listes qui stockets les arcs entrants et sortants 
ainsi que les getters associés. De plus, on a créé ajouter_in et ajouter_out qui permettent d'ajouter les arcs aux listes.  
Petrinet : la classe permet de stocker tous les éléments du petrinet.


