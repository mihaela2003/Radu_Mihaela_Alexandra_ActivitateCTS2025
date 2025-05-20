package restaurant.template.main;

import restaurant.template.clase.Masa;
import restaurant.template.clase.RestaurantLaMare;
import restaurant.template.clase.RestaurantLaMunte;
import restaurant.template.clase.TemplateOcupareMasa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(4);
        TemplateOcupareMasa masaMunte = new RestaurantLaMunte();
        masaMunte.ocupareMasa(masa);

        TemplateOcupareMasa masaMare = new RestaurantLaMare();
        masaMare.ocupareMasa(masa);
    }
}