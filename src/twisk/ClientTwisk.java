package twisk;

import twisk.monde.Activite;
import twisk.monde.Guichet;
import twisk.monde.Monde;
import twisk.simulation.Simulation;

public class ClientTwisk {

    public static void main(String[] args) {

        Monde world = new Monde();

        Activite conduite = new Activite("Conduite");

        Guichet parking = new Guichet("Parking");

        Activite casse = new Activite("Casse");

        world.aCommeEntree(conduite);
        world.aCommeSortie(casse);
        world.ajouter(parking);

        Simulation simu = new Simulation();

        simu.simuler(world);
    }
}
