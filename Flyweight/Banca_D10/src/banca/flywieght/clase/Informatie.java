package banca.flywieght.clase;

public class Informatie {
    private int numarCont;
    private float suma;

    public Informatie(int numarCont, float suma) {
        this.numarCont = numarCont;
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Informatii{");
        sb.append("numarCont=").append(numarCont);
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
