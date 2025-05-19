package farmacie.decorator.clase;

public class BonDeCasa implements Bon{
    private int numarMadicamente;
    private float sumaDePlata;

    public BonDeCasa(int numarMadicamente, float sumaDePlata) {
        this.numarMadicamente = numarMadicamente;
        this.sumaDePlata = sumaDePlata;
    }

    @Override
    public void printeaza() {
        System.out.println("Bonul are " + numarMadicamente + " medicamente. Acestea costa " + sumaDePlata + " lei");
    }
}
