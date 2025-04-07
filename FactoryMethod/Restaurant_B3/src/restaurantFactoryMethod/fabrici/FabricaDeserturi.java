package restaurantFactoryMethod.fabrici;

import restaurantFactoryMethod.clase.CheeseCake;
import restaurantFactoryMethod.clase.Clatite;
import restaurantFactoryMethod.clase.FelDeMancare;
import restaurantFactoryMethod.clase.Papanasi;

public class FabricaDeserturi implements FabricaRestaurant{
    @Override
    public FelDeMancare creareRestaurant(TipFelDeMancare tip, float pret, float calorii, int cantitate) {
        switch ((Deserturi) tip){
            case PAPANASI -> {
                return new Papanasi(pret, calorii, cantitate);
            }
            case CLATITE -> {
                return new Clatite(pret, calorii, cantitate);
            }
            case CHEESECAKE -> {
                return new CheeseCake(pret, calorii, cantitate);
            }
            default -> {
                return null;
            }
        }
    }
}
