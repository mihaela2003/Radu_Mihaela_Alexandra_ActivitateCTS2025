package agentie.facade.clase;

public class Facade {
    public void rezervaPachetCazareTransport(String orasPlecare, String orasDestinatie){
        CompanieAeriana companieAeriana = new CompanieAeriana("CTSAirLines");
        Zbor zborDus = companieAeriana.rezervaBiletAvion(orasPlecare,orasDestinatie);
        Zbor zborIntors = companieAeriana.rezervaBiletAvion(orasPlecare,orasDestinatie);

        Hotel hotel = new Hotel("CTS Hotel");
        System.out.println(zborDus.toString());
        System.out.println(zborIntors.toString());
        hotel.rezervaCamera(orasDestinatie);
    }
}
