package restaurantComposite.main;

import restaurantComposite.clase.Item;
import restaurantComposite.clase.Meniu;
import restaurantComposite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Meniu startere = new Sectiune("Startere");
        Meniu bauturi = new Sectiune("bauturi");
        Meniu desert = new Sectiune("Desert");

        Meniu sucuri = new Sectiune("Sucuri");
        Meniu cafea = new Sectiune("Cafea");
        Meniu apa = new Sectiune("Apa");

        Meniu bruschete = new Item("Bruschete");
        startere.adaugaSectiune(bruschete);

        Meniu cola = new Item("Cola");
        Meniu fanta = new Item("Fanta");
        sucuri.adaugaSectiune(cola);
        sucuri.adaugaSectiune(fanta);

        Meniu espresso = new Item("Espresso");
        Meniu americano = new Item("Americano");
        Meniu cappuccino = new Item("Cappuccino");
        cafea.adaugaSectiune(espresso);
        cafea.adaugaSectiune(americano);
        cafea.adaugaSectiune(cappuccino);

        Meniu apaPlata = new Item("Apa plata");
        Meniu apaMinerala = new Item("Apa minerala");
        apa.adaugaSectiune(apaMinerala);
        apa.adaugaSectiune(apaPlata);

        bauturi.adaugaSectiune(sucuri);
        bauturi.adaugaSectiune(cafea);
        bauturi.adaugaSectiune(apa);

        Meniu cheesecake = new Item("Cheesecake");
        Meniu tiramisu = new Item("Tiramisu");
        desert.adaugaSectiune(cheesecake);
        desert.adaugaSectiune(tiramisu);

        desert.descriere();
        bauturi.descriere();
        startere.descriere();
    }
}