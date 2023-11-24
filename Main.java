package org.elmaghrani;

public class Main {
    public static void main(String[] args) {
        // Création de formes individuelles
        Carre carre1 = new Carre();
        Carre carre2 = new Carre();

        // Création d'un composite et ajout de formes
        Groupe groupe = new Groupe();
        groupe.ajouterForme(carre1);
        groupe.ajouterForme(carre2);

        // Création d'une autre forme
        Carre carre3 = new Carre();

        // Ajout de la forme au composite principal
        groupe.ajouterForme(carre3);

        // Appel de la fonctionnalité du composite (affiche les formes)
        groupe.dessiner();    }
}