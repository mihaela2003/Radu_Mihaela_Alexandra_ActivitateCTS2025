package sportiv.flywieght.clase;

public class Caracteristica {
    private String culoareTricou;
    private String tribuna;
    private int loc;

    public Caracteristica(String culoareTricou, String tribuna, int loc) {
        this.culoareTricou = culoareTricou;
        this.tribuna = tribuna;
        this.loc = loc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Caracteristica{");
        sb.append("culoareTricou='").append(culoareTricou).append('\'');
        sb.append(", tribuna='").append(tribuna).append('\'');
        sb.append(", loc=").append(loc);
        sb.append('}');
        return sb.toString();
    }
}
