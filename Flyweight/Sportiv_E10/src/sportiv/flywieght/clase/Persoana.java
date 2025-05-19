package sportiv.flywieght.clase;

public class Persoana implements IPersoana{
    private int cod;
    private float inaltime;
    private float latime;

    public Persoana(int cod, float inaltime, float latime) {
        this.cod = cod;
        this.inaltime = inaltime;
        this.latime = latime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("cod=").append(cod);
        sb.append("inaltime=").append(inaltime);
        sb.append(", latime=").append(latime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Caracteristica caracteristica) {
        System.out.println(this.toString() + caracteristica.toString());
    }
}
