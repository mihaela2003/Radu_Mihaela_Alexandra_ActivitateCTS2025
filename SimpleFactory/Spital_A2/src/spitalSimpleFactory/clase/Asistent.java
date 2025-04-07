package spitalSimpleFactory.clase;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, String email) {
        super(nume, email);
    }

    @Override
    public void descriere() {
        System.out.println("Asistentul " + super.toString());
    }
}
