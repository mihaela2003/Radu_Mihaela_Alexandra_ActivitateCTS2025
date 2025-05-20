package farmacie.proxy.main;

import farmacie.proxy.clase.IReteta;
import farmacie.proxy.clase.ProxyAreReteta;
import farmacie.proxy.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        IReteta reteta = new Reteta();
        reteta.achizitionareMedicamente(3,true);
        IReteta proxyCardSanatate = new ProxyAreReteta(reteta);
        proxyCardSanatate.achizitionareMedicamente(3,true);
        proxyCardSanatate.achizitionareMedicamente(5, false);
    }
}