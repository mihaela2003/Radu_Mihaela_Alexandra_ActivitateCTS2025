package sportivSimpleFactory.clase;

public class Portar extends Jucator{
    public Portar(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void descriere() {
        System.out.println("Portarul " + super.toString());
    }
}
