package banca.facade.main;

import banca.facade.clase.Facade;
import banca.facade.clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("gigel", 21);
        Facade facade = new Facade();
        System.out.println(facade.verificareCreareCont(persoana));
    }
}