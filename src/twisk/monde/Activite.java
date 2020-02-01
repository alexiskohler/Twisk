package twisk.monde;

import java.util.Objects;

public class Activite extends Etape{

    private int temps;
    private int ecartTemps;

    public Activite(){

    }

    /**
     * Construit une activite avec un nom
     * @param nom le nom
     */
    public Activite(String nom) {
        super(nom);
    }

    /**
     * Construit une activite avec un nom, un temps et un ecart de temps
     * @param nom le nom
     * @param t le temps
     * @param e l'ecart de temps
     */
    public Activite(String nom, int t, int e) {
        super(nom);
        temps = t;
        ecartTemps = e;
    }

    /**
     * Retourne vrai car cet objet est une activite
     * @return vrai car cet objet est une activite
     */
    @Override
    public boolean estUneActivite() {
        return true;
    }

    @Override
    public String toString() {
        return "Activite{" +
                "temps=" + temps +
                ", ecartTemps=" + ecartTemps +
                ", nom='" + nom + '\'' +
                '}';
    }

    /**
     * Retourne vrai si les deux activités sont égales, faux sinon
     * @param o l'activité à comparer
     * @return vrai si les deux activités sont égales, faux sinon
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activite etapes = (Activite) o;
        return temps == etapes.temps &&
                ecartTemps == etapes.ecartTemps;
    }

    /**
     * Retourne le temps de l'activité
     * @return le temps de l'activité
     */
    public int getTemps() {
        return temps;
    }

    /**
     * Retourne l'écart de temps de l'activité
     * @return l'écart de temps de l'activité
     */
    public int getEcartTemps() {
        return ecartTemps;
    }
}
