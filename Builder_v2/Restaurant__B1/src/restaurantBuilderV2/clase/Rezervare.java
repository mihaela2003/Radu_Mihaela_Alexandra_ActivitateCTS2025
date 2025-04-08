package restaurantBuilderV2.clase;

public class Rezervare {
    private String numeClient;
    private boolean areAsezareGeam;
    private boolean areScauneErgonomice;
    private boolean areMasaDecorata;
    private boolean areMuzicaAmbientala;
    private boolean areGenMuzica;

    protected Rezervare(String numeClient, boolean areAsezareGeam, boolean areScauneErgonomice, boolean areMasaDecorata, boolean areMuzicaAmbientala, boolean areGenMuzica) {
        this.numeClient = numeClient;
        this.areAsezareGeam = areAsezareGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.areMasaDecorata = areMasaDecorata;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.areGenMuzica = areGenMuzica;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    protected void setAreAsezareGeam(boolean areAsezareGeam) {
        this.areAsezareGeam = areAsezareGeam;
    }

    protected void setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
    }

    protected void setAreMasaDecorata(boolean areMasaDecorata) {
        this.areMasaDecorata = areMasaDecorata;
    }

    protected void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    protected void setAreGenMuzica(boolean areGenMuzica) {
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
