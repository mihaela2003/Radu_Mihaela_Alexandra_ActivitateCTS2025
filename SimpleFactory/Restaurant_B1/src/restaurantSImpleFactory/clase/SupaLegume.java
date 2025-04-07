package restaurantSImpleFactory.clase;

public class SupaLegume extends Supa{
    public SupaLegume(float pret, int calorii, float cantitate) {
        super(pret, calorii, cantitate);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de legume " + super.toString());
    }
}
