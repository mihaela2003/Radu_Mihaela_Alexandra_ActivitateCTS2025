package farmacieFactoryMethod.fabrici;

import farmacieFactoryMethod.clase.Body;
import farmacieFactoryMethod.clase.Medicament;

public class BodyFactory implements FarmacieFactory{
    @Override
    public Medicament creareMedicament(float pret, String denumire) {
        return new Body(pret, denumire);
    }
}
