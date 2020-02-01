package twisk.monde;

import twisk.outils.FabriqueNumero;

import java.util.Objects;

public class Guichet extends Etape {

    private int nbjetons;
    private int semaphore;

    /**
     *
     * @param nom
     */
    public Guichet(String nom) {
        super(nom);
        semaphore= FabriqueNumero.getInstance().getNumeroSemaphore();
    }

    /**
     *
     * @param nom
     * @param nbjetons
     */
    public Guichet(String nom, int nbjetons) {
        super(nom);
        this.nbjetons = nbjetons;
        semaphore= FabriqueNumero.getInstance().getNumeroSemaphore();
    }

    /**
     *
     * @return
     */
    @Override
    public boolean estUnGuichet() {
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Guichet{" +
                "nbjetons=" + nbjetons +
                ", nom='" + nom +
                ", numero " + semaphore;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guichet etapes = (Guichet) o;
        return nbjetons == etapes.nbjetons && semaphore==etapes.semaphore;
    }

    public int getNbjetons() {
        return nbjetons;
    }

    public int getSemaphore() {
        return semaphore;
    }
}
