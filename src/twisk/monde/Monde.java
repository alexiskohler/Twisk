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
     *
     * @param etapes
     */
    public void aCommeEntree(Etape... etapes){

        entree.ajouterSuccesseur(etapes);
        ge.ajouter(etapes);
    }

    /**
     *
     * @param etapes
     */
    public void aCommeSortie(Etape... etapes){

        sortie.ajouterSuccesseur(etapes);
        ge.ajouter(etapes);
    }

    /**
     *
     * @param etapes
     */
    public void ajouter(Etape... etapes){

        ge.ajouter(etapes);
    }

    /**
     *
     * @return
     */
    public int nbEtapes(){

        return ge.nbEtapes();
    }

    /**
     *
     * @return
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

    /**
     *
     * @return
     */
    @Override
    public Iterator<Etape> iterator() {
        return ge.iterator();
    }
}
