package farmacie.flyweight.clase;

public class Reteta {
    private int numarReteta;
    private float sumaDePlata;
    private int numarMedicamente;

    public Reteta(int numarReteta, float sumaDePlata, int numarMedicamente) {
        this.numarReteta = numarReteta;
        this.sumaDePlata = sumaDePlata;
        this.numarMedicamente = numarMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numarReteta=").append(numarReteta);
        sb.append(", sumaDePlata=").append(sumaDePlata);
        sb.append(", numarMedicamente=").append(numarMedicamente);
        sb.append('}');
        return sb.toString();
    }
}
