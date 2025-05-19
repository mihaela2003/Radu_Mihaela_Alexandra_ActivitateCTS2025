package stb.flyweight.main;

import stb.flyweight.clase.Autobuz;
import stb.flyweight.clase.FabricaDeLinii;
import stb.flyweight.clase.ILinie;
import stb.flyweight.clase.Linie;

public class Main {
    public static void main(String[] args) {
        FabricaDeLinii fabrica = new FabricaDeLinii();

        try {
            ILinie linie = new Linie(1, 14,"ceva", "egr");

            Autobuz autobuz = new Autobuz("electric",2024, 24);
            Autobuz autobuz1 = new Autobuz("semi-electric", 2020, 30);

            linie.descriere(autobuz);

            fabrica.getLinie(2,44,"dfgh", "efrg").descriere(autobuz1);
            linie.descriere(autobuz1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}