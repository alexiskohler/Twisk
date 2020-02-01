package twisk.monde.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twisk.monde.Etape;
import twisk.monde.Guichet;

class GuichetTest {

    private Guichet g;
    private Guichet g2;
    private Guichet g3;

    @BeforeEach
    void setUp() {
        g = new Guichet("x");
        g2 = new Guichet("y", 3);
        g3 = new Guichet("z", 7);
    }

    @Test
    void Constructeur2(){
        System.out.println(g2);
        System.out.println(g3);
        assert(g2.getNbjetons()==3):"erreur cons";
        assert(g3.getNbjetons()==7):"erreur cons";
    }

    @Test
    void TestToString() {
        System.out.println(g);
        System.out.println(g2);
        System.out.println(g3);
    }

    @Test
    void TestEstUneActivite() {
        assert(!g.estUneActivite()):"pas egale alors que si";
    }

    @Test
    void TestEstUnGuichet() {
        assert (g.estUnGuichet()) : "egale alors que non";
    }

    @Test
    void TestAjouterSuccesseur() {
        g.ajouterSuccesseur(g2, g3);
        assert(g.nbSuccesseur()==2):"erreur ajout";
    }

    @Test
    void TestIterator() {
        g.ajouterSuccesseur(g2, g3);

        for(Etape e : g){
            System.out.println(e);
        }
    }
}