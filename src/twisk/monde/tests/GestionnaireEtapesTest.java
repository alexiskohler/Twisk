package twisk.monde.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twisk.monde.Activite;
import twisk.monde.Etape;
import twisk.monde.GestionnaireEtapes;
import twisk.monde.Guichet;

import static org.junit.jupiter.api.Assertions.*;

class GestionnaireEtapesTest {

    private Guichet g;
    private Activite g2;
    private Activite g3;
    private GestionnaireEtapes gs;


    @BeforeEach
    void setUp() {
        g = new Guichet("x", 5);
        g2 = new Activite("y", 5, 2);
        g3 = new Activite("z", 2,3);
        gs= new GestionnaireEtapes();
    }

    @Test
    void ajouter() {
        gs.ajouter(g,g2,g3);

        assert(gs.nbEtapes()==3):"erreur ajout";

        for(Etape e : gs){
            System.out.println(e);
        }
    }

    @Test
    void nbEtapes() {

        assert(gs.nbEtapes()==0):"erreur nbEtape";

        gs.ajouter(g,g2,g3);

        assert(gs.nbEtapes()==3):"erreur nbEtape";

    }

    @Test
    void iterator() {
        gs.ajouter(g,g2,g3);

        assert(gs.nbEtapes()==3):"erreur ajout";

        for(Etape e : gs){
            System.out.println(e);
        }
    }
}