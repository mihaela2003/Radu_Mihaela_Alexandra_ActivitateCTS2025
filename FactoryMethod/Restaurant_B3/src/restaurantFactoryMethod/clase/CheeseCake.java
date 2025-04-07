package restaurantFactoryMethod.clase;

public class CheeseCake extends FelDeMancare{
    public CheeseCake(float pret, float calorii, int cantitate) {
        super(pret, calorii, cantitate);
    }

    @Override
    public void descriere() {
        System.out.println("CheeseCake " + super.toString());
    }
}
