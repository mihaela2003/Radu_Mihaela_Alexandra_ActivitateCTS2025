package stb.decorator.main;

import stb.decorator.clase.Bilet;
import stb.decorator.clase.BiletNormal;
import stb.decorator.clase.BiletZiNationala;
import stb.decorator.clase.Decorator;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new BiletNormal(3f);
        bilet.printeaza();

        Decorator biletDecorat = new BiletZiNationala(bilet);
        biletDecorat.printeaza();
    }
}