package bancaSimpleFactory.clase;

public class BancaFactory {
    private String detinator;
    private float suma;

    public BancaFactory(String detinator, float suma) {
        this.detinator = detinator;
        this.suma = suma;
    }

    public Credit getBanca(TipCredit tipCredit){
        switch (tipCredit){
            case NEVOI_PERSONALE -> {
                return new CreditNevoiPersonale(detinator, suma);
            }
            case IPOTECAR -> {
                return new CreditIpotecar(detinator, suma);
            }
            default -> {
                return null;
            }
        }
    }
}
