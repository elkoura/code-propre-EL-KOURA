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
        Animal animal = new Animal(typeAnimal, nomAnimal, comportement);
        switch (typeAnimal) {
            case "MAMMIFERE":
                if ("CARNIVORE".equals(comportement)) {
                    zoneCarnivore.addAnimal(animal);
                } else if ("HERBIVORE".equals(comportement)) {
                    savaneAfricaine.addAnimal(animal);
                }
                break;
            case "REPTILE":
                fermeReptile.addAnimal(animal);
                break;
            case "POISSON":
                aquarium.addAnimal(animal);
                break;
        }
    }

    /**
     * Affiche la liste de tous les animaux présents dans le zoo, organisée par zone.
     */
    public void afficherListeAnimaux() {
        System.out.println("Savane Africaine:");
        savaneAfricaine.afficherListeAnimaux();
        System.out.println("\nZone Carnivore:");
        zoneCarnivore.afficherListeAnimaux();
        System.out.println("\nFerme Reptile:");
        fermeReptile.afficherListeAnimaux();
        System.out.println("\nAquarium:");
        aquarium.afficherListeAnimaux();
    }
}
