package carteStaticBlock.main;

import carteStaticBlock.clase.Carte;

public class Main {
    public static void main(String[] args){
        Carte carte = Carte.getInstance();
        System.out.println(carte);
        Carte carte1 = Carte.getInstance();
        carte1.setAutor("Hanya Yanagihara");
        System.out.println(carte1);
        System.out.println(carte);
    }
}
