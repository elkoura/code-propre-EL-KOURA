package ex2;

/**
 * Classe représentant un compte courant permettant le découvert.
 */
public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    /**
     * Constructeur de la classe CompteCourant.
     * @param soldeInitial Solde initial du compte
     * @param decouvertAutorise Montant de découvert autorisé
     */
    public CompteCourant(double soldeInitial, double decouvertAutorise) {
        this.solde = soldeInitial;
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void debiterMontant(double montant) {
        if (montant > 0) {
            if (solde - montant >= -decouvertAutorise) {
                solde -= montant;
            } else {
                throw new IllegalArgumentException("Montant dépasse le découvert autorisé.");
            }
        } else {
            throw new IllegalArgumentException("Le montant à débiter doit être positif.");
        }
    }
}
