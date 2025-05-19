package spital.facade.clase;

public class Medic {
    private String nume;
    private String spital;

    public Medic(String nume, String spital) {
        this.nume = nume;
        this.spital = spital;
    }

    public boolean confirmareMedic(Pacient pacient){
        if(pacient.verificareGravitateStare()){
            return true;
        } else {
            return false;
        }
    }
}
