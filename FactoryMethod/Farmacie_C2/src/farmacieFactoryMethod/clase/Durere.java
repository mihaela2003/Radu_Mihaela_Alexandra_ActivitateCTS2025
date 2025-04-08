package farmacieFactoryMethod.clase;

public class Durere extends Medicament{
    public Durere(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void descriere() {
        System.out.println("Durere " + super.toString());
    }
}
