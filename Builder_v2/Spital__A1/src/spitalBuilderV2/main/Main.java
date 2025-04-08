package spitalBuilderV2.main;

import spitalBuilderV2.clase.Internare;
import spitalBuilderV2.clase.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        InternareBuilder internareBuilder = new InternareBuilder("Cornel");
        Internare internare = internareBuilder.setAreHalatInterior(true).build();
        System.out.println(internare);

        Internare internare1 = internareBuilder.setArePapuciCamera(true).build();
        System.out.println(internare1);
    }
}