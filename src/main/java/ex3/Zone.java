package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe générique représentant une zone dans le zoo.
 */
public abstract class Zone {
    private List<Animal> animaux = new ArrayList<>();

    /**
     * Ajoute un animal à la zone.
     * @param animal Animal à ajouter
     */
    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux présents dans la zone.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour tous les animaux de la zone.
     * @return Quantité de nourriture en kilogrammes
     */
    public abstract double calculerKgsNourritureParJour();

    protected List<Animal> getAnimaux() {
        return animaux;
    }
}
