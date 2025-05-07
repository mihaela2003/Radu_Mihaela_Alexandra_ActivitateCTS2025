package spitalFlyweight.program;

import spitalFlyweight.clase.FabricaInternari;
import spitalFlyweight.clase.IPacient;
import spitalFlyweight.clase.Internare;
import spitalFlyweight.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        FabricaInternari fabricaInternari = new FabricaInternari();

        Internare internare1 = new Internare(2,3,4);
        Internare internare2 =  new Internare(3,4,5);
        Internare internare3 = new Internare(5,6,7);

        IPacient pacient = fabricaInternari.getInternare(2);
        pacient.descriere(internare1);
        fabricaInternari.getInternare(1).descriere(internare2);
        fabricaInternari.getInternare(3).descriere(internare3);
    }
}