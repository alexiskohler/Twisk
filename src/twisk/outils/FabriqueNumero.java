package twisk.outils;

public class FabriqueNumero {

    private int cptEtape=0;
    private static FabriqueNumero instance = new FabriqueNumero();

    private FabriqueNumero(){
    }
    public static FabriqueNumero getInstance(){
        return instance;
    }
    public int getNumeroEtape(){
        return cptEtape++;
    }
    public void reset(){
        cptEtape=0;
    }
}
