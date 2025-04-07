package farmacieSimpleFactory.clase;

public class Raceala extends Medicament{
    public Raceala(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void descriere() {
        System.out.println("Medicament pentru raceala " + super.toString());
    }
}
