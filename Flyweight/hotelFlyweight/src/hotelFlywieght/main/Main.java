package hotelFlywieght.main;

import hotelFlywieght.clase.FabricaDeCamere;
import hotelFlywieght.clase.ICamera;
import hotelFlywieght.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        FabricaDeCamere fabrica = new FabricaDeCamere();

        Rezervare rezervarePopescu = new Rezervare("Popescu", 3);
        Rezervare rezervareIonescu = new Rezervare("Ionescu", 6);
        Rezervare rezervareVasilescu = new Rezervare("Vasilescu", 2);

        ICamera camera = fabrica.getCamera(1);
        camera.tiparire(rezervareVasilescu);
        fabrica.getCamera(1).tiparire(rezervareIonescu);
        fabrica.getCamera(2).tiparire(rezervarePopescu);
    }
}