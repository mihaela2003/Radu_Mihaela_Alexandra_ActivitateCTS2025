package restaurantBuilderV2.main;

import restaurantBuilderV2.clase.Rezervare;
import restaurantBuilderV2.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder("Marlena");
        Rezervare rezervare = rezervareBuilder.setAreAsezareGeam(true).build();
        System.out.println(rezervare);

        Rezervare rezervare1 = rezervareBuilder.setAreScauneErgonomice(true).build();
        System.out.println(rezervare1);
    }
}