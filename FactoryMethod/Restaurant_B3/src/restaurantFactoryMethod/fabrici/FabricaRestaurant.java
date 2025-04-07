package restaurantFactoryMethod.fabrici;

import restaurantFactoryMethod.clase.FelDeMancare;

public interface FabricaRestaurant {
    public FelDeMancare creareRestaurant(TipFelDeMancare tip, float pret, float calorii, int cantitate);
}
