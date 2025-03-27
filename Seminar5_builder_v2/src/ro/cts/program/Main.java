package ro.cts.program;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder("Tudor");
        Rezervare rezervare = rezervareBuilder.setHasAsezareGeam(true).setGenMuzica("Jazz").build();
        System.out.println(rezervare);
        Rezervare rezervare1 = rezervareBuilder.setHasMasaDecorata(true).setGenMuzica("Ambientala").build();
        System.out.println(rezervare1);
        System.out.println(rezervare);
    }
}