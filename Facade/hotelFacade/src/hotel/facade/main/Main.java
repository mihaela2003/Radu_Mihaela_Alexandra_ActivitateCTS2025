package hotel.facade.main;

import hotel.facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        int codCamera = 6;
        System.out.println(Facade.verificareDisponibilitateCamera(codCamera));
    }
}