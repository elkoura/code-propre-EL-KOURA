package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitaire pour le formatage des dates.
 */
public class DateUtils {

    private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

    /**
     * Formate une date selon un motif spécifié.
     * @param pattern Motif de formatage
     * @param date Date à formater
     * @return Date formatée en chaîne de caractères
     */
    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     * Formate une date selon le motif par défaut "dd/MM/yyyy HH:mm:ss".
     * @param date Date à formater
     * @return Date formatée en chaîne de caractères
     */
    public static String formatDefaut(Date date) {
        return format(DEFAULT_PATTERN, date);
    }
}
