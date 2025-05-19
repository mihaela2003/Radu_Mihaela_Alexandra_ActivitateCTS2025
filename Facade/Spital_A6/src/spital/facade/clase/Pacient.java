package spital.facade.clase;

public class Pacient {
    private String nume;
    private int gravitateStare;

    public Pacient(String nume, int gravitateStare) {
        this.nume = nume;
        this.gravitateStare = gravitateStare;
    }

    public boolean verificareGravitateStare(){
        if (gravitateStare >= 7){
            return true;
        } else {
            return false;
        }
    }
}
