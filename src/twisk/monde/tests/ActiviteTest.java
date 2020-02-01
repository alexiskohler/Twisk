package twisk.monde.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twisk.monde.Activite;

class ActiviteTest {

    private Activite[] a;

    @BeforeEach
    void setUp() {

        a = new Activite[2];

        a[0] = new Activite("zoo");
        a[1] = new Activite("toboggan", 2, 1);
    }

    @Test
    void TestToString() {

        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
    }

    @Test
    void TestEqualsVrai() {


    }

    @Test
    void TestEqualsFaux() {


    }
}