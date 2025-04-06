package carte.main;

import carte.clase.Carte;

public class Main {
    public static void main(String[] args){
        Carte carte = Carte.getInstance();
        System.out.println(carte);
        Carte carte1 = Carte.getInstance();
        carte1.setNrPagini(832);
        System.out.println(carte1);
        System.out.println(carte);
    }
}
