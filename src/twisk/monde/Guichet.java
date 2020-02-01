package twisk.monde;

import java.util.Objects;

public class Guichet extends Etape {

    private int nbjetons;

    /**
     *
     * @param nom
     */
    public Guichet(String nom) {
        super(nom);
    }

    /**
     *
     * @param nom
     * @param nbjetons
     */
    public Guichet(String nom, int nbjetons) {
        super(nom);
        this.nbjetons = nbjetons;
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
                ", nom='" + nom;
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
        return nbjetons == etapes.nbjetons;
    }
}
