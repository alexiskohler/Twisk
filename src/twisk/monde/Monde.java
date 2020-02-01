package twisk.monde;

import java.util.Iterator;

public class Monde implements Iterable<Etape> {

    private GestionnaireEtapes ge;
    private SasEntree entree;
    private SasSortie sortie;

    public Monde() {

        ge = new GestionnaireEtapes();
        entree = new SasEntree();
        sortie = new SasSortie();

    }

    /**
     * Définit une collection d'étapes comme entrées du monde
     * @param etapes la collection d'étapes
     */
    public void aCommeEntree(Etape... etapes){

        entree.ajouterSuccesseur(etapes);
        ge.ajouter(etapes);
    }

    /**
     * Définit une collection d'étapes comme sorties du monde
     * @param etapes la collection d'étapes
     */
    public void aCommeSortie(Etape... etapes){

        sortie.ajouterSuccesseur(etapes);
        ge.ajouter(etapes);
    }

    /**
     * Ajoute une collection d'étapes au monde
     * @param etapes la collection d'étapes
     */
    public void ajouter(Etape... etapes){

        ge.ajouter(etapes);
    }

    /**
     * Retourne le nombre d'étapes dans le monde
     * @return le nombre d'étapes dans le monde
     */
    public int nbEtapes(){

        return ge.nbEtapes();
    }

    /**
     * Retourne le nombre de guichet dans le monde
     * @return le nombre de guichet dans le monde
     */
    public int nbGuichets(){

        int compteur = 0;

        for(Etape e : ge){

            if(e.estUnGuichet()){
                compteur++;
            }
        }

        return compteur;
    }

    @Override
    public String toString() {
        return "Monde{" +
                "ge=" + ge +
                ", entree=" + entree +
                ", sortie=" + sortie +
                '}';
    }

    /**
     * Retourne l'itérateur des étapes du monde
     * @return l'itérateur des étapes du monde
     */
    @Override
    public Iterator<Etape> iterator() {
        return ge.iterator();
    }
}
