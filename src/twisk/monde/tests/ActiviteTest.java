package twisk.monde.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twisk.monde.Activite;
import twisk.monde.Etape;

class ActiviteTest {

    private Activite[] a;

    @BeforeEach
    void setUp() {

        a = new Activite[2];

        a[0] = new Activite("zoo");
        a[1] = new Activite("toboggan", 2, 1);
    }

    @Test
    void Constructeur2() {
        assert(a[1].getTemps()==2 && a[1].getEcartTemps()==1):"erreur constructeur";
    }

    @Test
    void TestToString() {

        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
    }

    @Test
    void TestEqualsVrai() {
        assert(a[1].equals(a[1])):"pas egale alors que si";
    }

    @Test
    void TestEqualsFaux() {
        assert(!a[1].equals(a[0])):"egale alors que non";
    }

    @Test
    void TestEstUneActivite() {
        assert(a[1].estUneActivite()):"pas egale alors que si";
    }

    @Test
    void TestEstUnGuichet() {
        assert(!a[1].estUnGuichet()):"egale alors que non";
    }

    @Test
    void TestAjouterSuccesseur() {
        a[0].ajouterSuccesseur(a[1]);
        assert(a[0].nbSuccesseur()==1):"erreur ajout";
    }

    @Test
    void TestIterator() {
        a[0].ajouterSuccesseur(a[1]);

        for(Etape e : a[0]){
            System.out.println(e);
        }
    }
}