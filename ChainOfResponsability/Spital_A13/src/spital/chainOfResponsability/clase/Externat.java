package spital.chainOfResponsability.clase;

public class Externat extends InternarePacient{

    @Override
    public void gestiunePacient(int stare) {
        System.out.println("pacientul a fost externat.");
    }
}
