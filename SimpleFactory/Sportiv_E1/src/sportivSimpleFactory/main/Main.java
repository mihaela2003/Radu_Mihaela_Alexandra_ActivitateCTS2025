package sportivSimpleFactory.main;

import sportivSimpleFactory.clase.Jucator;
import sportivSimpleFactory.clase.SportivFactory;
import sportivSimpleFactory.clase.TipSportiv;

public class Main {
    public static void main(String[] args) {
        SportivFactory sportivFactory = new SportivFactory("Dragusin Radu", 500000);
        Jucator portar = sportivFactory.getSportiv(TipSportiv.PORTAR);
        Jucator fundas = sportivFactory.getSportiv(TipSportiv.FUNDAS);
        Jucator atacant = sportivFactory.getSportiv(TipSportiv.ATACANT);

        portar.descriere();
        fundas.descriere();
        atacant.descriere();
    }
}