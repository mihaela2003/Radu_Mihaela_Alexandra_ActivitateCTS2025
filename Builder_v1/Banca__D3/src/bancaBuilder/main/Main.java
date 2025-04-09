package bancaBuilder.main;

import bancaBuilder.clase.Cont;
import bancaBuilder.clase.ContBuilder;

public class Main {
    public static void main(String[] args) {
        ContBuilder contBuilder = new ContBuilder();
        Cont cont = contBuilder.setAreCardAfisat(true).build("Ioana");
        System.out.println(cont);

        ContBuilder contBuilder1 = new ContBuilder();
        Cont cont1 = contBuilder1.setAreInternetBanking(true).build("Vasile");
        System.out.println(cont1);
    }
}