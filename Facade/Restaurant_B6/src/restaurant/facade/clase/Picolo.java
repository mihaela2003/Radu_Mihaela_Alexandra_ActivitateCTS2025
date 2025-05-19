package restaurant.facade.clase;

public class Picolo {
    public boolean verificareMasaDebarasata(Masa masa){
        if (masa.isEsteLibera()){
            return true;
        } else {
            return false;
        }
    }
}
