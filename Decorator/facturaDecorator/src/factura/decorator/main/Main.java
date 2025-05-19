package factura.decorator.main;

import factura.decorator.clase.Decorator;
import factura.decorator.clase.Factura;
import factura.decorator.clase.FacturaDecorata;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura(123, 1000);

        factura.printeazaFactura();

        Decorator facturaDecorata = new FacturaDecorata(factura);

        facturaDecorata.aplicaDiscount(10);
        facturaDecorata.printeazaFactura();
    }
}