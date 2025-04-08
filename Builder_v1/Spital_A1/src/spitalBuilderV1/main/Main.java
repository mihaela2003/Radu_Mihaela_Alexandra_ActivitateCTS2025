package spitalBuilderV1.main;

import spitalBuilderV1.clase.Internare;
import spitalBuilderV1.clase.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        InternareBuilder internareBuilder = new InternareBuilder();
        Internare internare = internareBuilder.setAreMicDejunInclus(true).setArePapuciCamera(true).build("Gigel");
        System.out.println(internare);

        Internare internare1 = internareBuilder.setAreHalatInterior(true).setArePatRabatabil(true).build("Maricica");
        System.out.println(internare1);
    }
}