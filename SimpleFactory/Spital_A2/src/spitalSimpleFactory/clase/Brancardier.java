package spitalSimpleFactory.clase;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, String email) {
        super(nume, email);
    }

    @Override
    public void descriere() {
        System.out.println("Brancardierul " + super.toString());
    }
}
