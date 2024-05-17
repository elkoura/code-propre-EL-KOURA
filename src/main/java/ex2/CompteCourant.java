package ex2;





/**
 * Classe représentant un Livret A, ne permettant pas le découvert.
 */
public class CompteCourant extends CompteBancaire {
    private double decouvert;

    public CompteCourant(double soldeInitial, double decouvertAutorise) {
        this.solde = soldeInitial;
        this.decouvert = decouvertAutorise;
    }

    @Override
    public void debiterMontant(double montant) {
        if (solde - montant >= -decouvert) {
            solde -= montant;
        }
    }
}
