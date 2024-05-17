package ex3;
import java.util.ArrayList;
import java.util.List;

/**
 * Gère la zone des carnivores dans le zoo.
 */
public class ZoneCarnivore {
    private List<String> types = new ArrayList<>();
    private List<String> noms = new ArrayList<>();
    private List<String> comportements = new ArrayList<>();

    /**
     * Ajoute un carnivore à la zone.
     * @param typeAnimal Type du carnivore.
     * @param nomAnimal Nom du carnivore.
     * @param comportement Comportement alimentaire du carnivore.
     */
    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    /**
     * Affiche la liste des carnivores présents dans la zone.
     */
    public void afficherListeAnimaux(){
        for (int i = 0; i < noms.size(); i++) {
            System.out.println(noms.get(i) + " - " + types.get(i) + " - " + comportements.get(i));
        }
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour tous les carnivores.
     * @return Quantité de nourriture en kilogrammes.
     */
    public double calculerKgsNourritureParJour(){
        return noms.size() * 10;  // Assuming each carnivore requires 10kg of food per day
    }
}
