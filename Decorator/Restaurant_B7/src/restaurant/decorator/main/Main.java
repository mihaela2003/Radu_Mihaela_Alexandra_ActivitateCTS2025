package restaurant.decorator.main;

import restaurant.decorator.clase.Decorator;
import restaurant.decorator.clase.Nota;
import restaurant.decorator.clase.NotaAnulNou;
import restaurant.decorator.clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaDePlata(50f);
        nota.printeaza();

        Decorator notaDecorata = new NotaAnulNou(nota);
        notaDecorata.printeaza();
    }
}