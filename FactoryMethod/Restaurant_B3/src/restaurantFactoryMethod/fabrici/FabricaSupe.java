package restaurantFactoryMethod.fabrici;

import restaurantFactoryMethod.clase.FelDeMancare;
import restaurantFactoryMethod.clase.SupaCiuperci;
import restaurantFactoryMethod.clase.SupaLegume;
import restaurantFactoryMethod.clase.SupaVita;

public class FabricaSupe implements FabricaRestaurant{
    @Override
    public FelDeMancare creareRestaurant(TipFelDeMancare tip, float pret, float calorii, int cantitate) {
        switch ((Supe) tip){
            case SUPA_LEGUME -> {
                return new SupaLegume(pret, calorii, cantitate);
            }
            case SUPA_CIUPERCI -> {
                return new SupaCiuperci(pret, calorii, cantitate);
            }
            case SUPA_VITA -> {
                return new SupaVita(pret, calorii, cantitate);
            }
            default -> {
                return null;
            }
        }
    }
}
