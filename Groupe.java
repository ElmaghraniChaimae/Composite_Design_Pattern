package org.elmaghrani;

import java.util.ArrayList;
import java.util.List;

// Composite représente un conteneur de formes géométriques
class Groupe implements Forme {
    private List<Forme> formes = new ArrayList<>();

    public void ajouterForme(Forme forme) {
        formes.add(forme);
    }

    @Override
    public void dessiner() {
        System.out.println("Dessiner un groupe :");

        // Appel de la fonctionnalité pour chaque forme
        for (Forme forme : formes) {
            forme.dessiner();
        }
    }
}

