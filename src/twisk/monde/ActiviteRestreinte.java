package twisk.monde;

public class ActiviteRestreinte extends Activite {

    /**
     * Construit une activité restreinte avec un nom
     * @param nom le nom de l'activité restreinte
     */
    public ActiviteRestreinte(String nom) {
        super(nom);
    }

    /**
     * Construit une activité restreinte avec un nom, un temps et un écart de temps
     * @param nom le nom de l'activité restreinte
     * @param t le temps
     * @param e l'écart de temps
     */
    public ActiviteRestreinte(String nom, int t, int e) {
        super(nom, t, e);
    }
}
