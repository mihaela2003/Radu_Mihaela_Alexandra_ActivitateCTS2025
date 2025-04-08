package restaurantBuilderV1.main;

import restaurantBuilderV1.clase.Rezervare;
import restaurantBuilderV1.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare = rezervareBuilder.setAreAsezareGeam(true).setAreMasaDecorata(true).build("Ionel");
        System.out.println(rezervare);

        Rezervare rezervare1 = rezervareBuilder.setAreScauneErgonomice(true).build("maria");
        System.out.println(rezervare1);
    }
}