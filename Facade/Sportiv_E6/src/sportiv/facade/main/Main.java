package sportiv.facade.main;

import sportiv.facade.clase.Facade;
import sportiv.facade.clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("gigel");
        Facade facade = new Facade();
        System.out.println(facade.validator(persoana));
    }
}