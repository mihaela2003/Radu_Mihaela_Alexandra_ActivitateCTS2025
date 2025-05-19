package restaurant.facade.clase;

public class Facade {
    public String verificareLocMasa(Masa masa){
        Picolo picolo = new Picolo();
        Ospatar ospatar = new Ospatar();

        if (masa.isEsteLibera()){
            if (picolo.verificareMasaDebarasata(masa)){
                if(ospatar.verificareServeteleNoi(masa)){
                    return "puteti lua loc la masa";
                } else {
                    return "asteptati sa punem servetele noi";
                }
            } else {
                return "asteptati sa debarasam masa";
            }
        } else {
            return "masa este ocupata...asteptati sa se elibereze";
        }
    }
}
