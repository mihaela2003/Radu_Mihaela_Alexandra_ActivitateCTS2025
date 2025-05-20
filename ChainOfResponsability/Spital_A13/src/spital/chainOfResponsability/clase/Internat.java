package spital.chainOfResponsability.clase;

public class Internat  extends InternarePacient{
    @Override
    public void gestiunePacient(int stare) {
        if (stare <= 3){
            System.out.println("nu va internam");
        } else {
            System.out.println("pacientul a fost internat");
            this.getUrmInternarePacient().gestiunePacient(stare);
        }
    }
}
