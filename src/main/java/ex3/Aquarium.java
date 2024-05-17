package ex3;
import java.util.ArrayList;
import java.util.List;

/**
 * Gère la section des aquariums dans le zoo.
 */
public class Aquarium {
    private List<String> types = new ArrayList<>();
    private List<String> noms = new ArrayList<>();
    private List<String> comportements = new ArrayList<>();
    
    /**
     * Ajoute un animal à l'aquarium.
     * @param typeAnimal Type de l'animal.
     * @param nomAnimal Nom de l'animal.
     * @param comportement Comportement alimentaire de l'animal.
     */
    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }
    
    /**
     * Affiche la liste des animaux présents dans l'aquarium.
     */
    public void afficherListeAnimaux(){
        for (int i = 0; i < noms.size(); i++) {
            System.out.println(noms.get(i) + " - " + types.get(i) + " - " + comportements.get(i));
        }
    }
    
    /**
     * Calcule la quantité de nourriture nécessaire par jour pour tous les animaux.
     * @return Quantité de nourriture en kilogrammes.
     */
    public double calculerKgsNourritureParJour(){
        return noms.size() * 0.2;
    }
}
