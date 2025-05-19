package restaurant.facade.main;

import restaurant.facade.clase.Facade;
import restaurant.facade.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(false, 7, 4);
        Facade facade = new Facade();
        System.out.println(facade.verificareLocMasa(masa));
    }
}