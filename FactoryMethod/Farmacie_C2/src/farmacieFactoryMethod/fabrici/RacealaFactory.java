package farmacieFactoryMethod.fabrici;

import farmacieFactoryMethod.clase.Medicament;
import farmacieFactoryMethod.clase.Raceala;

public class RacealaFactory implements FarmacieFactory{

    @Override
    public Medicament creareMedicament(float pret, String denumire) {
        return new Raceala(pret, denumire);
    }
}
