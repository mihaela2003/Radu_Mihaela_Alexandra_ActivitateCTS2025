package spitalFactoryMethod.clase;

public class Registrator extends PersonalSpital{
    public Registrator(String nume, String email) {
        super(nume, email);
    }

    @Override
    public void descriere() {
        System.out.println("Registratorul " + super.toString());
    }
}
