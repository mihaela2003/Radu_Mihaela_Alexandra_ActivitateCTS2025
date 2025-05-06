package restaurantFlyweight.program;

import restaurantFlyweight.clase.FabricaRezervari;
import restaurantFlyweight.clase.IClient;
import restaurantFlyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        FabricaRezervari fabrica = new FabricaRezervari();

        Rezervare rezervare1 = new Rezervare(3,5,7);
        Rezervare rezervare2 = new Rezervare(2,5,15);
        Rezervare rezervare3 = new Rezervare(6,3,7);

        IClient client = fabrica.getRezervare(1);
        client.tiparire(rezervare1);
        fabrica.getRezervare(2).tiparire(rezervare2);
        fabrica.getRezervare(1).tiparire(rezervare3);
    }
}