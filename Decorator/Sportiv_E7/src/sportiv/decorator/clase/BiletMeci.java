package sportiv.decorator.clase;

public class BiletMeci implements Bilet{
    private int loc;
    private String tribuna;

    public BiletMeci(int loc, String tribuna) {
        this.loc = loc;
        this.tribuna = tribuna;
    }

    @Override
    public void printeaza() {
        System.out.println("Biletul pentru tribuna " + tribuna + " este pentru locul " + loc);
    }
}
