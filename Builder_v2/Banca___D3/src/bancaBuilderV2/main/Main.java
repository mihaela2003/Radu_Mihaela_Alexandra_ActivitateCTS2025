package bancaBuilderV2.main;

import bancaBuilderV2.clase.Cont;
import bancaBuilderV2.clase.ContBuilder;

public class Main {
    public static void main(String[] args) {
        ContBuilder contBuilder = new ContBuilder("Gigel");
        Cont cont = contBuilder.setAreCardAfisat(true).build();
        System.out.println(cont);

        Cont cont1 = contBuilder.setAreInternetBanking(true).build();
        System.out.println(cont);
    }
}