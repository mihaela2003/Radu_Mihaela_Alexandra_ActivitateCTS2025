package spitalFlyweight.clase;

public class Internare {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Internare(int numarSalon, int numarPat, int numarZileSpitalizare) {
        super();
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numarSalon=").append(numarSalon);
        sb.append(", numarPat=").append(numarPat);
        sb.append(", numarZileSpitalizare=").append(numarZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
