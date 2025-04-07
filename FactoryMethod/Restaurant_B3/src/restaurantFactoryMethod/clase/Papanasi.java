package restaurantFactoryMethod.clase;

public class Papanasi extends FelDeMancare{
    public Papanasi(float pret, float calorii, int cantitate) {
        super(pret, calorii, cantitate);
    }

    @Override
    public void descriere() {
        System.out.println("Papanasi " + super.toString());
    }
}
