package farmacieFactoryMethod.fabrici;

import farmacieFactoryMethod.clase.Durere;
import farmacieFactoryMethod.clase.Medicament;

public class DurereFactory implements FarmacieFactory{
    @Override
    public Medicament creareMedicament(float pret, String denumire) {
        return new Durere(pret, denumire);
    }
}
