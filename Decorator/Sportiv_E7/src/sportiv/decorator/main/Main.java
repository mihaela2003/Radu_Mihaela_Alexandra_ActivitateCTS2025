package sportiv.decorator.main;

import sportiv.decorator.clase.Bilet;
import sportiv.decorator.clase.BiletEchipaLocala;
import sportiv.decorator.clase.BiletMeci;
import sportiv.decorator.clase.Decorator;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new BiletMeci(4,"tribuna nord");
        bilet.printeaza();

        Decorator biletDecorat = new BiletEchipaLocala(bilet);
        biletDecorat.printeaza();
    }
}