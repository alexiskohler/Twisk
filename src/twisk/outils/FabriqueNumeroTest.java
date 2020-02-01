package twisk.outils;

import static org.junit.jupiter.api.Assertions.*;

class FabriqueNumeroTest {

    @org.junit.jupiter.api.Test
    void getInstance() {
        assert(FabriqueNumero.getInstance().getNumeroEtape()==0):"valeur differente de 0";
    }

    @org.junit.jupiter.api.Test
    void getNumeroEtape() {
        FabriqueNumero x= FabriqueNumero.getInstance();
        assert(x.getNumeroEtape()==1):"x valeur invalide";
        assert(x.getNumeroEtape()==2):"y valeur invalide";
        assert(x.getNumeroEtape()==3):"z valeur invalide";
        assert(x.getNumeroSemaphore()==1):"x valeur invalide";
        assert(x.getNumeroSemaphore()==2):"y valeur invalide";
        assert(x.getNumeroSemaphore()==3):"z valeur invalide";
    }

    @org.junit.jupiter.api.Test
    void reset() {
        FabriqueNumero x= FabriqueNumero.getInstance();
        x.reset();
        assert(x.getNumeroEtape()==0):"x valeur invalide";
        assert(x.getNumeroSemaphore()==1):"x valeur invalide";
    }
}