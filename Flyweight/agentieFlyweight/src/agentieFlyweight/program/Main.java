package agentieFlyweight.program;

import agentieFlyweight.clase.FabricaDePachete;
import agentieFlyweight.clase.Optionale;
import agentieFlyweight.clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        FabricaDePachete fabricaDePachete = new FabricaDePachete();

        Optionale optional1 = new Optionale(true, 3);
        Optionale optional2 = new Optionale(false, 3);
        Optionale optional3 = new Optionale(true,1);
        Optionale optional4 = new Optionale(true, 5);

        PachetTuristic pachet = (PachetTuristic) fabricaDePachete.getPachetTuristic(1);
        pachet.descriePachet(optional1);
        fabricaDePachete.getPachetTuristic(2).descriePachet(optional2);
        optional2.setNumarExcursii(40);
        fabricaDePachete.getPachetTuristic(2).descriePachet(optional2);
        fabricaDePachete.getPachetTuristic(2).descriePachet(optional3);
        fabricaDePachete.getPachetTuristic(1).descriePachet(optional4);

        System.out.println(fabricaDePachete.getNumarPachete());
    }
}