package farmacieSimpleFactory.main;

import farmacieSimpleFactory.clase.FarmacieFactory;
import farmacieSimpleFactory.clase.Medicament;
import farmacieSimpleFactory.clase.TipMedicament;

public class Main {
    public static void main(String[] args) {
        FarmacieFactory farmacieFactory = new FarmacieFactory(25.99f, "Paracetamol");
        Medicament raceala = farmacieFactory.getFarmacie(TipMedicament.RACEALA);
        Medicament durere = farmacieFactory.getFarmacie(TipMedicament.DURERE);
        Medicament body = farmacieFactory.getFarmacie(TipMedicament.BODY);

        raceala.descriere();
        durere.descriere();
        body.descriere();
    }
}