package sportivSimpleFactory.clase;

public class Fundas extends Jucator{
    public Fundas(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void descriere() {
        System.out.println("Fundasul " + super.toString());
    }
}
