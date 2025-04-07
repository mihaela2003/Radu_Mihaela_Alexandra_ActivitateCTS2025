package restaurantFactoryMethod.clase;

public class SupaLegume extends FelDeMancare{
    public SupaLegume(float pret, float calorii, int cantitate) {
        super(pret, calorii, cantitate);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de legume " + super.toString());
    }
}
