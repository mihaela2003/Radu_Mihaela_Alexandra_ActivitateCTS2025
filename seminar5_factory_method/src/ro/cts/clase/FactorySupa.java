package ro.cts.clase;

import static ro.cts.clase.Supe.supaDeCiuperci;
import static ro.cts.clase.Supe.supaDeLegume;

public class FactorySupa implements AbstractFactory{
    private int cantitate;

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch ((Supe)tipFelDeMancare){
            case supaDeLegume -> {
                return new SupaDeLegume(pret, calorii, cantitate);
            }
            case supaDeCiuperci -> {
                return new SupaDeCiuperci(pret, calorii, cantitate);
            }
            default ->{
                return null;
            }
        }
    }
}
