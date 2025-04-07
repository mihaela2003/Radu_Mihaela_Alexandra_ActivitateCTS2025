package agentieTurismSimpleFactory.clase;

public class PachetTransport implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Pachetul include doar transport");
    }
}
