package restaurantBuilderV2.clase;

public class RezervareBuilder implements RestaurantAbstractBuilder{
    private Rezervare rezervare;

    public RezervareBuilder(String numeClient) {
        rezervare = new Rezervare(numeClient, false, false, false, false, false);
    }

    public RezervareBuilder setAreAsezareGeam(boolean areAsezareGeam) {
        rezervare.setAreAsezareGeam(areAsezareGeam);
        return this;
    }

    public RezervareBuilder setAreScauneErgonomice(boolean areScauneErgonomice) {
        rezervare.setAreScauneErgonomice(areScauneErgonomice);
        return this;
    }

    public RezervareBuilder setAreMasaDecorata(boolean areMasaDecorata) {
        rezervare.setAreMasaDecorata(areMasaDecorata);
        return this;
    }

    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
        return this;
    }

    public RezervareBuilder setAreGenMuzica(boolean areGenMuzica) {
        rezervare.setAreGenMuzica(areGenMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
