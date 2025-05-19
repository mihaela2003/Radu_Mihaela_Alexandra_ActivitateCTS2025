package stb.flyweight.clase;

import java.util.HashMap;

public class FabricaDeLinii {
    private HashMap<Integer, ILinie> colectieLinii;

    public FabricaDeLinii() {
        colectieLinii = new HashMap<Integer,ILinie>();
    }

    public ILinie getLinie(int cod) throws Exception {
        ILinie linie = colectieLinii.get(cod);
        if(linie == null){
            throw new Exception("nu a fost gasita linia");
        } else {
            return linie;
        }
    }

    public ILinie getLinie(int cod, int numarLinie, String primaStatie, String ultimaStatie){
        ILinie linie = colectieLinii.get(cod);
        if (linie == null) {
            linie = new Linie(cod, numarLinie, primaStatie, ultimaStatie);
            colectieLinii.put(cod, linie);
        }
        return linie;
    }
}
