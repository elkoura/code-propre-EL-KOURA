package ex1;

import java.util.Date;

/**
 * Représente une entreprise avec ses informations de base.
 */
public class Entreprise {

    /**
     * Numéro SIRET de l'entreprise.
     */
    public int siret;

    /**
     * Nom de l'entreprise.
     */
    public String nom;

    /**
     * Adresse de l'entreprise.
     */
    public String adresse;

    /**
     * Date de création de l'entreprise.
     */
    public Date dateCreation;

    /**
     * Capital maximum autorisé pour l'entreprise.
     */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
        // Implémentation de l'affichage du statut
    }
}
