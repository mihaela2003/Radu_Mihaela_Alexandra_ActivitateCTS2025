package farmacie.chainOfResponsability.clase;

public class Emisa extends Reteta{
    @Override
    public void stareReteta() {
        System.out.println("medicul de familie a emis reteta");
        this.getUrmReteta().stareReteta();
    }
}
