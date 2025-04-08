package farmaciePrototype.main;

import farmaciePrototype.clase.RetetaMedicament;
import farmaciePrototype.clase.RetetaAbstract;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> listaCantitati = new HashMap<>();
        listaCantitati.put("ingredient1", 15.8);
        listaCantitati.put("ingredient2", 20.7);
        listaCantitati.put("ingredient3", 25.9);

        RetetaAbstract reteta = new RetetaMedicament("Cornel", "12fgout", "Paracetamol", listaCantitati);
        System.out.println(reteta);
        RetetaAbstract reteta2 = reteta.copiaza("Paracetamol");
        System.out.println(reteta2);
    }
}