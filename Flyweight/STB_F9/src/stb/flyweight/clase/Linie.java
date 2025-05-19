package stb.flyweight.clase;

public class Linie implements ILinie{
    private int cod;
    private int numarLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int cod, int numarLinie, String primaStatie, String ultimaStatie) {
        this.cod = cod;
        this.numarLinie = numarLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("cod=").append(cod);
        sb.append("numarLinie=").append(numarLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Autobuz autobuz) {
        System.out.println(this.toString() + " " + autobuz.toString());
    }
}
