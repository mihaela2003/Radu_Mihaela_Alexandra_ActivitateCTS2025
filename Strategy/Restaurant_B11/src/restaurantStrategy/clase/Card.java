package restaurantStrategy.clase;

public class Card implements ModPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println(nume + " a platit folosind cardul suma " + suma);
    }
}
