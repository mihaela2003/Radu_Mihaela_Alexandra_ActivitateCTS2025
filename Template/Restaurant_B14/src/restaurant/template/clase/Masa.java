package restaurant.template.clase;

public class Masa {
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append('}');
        return sb.toString();
    }
}
