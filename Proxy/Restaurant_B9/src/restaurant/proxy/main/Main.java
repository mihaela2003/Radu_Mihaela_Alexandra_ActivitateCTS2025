package restaurant.proxy.main;

import restaurant.proxy.clase.IRezervare;
import restaurant.proxy.clase.ProxyNumarPersoane;
import restaurant.proxy.clase.ProxyOra;
import restaurant.proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezervare("gigel", 5, 14);
        IRezervare proxyNumarPersoane = new ProxyNumarPersoane(rezervare);
        proxyNumarPersoane.rezervare("gigel", 3, 14);
        IRezervare proxyOra = new ProxyOra(rezervare);
        proxyOra.rezervare("ana", 2, 23);
    }
}