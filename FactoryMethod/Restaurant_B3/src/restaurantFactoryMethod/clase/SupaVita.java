package restaurantFactoryMethod.clase;

public class SupaVita extends FelDeMancare{
    public SupaVita(float pret, float calorii, int cantitate) {
        super(pret, calorii, cantitate);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de vita " + super.toString());
    }
}
