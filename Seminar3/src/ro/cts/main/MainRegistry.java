package ro.cts.main;

import ro.cts.registri.Autoritate;
import ro.cts.registri.Reglementare;

public class MainRegistry {
    public static void main(String[] args){
        Autoritate autoritate = Autoritate.getInstance("Autoritate", "www.autoritate.ro");
        Reglementare reglementare1 = autoritate.reglementeazaModel("Dacia Logan");
        Reglementare reglementare2 = autoritate.reglementeazaModel("Tesla Cybertruck");
        System.out.println(reglementare1);
        System.out.println(reglementare2);
        Reglementare reglementare3 = autoritate.reglementeazaModel("Dacia Logan");
        System.out.println(reglementare3);
    }
}
