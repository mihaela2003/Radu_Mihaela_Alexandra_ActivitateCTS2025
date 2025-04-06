package carteLazy.main;

import carteLazy.clase.Carte;

public class Main {
    public static void main(String[] args){
        Carte carte = Carte.getInstance("A little life", 832, "Hanya Yanagihara");
        System.out.println(carte);
        Carte carte1 = Carte.getInstance("A little life", 732, "Hanya Yanagihara");
        System.out.println(carte1);
    }
}
