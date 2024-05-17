package ex3;
import java.util.ArrayList;
import java.util.List;

/**
 * Gère la zone de la savane africaine dans le zoo.
 */
public class SavaneAfricaine {
    private List<String> types = new ArrayList<>();
    private List<String> noms = new ArrayList<>();
    private List<String> comportements = new ArrayList<>();

    /**
     * Ajoute un mammifère à la savane africaine.
     * @param typeAnimal Type du mammifère.
     * @param nomAnimal Nom du mammifère.
     * @param comportement Comportement alimentaire du mammifère.
     */
    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    /**
     * Affiche la liste des mammifères présents dans la savane africaine.
     */
    public void afficherListeAnimaux(){
        for (int i = 0; i < noms.size(); i++) {
            System.out.println(noms.get(i) + " - " + types.get(i) + " - " + comportements.get(i));
        }
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour tous les mammifères.
     * @return Quantité de nourriture en kilogrammes.
     */
    public double calculerKgsNourritureParJour(){
        return noms.size() * 10;  // Assuming each mammal requires 10kg of food per day
    }
}
