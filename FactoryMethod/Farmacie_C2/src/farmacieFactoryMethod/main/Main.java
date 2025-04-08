package farmacieFactoryMethod.main;

import farmacieFactoryMethod.clase.Medicament;
import farmacieFactoryMethod.fabrici.BodyFactory;
import farmacieFactoryMethod.fabrici.DurereFactory;
import farmacieFactoryMethod.fabrici.FarmacieFactory;
import farmacieFactoryMethod.fabrici.RacealaFactory;

public class Main {
    public static void main(String[] args) {
        FarmacieFactory fabrica = new BodyFactory();
        Medicament medicament = fabrica.creareMedicament(34, "paracetamol");
        medicament.descriere();

        FarmacieFactory fabrica2 = new DurereFactory();
        Medicament medicament1 = fabrica2.creareMedicament(45, "parasinus");
        medicament1.descriere();

        FarmacieFactory fabrica3 = new RacealaFactory();
        Medicament medicament2 = fabrica3.creareMedicament(45, "faringo");
        medicament2.descriere();
    }
}