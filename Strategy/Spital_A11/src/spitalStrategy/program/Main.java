package spitalStrategy.program;

import spitalStrategy.clase.Card;
import spitalStrategy.clase.Cash;
import spitalStrategy.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gigel", new Card());
        pacient.plateste(1234);
        pacient.setModPlata(new Cash());
        pacient.plateste(231);
    }
}