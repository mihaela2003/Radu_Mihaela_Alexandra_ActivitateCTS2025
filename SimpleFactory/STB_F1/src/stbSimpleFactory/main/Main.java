package stbSimpleFactory.main;

import stbSimpleFactory.clase.MijlocTransport;
import stbSimpleFactory.clase.STBFactory;
import stbSimpleFactory.clase.TipTransport;

public class Main {
    public static void main(String[] args) {
        STBFactory stbFactory = new STBFactory();
        MijlocTransport autobuz = stbFactory.getSTB(TipTransport.AUTOBUZ);
        MijlocTransport tramvai = stbFactory.getSTB(TipTransport.TRAMVAI);
        MijlocTransport troleibuz = stbFactory.getSTB(TipTransport.TROLEIBUZ);

        autobuz.descriere();
        tramvai.descriere();
        troleibuz.descriere();
    }
}