package farmacieSimpleFactory.clase;

public class Body extends Medicament{
    public Body(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void descriere() {
        System.out.println("Medicament pentru body " + super.toString());
    }
}
