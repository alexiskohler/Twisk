package twisk.monde.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twisk.monde.*;

import static org.junit.jupiter.api.Assertions.*;

class MondeTest {

    private Guichet g;
    private Activite g2;
    private Activite g3;
    private Monde m;


    @BeforeEach
    void setUp() {
        g = new Guichet("x", 5);
        g2 = new Activite("y", 5, 2);
        g3 = new Activite("z", 2,3);
        m= new Monde();
    }

    @Test
    void aCommeEntree() {
        m.aCommeEntree(g2, g3);

        for(Etape e : m){
            System.out.println(e);
        }

    }

    @Test
    void aCommeSortie() {
        m.aCommeSortie(g2, g3);

        for(Etape e : m){
            System.out.println(e);
        }
    }

    @Test
    void ajouter() {
        m.ajouter(g,g2,g3);

        for(Etape e : m){
            System.out.println(e);
        }
    }

    @Test
    void nbEtapes() {
        assert(m.nbEtapes()==0):"erreur nbEtape 0";

        m.ajouter(g,g2,g3);

        assert(m.nbEtapes()==3):"erreur nbEtape";
    }

    @Test
    void nbGuichets() {

        assert(m.nbGuichets()==0):"erreur nbGuichet 0";

        m.ajouter(g,g2,g3);

        assert(m.nbGuichets()==1):"erreur nbGuichet";
    }

    @Test
    void iterator() {

        m.ajouter(g,g2,g3);

        for(Etape e : m){
            System.out.println(e);
        }
    }
}