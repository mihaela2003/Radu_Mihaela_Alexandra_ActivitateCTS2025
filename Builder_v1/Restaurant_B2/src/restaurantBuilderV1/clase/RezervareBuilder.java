package restaurantBuilderV1.clase;

public class RezervareBuilder implements RestaurantAbstractBuilder{
    private String numeClient;
    private boolean areAsezareGeam;
    private boolean areScauneErgonomice;
    private boolean areMasaDecorata;
    private boolean areMuzicaAmbientala;
    private boolean areGenMuzica;

    public RezervareBuilder() {
        areGenMuzica = false;
        areAsezareGeam = false;
        areMasaDecorata = false;
        areMuzicaAmbientala = false;
        areScauneErgonomice = false;
    }

    public RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public RezervareBuilder setAreAsezareGeam(boolean areAsezareGeam) {
        this.areAsezareGeam = areAsezareGeam;
        return this;
    }

    public RezervareBuilder setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
        return this;
    }

    public RezervareBuilder setAreMasaDecorata(boolean areMasaDecorata) {
        this.areMasaDecorata = areMasaDecorata;
        return this;
    }

    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public RezervareBuilder setAreGenMuzica(boolean areGenMuzica) {
        this.areGenMuzica = areGenMuzica;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return (new Rezervare(numeClient, areAsezareGeam, areScauneErgonomice, areMasaDecorata, areMuzicaAmbientala, areGenMuzica));
    }
}
