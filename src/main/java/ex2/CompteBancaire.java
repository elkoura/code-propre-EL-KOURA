package ex2;

/**
 * Classe abstraite pour généraliser les comportements des comptes bancaires.
 */
public abstract class CompteBancaire {
    protected double solde;

    /**
     * Ajoute un montant au solde.
     * @param montant Montant à ajouter
     */
    public void ajouterMontant(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            throw new IllegalArgumentException("Le montant à ajouter doit être positif.");
        }
    }

    /**
     * Débite un montant du solde.
     * @param montant Montant à débiter
     */
    public abstract void debiterMontant(double montant);

    /**
     * Obtient le solde actuel du compte.
     * @return Le solde actuel
     */
    public double getSolde() {
        return solde;
    }
}
