package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        FactorySupa factorySupa = new FactorySupa(500);
        FactoryDeserturi factoryDeserturi = new FactoryDeserturi("vanilie");
        FelDeMancare supaDeLegume = factorySupa.creareFelDeMancare(Supe.supaDeLegume, 20.5f, 450);
        FelDeMancare supaDeCiuperci = factorySupa.creareFelDeMancare(Supe.supaDeCiuperci, 30.5f, 500);
        FelDeMancare tiramisu = factoryDeserturi.creareFelDeMancare(Deserturi.tiramisu, 45f, 489);
        System.out.println(supaDeLegume);
        System.out.println(supaDeCiuperci);
        System.out.println(tiramisu);
    }
}