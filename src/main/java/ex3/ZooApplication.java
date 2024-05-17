package ex3;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        // Ajout d'animaux au zoo
        zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
        zoo.addAnimal("Zèbre", "MAMMIFERE", "HERBIVORE");
        zoo.addAnimal("Lion", "MAMMIFERE", "CARNIVORE"); // Correction: Lion est un carnivore
        zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
        zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
        zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
        zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
        zoo.addAnimal("Python", "SERPENT", "CARNIVORE");

        // Affichage de tous les animaux du zoo
        zoo.afficherListeAnimaux();
    }
}
