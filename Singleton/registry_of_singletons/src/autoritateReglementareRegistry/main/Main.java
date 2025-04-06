package autoritateReglementareRegistry.main;

import autoritateReglementareRegistry.clase.Autoritate;
import autoritateReglementareRegistry.clase.Reglementare;

public class Main {
    public static void main(String[] args){
        Autoritate autoritate = Autoritate.getInstance("autoritate", "www.autoritate.ro");
        Reglementare reglementare1 = autoritate.reglementeazaModel("Dacia Logan");
        Reglementare reglementare2 = autoritate.reglementeazaModel("Tesla Cybertruck");
        System.out.println(reglementare1);
        System.out.println(reglementare2);
        Reglementare reglementare3 = autoritate.reglementeazaModel("Dacia Logan");
        System.out.println(reglementare3);
    }
}
