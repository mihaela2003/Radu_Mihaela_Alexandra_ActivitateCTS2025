package serviceAuto.SimpleFactory.factory;

import serviceAuto.SimpleFactory.clase.MasinaSEDAN;
import serviceAuto.SimpleFactory.clase.MasinaSUV;
import serviceAuto.SimpleFactory.clase.MasinaVAN;
import serviceAuto.Singleton.AMasina;

public class FactoryAMasina {
    public AMasina creareMasina(TipMasina tipMasina, String marca, String model, String nrInmatriculare, int anFabricatie){
        switch (tipMasina){
            case SUV -> {
                return new MasinaSUV(marca, model, nrInmatriculare, anFabricatie);
            }
            case VAN -> {
                return new MasinaVAN(marca, model, nrInmatriculare, anFabricatie);
            }
            case SEDAN -> {
                return new MasinaSEDAN(marca, model, nrInmatriculare, anFabricatie);
            }
            default -> {
                return null;
            }
        }
    }
}
