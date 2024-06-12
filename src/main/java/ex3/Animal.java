package ex3;

/**
 * Représente un animal avec son type, son nom et son comportement alimentaire.
 */
public class Animal {
    private String type;
    private String nom;
    private String comportement;

    public Animal(String type, String nom, String comportement) {
        this.type = type;
        this.nom = nom;
        this.comportement = comportement;
    }

    public String getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }

    public String getComportement() {
        return comportement;
    }

    @Override
    public String toString() {
        return nom + " - " + type + " - " + comportement;
    }
}
