package farmacie.decorator.main;

import farmacie.decorator.clase.Bon;
import farmacie.decorator.clase.BonAnulNou;
import farmacie.decorator.clase.BonDeCasa;
import farmacie.decorator.clase.Decorator;

public class Main {
    public static void main(String[] args) {
        Bon bon = new BonDeCasa(2, 55.3f);
        bon.printeaza();

        Decorator bonDecorat = new BonAnulNou(bon);
        bonDecorat.printeaza();
    }
}