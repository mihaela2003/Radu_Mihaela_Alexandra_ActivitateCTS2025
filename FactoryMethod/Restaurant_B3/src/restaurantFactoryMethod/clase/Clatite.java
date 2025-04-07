package restaurantFactoryMethod.clase;

public class Clatite extends FelDeMancare{
    public Clatite(float pret, float calorii, int cantitate) {
        super(pret, calorii, cantitate);
    }

    @Override
    public void descriere() {
        System.out.println("Clatite " + super.toString());
    }
}
