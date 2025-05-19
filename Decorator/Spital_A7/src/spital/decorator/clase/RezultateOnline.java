package spital.decorator.clase;

public class RezultateOnline extends Decorator{
    public RezultateOnline(Rezultate rezultate) {
        super(rezultate);
    }

    @Override
    protected void printeaza() {
        System.out.println("se trimit rezultatele in format electronic");
    }
}
