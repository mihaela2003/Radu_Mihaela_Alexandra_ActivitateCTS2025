package ro.cts.main;

import ro.cts.clase.IRezervare;
import ro.cts.clase.ProxyNumarPersoane;
import ro.cts.clase.ProxyOra;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezervare("Gigel", 5, 15);
        IRezervare proxyNumarPersoane = new ProxyNumarPersoane(rezervare);
        proxyNumarPersoane.rezervare("Gigel", 3, 15);
        IRezervare proxyOra = new ProxyOra(proxyNumarPersoane);
        proxyOra.rezervare("Gigel", 5, 20);
    }
}