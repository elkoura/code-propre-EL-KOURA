package ex3;

/**
 * Gère la zone de la savane africaine dans le zoo.
 */
public class SavaneAfricaine extends Zone {

    @Override
    public double calculerKgsNourritureParJour() {
        return getAnimaux().size() * 10;
    }
}
