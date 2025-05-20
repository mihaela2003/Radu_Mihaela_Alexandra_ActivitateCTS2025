package spital.chainOfResponsability.clase;

public class SubObservatie extends InternarePacient{
    @Override
    public void gestiunePacient(int stare) {
        System.out.println("Pacientul este trecut subobservatie");
        this.getUrmInternarePacient().gestiunePacient(stare);
    }
}
