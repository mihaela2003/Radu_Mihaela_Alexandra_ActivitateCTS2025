package ro.cts.program;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare = rezervareBuilder.setGenMuzica("ambientala").setHasAsezareGeam(true).build("Andrei");
        System.out.println(rezervare);

        Rezervare rezervare1 = rezervareBuilder.setHasScauneErg(true).build("Maria");
        System.out.println(rezervare1);
    }
}