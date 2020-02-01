package twisk.monde;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class Etape implements Iterable<Etape> {

    protected String nom;
    protected GestionnaireSuccesseurs gs;

    public Etape(){

    }

    /**
     *
     * @param nom
     */
    public Etape(String nom) {
        this.nom = nom;
        gs = new GestionnaireSuccesseurs();
    }

    /**
     * Ajoute une collection d'etapes à la collection d'etapes
     * @param e une collection d'etape
     */
    public void ajouterSuccesseur(Etape... e){

        gs.ajouter(e);
    }

    public int nbSuccesseur(){
        return gs.nbEtapes();
    }

    /**
     * Retourne vrai si l'etape est une activite, faux sinon
     * @return vrai si l'etape est une activite, faux sinon
     */
    public boolean estUneActivite(){

        return false;
    }

    /**
     * Retourne vrai si l'etape est un guichet, faux sinon
     * @return vrai si l'etape est un guichet, faux sinon
     */
    public boolean estUnGuichet(){

        return false;
    }

    /**
     * Itère les etapes
     * @return l'iterateur de lesEtapes
     */
    public Iterator<Etape> iterator(){

        return gs.iterator();
    }
}
