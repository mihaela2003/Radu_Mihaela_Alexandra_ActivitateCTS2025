package restaurantBuilderV1.clase;

public class Rezervare {
    private String numeClient;
    private boolean areAsezareGeam;
    private boolean areScauneErgonomice;
    private boolean areMasaDecorata;
    private boolean areMuzicaAmbientala;
    private boolean areGenMuzica;

    public Rezervare(String numeClient, boolean areAsezareGeam, boolean areScauneErgonomice, boolean areMasaDecorata, boolean areMuzicaAmbientala, boolean areGenMuzica) {
        this.numeClient = numeClient;
        this.areAsezareGeam = areAsezareGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.areMasaDecorata = areMasaDecorata;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.areGenMuzica = areGenMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", areAsezareGeam=").append(areAsezareGeam);
        sb.append(", areScauneErgonomice=").append(areScauneErgonomice);
        sb.append(", areMasaDecorata=").append(areMasaDecorata);
        sb.append(", areMuzicaAmbientala=").append(areMuzicaAmbientala);
        sb.append(", areGenMuzica=").append(areGenMuzica);
        sb.append('}');
        return sb.toString();
    }
}
