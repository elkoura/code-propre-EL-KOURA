package ex3;

/**
 * Gère le zoo entier, incluant toutes ses zones spécifiques.
 */
public class Zoo {

    private String nom;
    private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
    private ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
    private FermeReptile fermeReptile = new FermeReptile();
    private Aquarium aquarium = new Aquarium();

    public Zoo(String nom) {
        this.nom = nom;
    }

    /**
     * Ajoute un animal au zoo dans la zone appropriée selon son type et son régime alimentaire.
     * @param nomAnimal Nom de l'animal à ajouter.
     * @param typeAnimal Type de l'animal (Mammifère, Reptile, Poisson).
     * @param comportement Régime alimentaire de l'animal (Carnivore, Herbivore).
     */
    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        switch (typeAnimal) {
            case "MAMMIFERE":
                if ("CARNIVORE".equals(comportement)) {
                    zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
                } else if ("HERBIVORE".equals(comportement)) {
                    savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
                }
                break;
            case "REPTILE":
                fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
                break;
            case "POISSON":
                aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
                break;
        }
    }

    /**
     * Affiche la liste de tous les animaux présents dans le zoo, organisée par zone.
     */
    public void afficherListeAnimaux() {
        savaneAfricaine.afficherListeAnimaux();
        zoneCarnivore.afficherListeAnimaux();
        fermeReptile.afficherListeAnimaux();
        aquarium.afficherListeAnimaux();
    }
}
