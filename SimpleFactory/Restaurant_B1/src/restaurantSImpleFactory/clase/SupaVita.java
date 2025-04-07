package restaurantSImpleFactory.clase;

public class SupaVita extends Supa{
    public SupaVita(float pret, int calorii, float cantitate) {
        super(pret, calorii, cantitate);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de vita" + super.toString());
    }
}
