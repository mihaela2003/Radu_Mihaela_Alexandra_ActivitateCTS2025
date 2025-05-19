package spital.facade.clase;

public class Facade {
    public String verificareInternare(Pacient p){
        Medic medic = new Medic("gigel", "spitalul judetean");
        Salon salon = new Salon(3,7,5);

            if (medic.confirmareMedic(p)){
                if (salon.verificarePatDisponibil()){
                    return "Va putem interna la spital";
                } else {
                    return "Nu exista paturi disponibile. Nu va putem interna";
                }
            } else {
                return "Medicul nu a putut sa va confirme starea ca fiind una grava.";
            }
    }
}
