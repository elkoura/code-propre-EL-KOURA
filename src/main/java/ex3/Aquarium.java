package ex3;

/**
 * Gère la section des aquariums dans le zoo.
 */
public class Aquarium extends Zone {

    @Override
    public double calculerKgsNourritureParJour() {
        return getAnimaux().size() * 0.2;
    }
}
