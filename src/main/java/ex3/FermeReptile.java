package ex3;

/**
 * Gère la ferme de reptiles dans le zoo.
 */
public class FermeReptile extends Zone {

    @Override
    public double calculerKgsNourritureParJour() {
        return getAnimaux().size() * 0.1;
    }
}
	