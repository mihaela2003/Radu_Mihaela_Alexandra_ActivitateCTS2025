package restaurant.adapterDeObiecte.clase;

public class FacturaBar {
    private String dataScadenta;
    private float sumaDePlata;
    private int numarProduse;

    public FacturaBar(String dataScadenta, float sumaDePlata, int numarProduse) {
        this.dataScadenta = dataScadenta;
        this.sumaDePlata = sumaDePlata;
        this.numarProduse = numarProduse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FacturaBar{");
        sb.append("dataScadenta='").append(dataScadenta).append('\'');
        sb.append(", sumaDePlata=").append(sumaDePlata);
        sb.append(", numarProduse=").append(numarProduse);
        sb.append('}');
        return sb.toString();
    }
}
