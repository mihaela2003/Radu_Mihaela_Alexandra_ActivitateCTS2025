package bancaSimpleFactory.clase;

public class CreditIpotecar extends Credit{
    public CreditIpotecar(String detinator, float suma) {
        super(detinator, suma);
    }

    @Override
    public void descriere() {
        System.out.println("Credit ipotecar " + super.toString());
    }
}
