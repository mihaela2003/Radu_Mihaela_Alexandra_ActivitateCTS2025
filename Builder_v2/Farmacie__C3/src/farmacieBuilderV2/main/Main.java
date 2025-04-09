package farmacieBuilderV2.main;

import farmacieBuilderV2.clase.Reteta;
import farmacieBuilderV2.clase.RetetaBuilder;

public class Main {
    public static void main(String[] args) {
        RetetaBuilder retetaBuilder = new RetetaBuilder("sdfg");
        Reteta reteta = retetaBuilder.setaPlatitCuCardul(true).build();
        System.out.println(reteta);

        Reteta reteta1 = retetaBuilder.setNrPungi(7).build();
        System.out.println(reteta1);
    }
}