package banca.decorator.main;

import banca.decorator.clase.Card;
import banca.decorator.clase.CardContactLess;
import banca.decorator.clase.CardSimplu;
import banca.decorator.clase.Decorator;

public class Main {
    public static void main(String[] args) {
        Card card = new CardSimplu("gigel", 1254f);
        card.afiseazaInformatii();

        Decorator cardDecorat = new CardContactLess(card);
        cardDecorat.afiseazaInformatii();
    }
}