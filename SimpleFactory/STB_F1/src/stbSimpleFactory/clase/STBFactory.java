package stbSimpleFactory.clase;

public class STBFactory {
    public MijlocTransport getSTB(TipTransport tipTransport){
        switch (tipTransport){
            case AUTOBUZ -> {
                return new Autobuz();
            }
            case TRAMVAI -> {
                return new Tramvai();
            }
            case TROLEIBUZ -> {
                return new Troleibuz();
            }
            default -> {
                return null;
            }
        }
    }
}
