package spitalPrototype.main;

import spitalPrototype.clase.RetetaMedicament;
import spitalPrototype.clase.RetetaAbstract;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> listaSolutiiParacetamol = new HashMap<>();
        listaSolutiiParacetamol.put("ingredient1", 13.6);
        listaSolutiiParacetamol.put("ingredient2", 15.9);
        listaSolutiiParacetamol.put("ingredient3", 25.4);

        RetetaAbstract retetaMedicament = new RetetaMedicament("Gigel", "xfrg14", "Paracetamol", listaSolutiiParacetamol);
        System.out.println(retetaMedicament);
        RetetaAbstract retetaMedicament2 = retetaMedicament.copiaza("Paracetamol");
        System.out.println(retetaMedicament2);
    }
}