package spital.proxy.clase;

public class ProxyCardSanatate implements IInternare{
    private IInternare internare;

    public ProxyCardSanatate(IInternare internare) {
        this.internare = internare;
    }

    @Override
    public void internare(String numePacient, boolean areCardDeSanatate) {
        if (areCardDeSanatate){
            internare.internare(numePacient, areCardDeSanatate);
        } else {
            System.out.println("nu aveti card de sanatate, nu va putem interna.");
        }
    }
}
