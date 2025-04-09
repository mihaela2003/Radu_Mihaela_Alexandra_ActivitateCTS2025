package serviceAuto.Singleton;

public abstract class AMasina {
    private String marca;
    private String model;
    private String nrInmatriculare;
    private int anFabricatie;

    public AMasina(String marca, String model, String nrInmatriculare, int anFabricatie) {
        this.marca = marca;
        this.model = model;
        this.nrInmatriculare = nrInmatriculare;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMasina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }
}
