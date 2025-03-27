package ro.cts.clase;

import static ro.cts.clase.Deserturi.papanasi;
import static ro.cts.clase.Deserturi.tiramisu;

public class FactoryDeserturi implements AbstractFactory{
    private String crema;

    public FactoryDeserturi(String crema) {
        this.crema = crema;
    }


    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch ((Deserturi)tipFelDeMancare){
            case tiramisu -> {
                return new Tiramisu(pret, calorii, crema);
            }
            case papanasi -> {
                return new Papanasi(pret, calorii, crema);
            }
            default ->{
                return null;
            }
        }
    }
}
