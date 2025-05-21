package restaurant.adapterDeObiecte.main;

import restaurant.adapterDeObiecte.clase.AdapterFactura;
import restaurant.adapterDeObiecte.clase.FacturaBar;
import restaurant.adapterDeObiecte.clase.FacturaBucatarie;

public class Main {

    public static void facturaAdaptata(FacturaBar facturaBar){
        System.out.println(facturaBar.toString());
    }

    public static void main(String[] args) {
        FacturaBar facturaBar = new FacturaBar("21.24.5422", 14f, 2);
        facturaAdaptata(facturaBar);

        FacturaBucatarie facturaBucatarie = new FacturaBucatarie(3,14f);
        AdapterFactura adapterFactura = new AdapterFactura(facturaBucatarie);
        facturaAdaptata(adapterFactura);
    }
}