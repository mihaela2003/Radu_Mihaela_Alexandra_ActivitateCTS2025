package spitalFlyweight.clase;

import java.util.HashMap;

public class FabricaInternari {
    private HashMap<Integer, IPacient> internari;

    public FabricaInternari() {
        internari = new HashMap<Integer, IPacient>();
    }

    public IPacient getInternare(int codPacient){
        if (internari.containsKey(codPacient)){
            return internari.get(codPacient);
        }
        else {
            IPacient pacient = new Pacient("Gigel", "12345678990", "sdfghjk", codPacient);
            internari.put(codPacient, pacient);
            return pacient;
        }
    }
}
