package spital.decorator.clase;

public class RezultatePrintate implements Rezultate{
    private String pacient;

    public RezultatePrintate(String pacient) {
        this.pacient = pacient;
    }

    @Override
    public void descriere() {
        System.out.println("se vor printa rezultatele pentru pacientul " + this.pacient);
    }
}
