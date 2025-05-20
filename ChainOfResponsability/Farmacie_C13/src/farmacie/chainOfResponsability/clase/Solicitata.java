package farmacie.chainOfResponsability.clase;

public class Solicitata extends Reteta{
    @Override
    public void stareReteta() {
        System.out.println("clientul a ajuns cu reteta in farmacie si cere medicamentele");
        this.getUrmReteta().stareReteta();
    }
}
