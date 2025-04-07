package restaurantFactoryMethod.clase;

public class SupaCiuperci extends FelDeMancare{
    public SupaCiuperci(float pret, float calorii, int cantitate) {
        super(pret, calorii, cantitate);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de ciuperci" + super.toString());
    }
}
