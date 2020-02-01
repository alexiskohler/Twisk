package twisk.monde;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class GestionnaireSuccesseurs implements Iterable<Etape> {

    private LinkedList<Etape> lesEtapes;

    public GestionnaireSuccesseurs() {

        this.lesEtapes = new LinkedList<>();
    }

    /**
     * Ajoute une collection d'etapes à la collection d'etapes
     * @param e une collection d'etape
     */
    public void ajouter(Etape... e){

        Collections.addAll(lesEtapes,e);
    }

    /**
     * Retourne le nombre d'étapes
     * @return le nombre d'étapes
     */
    public int nbEtapes(){

        return lesEtapes.size();
    }

    @Override
    public String toString() {
        return "GestionnaireSuccesseurs{" +
                "lesEtapes=" + lesEtapes +
                '}';
    }

    @Override
    public Iterator<Etape> iterator() {
        return lesEtapes.iterator();
    }
}
