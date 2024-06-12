package ex3;

/**
 * Gère la zone des carnivores dans le zoo.
 */
public class ZoneCarnivore extends Zone {

    @Override
    public double calculerKgsNourritureParJour() {
        return getAnimaux().size() * 10;
    }
}
