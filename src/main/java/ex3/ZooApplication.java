package ex3;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        // Ajout d'animaux au zoo
        zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
        zoo.addAnimal("Zèbre", "MAMMIFERE", "HERBIVORE");
        zoo.addAnimal("Lion", "MAMMIFERE", "CARNIVORE");
        zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
        zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");  // Correction: Un requin blanc est carnivore
        zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
        zoo.addAnimal("Boa constrictor", "REPTILE", "CARNIVORE");
        zoo.addAnimal("Python", "REPTILE", "CARNIVORE");

        // Affichage de tous les animaux du zoo
        zoo.afficherListeAnimaux();
    }
}
