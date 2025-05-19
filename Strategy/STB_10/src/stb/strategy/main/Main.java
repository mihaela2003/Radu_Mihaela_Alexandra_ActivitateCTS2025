package stb.strategy.main;

import stb.strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        ModPlata modPlata = new CardBancar(34);
        Calator calator = new Calator("gigel", modPlata);
        calator.platesteBilet(5);
        calator.setModPlata(new CardCalatorii(2));
        calator.platesteBilet(5);
        calator.setModPlata(new PlataSMS());
        calator.platesteBilet(6);
        calator.setModPlata(modPlata);
        calator.platesteBilet(7);
    }
}