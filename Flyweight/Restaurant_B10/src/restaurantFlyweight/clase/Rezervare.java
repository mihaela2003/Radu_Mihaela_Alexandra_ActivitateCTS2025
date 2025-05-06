package restaurantFlyweight.clase;

public class Rezervare {
    private int numarMasa;
    private int numarPersoane;
    private int oraRezervare;

    public Rezervare(int numarMasa, int numarPersoane, int oraRezervare) {
        super();
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numarMasa=").append(numarMasa);
        sb.append(", numarPersoane=").append(numarPersoane);
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append('}');
        return sb.toString();
    }
}
