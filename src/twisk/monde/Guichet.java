package twisk.monde;

import twisk.outils.FabriqueNumero;

import java.util.Objects;

public class Guichet extends Etape {

    private int nbjetons;
    private int semaphore;

    /**
     * Construit un guichet avec un nom
     * @param nom le nom du guichet
     */
    public Guichet(String nom) {
        super(nom);
        semaphore = FabriqueNumero.getInstance().getNumeroSemaphore();
    }

    /**
     * Construit un guichet avec un nom et nombre de jetons
     * @param nom le nom du guichet
     * @param nbjetons le nombre de jetons
     */
    public Guichet(String nom, int nbjetons) {
        super(nom);
        this.nbjetons = nbjetons;
        semaphore = FabriqueNumero.getInstance().getNumeroSemaphore();
    }

    /**
     * Retourne vrai car cet objet est un guichet
     * @return vrai car cet objet est un guichet
     */
    @Override
    public boolean estUnGuichet() {
        return true;
    }

    @Override
    public String toString() {
        return "Guichet{" +
                "nbjetons=" + nbjetons +
                ", nom='" + nom +
                ", numero " + semaphore;
    }

    /**
     * Retourne vrai si les deux guichets sont égaux, faux sinon
     * @param o le guivhet à comparer
     * @return vrai si les deux guichets sont égaux, faux sinon
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guichet etapes = (Guichet) o;
        return nbjetons == etapes.nbjetons && semaphore==etapes.semaphore;
    }

    /**
     * Retourne le nombre de jetons
     * @return le nombre de jetons
     */
    public int getNbjetons() {
        return nbjetons;
    }

    /**
     * Retourne le numéro de sémaphore
     * @return le numéro de sémaphore
     */
    public int getSemaphore() {
        return semaphore;
    }
}
