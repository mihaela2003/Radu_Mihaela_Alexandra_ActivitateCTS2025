package restaurantFactoryMethod.main;

import restaurantFactoryMethod.clase.FelDeMancare;
import restaurantFactoryMethod.fabrici.*;

public class Main {
    public static void main(String[] args) {
        FabricaRestaurant fabrica = new FabricaSupe();
        FabricaRestaurant fabricaDeserturi = new FabricaDeserturi();

        FelDeMancare fel = fabrica.creareRestaurant(Supe.SUPA_LEGUME, 12, 400, 350);
        fel.descriere();
        fel = fabricaDeserturi.creareRestaurant(Deserturi.CHEESECAKE, 50, 450, 200);
        fel.descriere();
    }
}