package sportivSimpleFactory.clase;

public class Atacant extends Jucator{
    public Atacant(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void descriere() {
        System.out.println("Atacantul " + super.toString());
    }
}
