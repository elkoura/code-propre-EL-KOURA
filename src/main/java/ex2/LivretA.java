
package ex2;

/**
 * Classe représentant un Livret A, ne permettant pas le découvert.
 */
public class LivretA extends CompteBancaire {
    private double tauxRemuneration;

    /**
     * Constructeur de la classe LivretA.
     * @param soldeInitial Solde initial du livret A
     * @param tauxRemuneration Taux de rémunération annuel
     */
    public LivretA(double soldeInitial, double tauxRemuneration) {
        this.solde = soldeInitial;
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Applique la rémunération annuelle basée sur le taux.
     */
    public void appliquerRemunerationAnnuelle() {
        solde += solde * tauxRemuneration / 100;
    }

    @Override
    public void debiterMontant(double montant) {
        if (montant > 0) {
            if (solde - montant >= 0) {
                solde -= montant;
            } else {
                throw new IllegalArgumentException("Solde insuffisant, les découverts ne sont pas autorisés.");
            }
        } else {
            throw new IllegalArgumentException("Le montant à débiter doit être positif.");
        }
    }
}
