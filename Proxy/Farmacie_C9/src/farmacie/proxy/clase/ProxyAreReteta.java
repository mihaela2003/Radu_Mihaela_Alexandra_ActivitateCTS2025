package farmacie.proxy.clase;

public class ProxyAreReteta implements IReteta{
    private IReteta reteta;

    public ProxyAreReteta(IReteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void achizitionareMedicamente(int numarMedicamente, boolean areReteta) {
        if(areReteta){
            reteta.achizitionareMedicamente(numarMedicamente, areReteta);
        } else {
            System.out.println("nu aveti reteta, nu va putem da medicamente");
        }
    }
}
