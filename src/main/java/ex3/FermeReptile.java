package ex3;
import java.util.ArrayList;
import java.util.List;

/**
 * Gère la ferme de reptiles dans le zoo.
 */
public class FermeReptile {
    private List<String> types = new ArrayList<>();
    private List<String> noms = new ArrayList<>();
    private List<String> comportements = new ArrayList<>();

    /**
     * Ajoute un reptile à la ferme.
     * @param typeAnimal Type du reptile.
     * @param nomAnimal Nom du reptile.
     * @param comportement Comportement alimentaire du reptile.
     */
    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    /**
     * Affiche la liste des reptiles présents dans la ferme.
     */
    public void afficherListeAnimaux(){
        for (int i = 0; i < noms.size(); i++) {
            System.out.println(noms.get(i) + " - " + types.get(i) + " - " + comportements.get(i));
        }
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour tous les reptiles.
     * @return Quantité de nourriture en kilogrammes.
     */
    public double calculerKgsNourritureParJour(){
        return noms.size() * 0.1;
    }
}
