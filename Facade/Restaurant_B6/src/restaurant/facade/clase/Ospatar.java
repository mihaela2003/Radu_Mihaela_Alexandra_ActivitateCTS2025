package restaurant.facade.clase;

public class Ospatar {
    public boolean verificareServeteleNoi(Masa masa){
        if(masa.getNumarMasa() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
