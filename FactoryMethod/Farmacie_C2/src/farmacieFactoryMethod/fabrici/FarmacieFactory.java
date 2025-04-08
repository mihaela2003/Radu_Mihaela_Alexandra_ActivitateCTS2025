package farmacieFactoryMethod.fabrici;

import farmacieFactoryMethod.clase.Medicament;

public interface FarmacieFactory {
    public Medicament creareMedicament(float pret, String denumire);
}
