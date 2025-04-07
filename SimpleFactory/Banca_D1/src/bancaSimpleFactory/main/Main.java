package bancaSimpleFactory.main;

import bancaSimpleFactory.clase.BancaFactory;
import bancaSimpleFactory.clase.Credit;
import bancaSimpleFactory.clase.TipCredit;

public class Main {
    public static void main(String[] args) {
        BancaFactory bancaFactory = new BancaFactory("Maricica", 1400);
        Credit creditNevoiPersonale = bancaFactory.getBanca(TipCredit.NEVOI_PERSONALE);
        Credit creditIpotecar = bancaFactory.getBanca(TipCredit.IPOTECAR);

        creditNevoiPersonale.descriere();
        creditIpotecar.descriere();
    }
}