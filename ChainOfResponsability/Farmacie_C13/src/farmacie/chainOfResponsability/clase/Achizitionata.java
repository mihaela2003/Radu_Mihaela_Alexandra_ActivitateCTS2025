package farmacie.chainOfResponsability.clase;

public class Achizitionata extends Reteta{
    @Override
    public void stareReteta() {
        System.out.println("medicamentele din reteta au fost achizitionate");
    }
}
