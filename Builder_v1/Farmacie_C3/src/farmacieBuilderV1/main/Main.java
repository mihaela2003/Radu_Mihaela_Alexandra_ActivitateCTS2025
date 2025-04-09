package farmacieBuilderV1.main;

import farmacieBuilderV1.clase.Reteta;
import farmacieBuilderV1.clase.RetetaBuilder;

public class Main {
    public static void main(String[] args) {
        RetetaBuilder retetaBuilder = new RetetaBuilder();
        Reteta reteta = retetaBuilder.setaPlatitCuCardul(true).build("1234");
        System.out.println(reteta);

        Reteta reteta1 = retetaBuilder.setNrPungi(7).build("hdfs");
        System.out.println(reteta1);
    }
}