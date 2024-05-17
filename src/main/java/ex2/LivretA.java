package ex2;

/**
 * Classe représentant un Livret A, ne permettant pas le découvert.
 */
public class LivretA extends CompteBancaire {
    private double tauxRemuneration;

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
		// TODO Auto-generated method stub
		
	}


	
}