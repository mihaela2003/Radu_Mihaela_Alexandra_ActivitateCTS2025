package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlata = new CardCalatorie(5);
        Calator calator = new Calator("Corina", metodaPlata);
        calator.platesteBilet(5);
        calator.setMetodaPlata(new PlataSMS());
        calator.platesteBilet(5);
        calator.setMetodaPlata(new CardBancar(4));
        calator.platesteBilet(5);
        calator.setMetodaPlata(metodaPlata);
        calator.platesteBilet(5);
    }
}