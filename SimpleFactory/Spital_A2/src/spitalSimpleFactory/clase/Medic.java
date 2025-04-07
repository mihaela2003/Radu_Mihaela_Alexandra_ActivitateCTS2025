package spitalSimpleFactory.clase;

public class Medic extends PersonalSpital{
    public Medic(String nume, String email) {
        super(nume, email);
    }

    @Override
    public void descriere() {
        System.out.println("Medicul " + super.toString());
    }
}
