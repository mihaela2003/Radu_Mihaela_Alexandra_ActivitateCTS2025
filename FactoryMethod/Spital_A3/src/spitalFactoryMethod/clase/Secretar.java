package spitalFactoryMethod.clase;

public class Secretar extends PersonalSpital{
    public Secretar(String nume, String email) {
        super(nume, email);
    }

    @Override
    public void descriere() {
        System.out.println("Secretarul " + super.toString());
    }
}
