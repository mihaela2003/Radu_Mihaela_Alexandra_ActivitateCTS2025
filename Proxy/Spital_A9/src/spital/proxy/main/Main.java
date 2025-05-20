package spital.proxy.main;

import spital.proxy.clase.IInternare;
import spital.proxy.clase.Internare;
import spital.proxy.clase.ProxyCardSanatate;

public class Main {
    public static void main(String[] args) {
        IInternare internare = new Internare();
        internare.internare("gigel", true);
        IInternare proxyCardSanatate = new ProxyCardSanatate(internare);
        proxyCardSanatate.internare("gigel", true);
        proxyCardSanatate.internare("gigel", false);
    }
}