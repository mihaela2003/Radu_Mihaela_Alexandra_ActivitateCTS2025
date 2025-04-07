package restaurantSImpleFactory.clase;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(float pret, int calorii, float cantitate) {
        super(pret, calorii, cantitate);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de ciuperci " + super.toString());
    }
}
