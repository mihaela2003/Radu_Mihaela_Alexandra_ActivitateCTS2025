package restaurant.adapterDeObiecte.clase;

public class FacturaBucatarie {
    private int numarProduse;
    private float sumaDePlata;

    public FacturaBucatarie(int numarProduse, float sumaDePlata) {
        this.numarProduse = numarProduse;
        this.sumaDePlata = sumaDePlata;
    }

    public int getNumarProduse() {
        return numarProduse;
    }

    public float getSumaDePlata() {
        return sumaDePlata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FacturaBucatarie{");
        sb.append("numarProduse=").append(numarProduse);
        sb.append(", sumaDePlata=").append(sumaDePlata);
        sb.append('}');
        return sb.toString();
    }
}
