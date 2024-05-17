package ex2;

/**
 * Classe abstraite pour généraliser les comportements des comptes bancaires.
 */
public abstract class CompteBancaire {
    protected double solde;

    /**
     * Ajoute un montant au solde.
     * @param montant montant à ajouter
     */
    public void ajouterMontant(double montant) {
        solde += montant;
    }

    /**
     * Débite un montant du solde.
     * @param montant montant à débiter
     */
    public abstract void debiterMontant(double montant);
}
