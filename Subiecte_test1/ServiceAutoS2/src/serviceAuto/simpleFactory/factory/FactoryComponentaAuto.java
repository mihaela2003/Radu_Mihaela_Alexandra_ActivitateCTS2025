package serviceAuto.simpleFactory.factory;

import serviceAuto.simpleFactory.clase.*;

public class FactoryComponentaAuto {
    public IComponenta creazaComponenta(TipComponenta tipComponenta, String detaliu){
        switch (tipComponenta){
            case USA -> {
                return new Usa(detaliu);
            }
            case CAPOTA -> {
                return new Capota(detaliu);
            }
            case BARA -> {
                return new Bara(detaliu);
            }
            case PORTBAGAJ -> {
                return new Portbagaj(detaliu);
            }
            default -> {
                return null;
            }
        }
    }
}
