package stb.facade.main;

import stb.facade.clase.Facade;
import stb.facade.clase.Usa;

public class Main {
    public static void main(String[] args) {
        Usa usa = new Usa("costica");
        Facade facade = new Facade();
        facade.deschidereLiber(usa);
        facade.deschidereFortata(usa);
    }
}