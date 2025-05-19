package spital.facade.main;

import spital.facade.clase.Facade;
import spital.facade.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("cornel", 9);
        Facade facade = new Facade();
        System.out.println(facade.verificareInternare(pacient));
    }
}