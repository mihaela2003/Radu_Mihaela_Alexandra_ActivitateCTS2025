package restaurant.template.clase;

public class RestaurantLaMare extends TemplateOcupareMasa{

    @Override
    void masaCurata(Masa masa) {
        System.out.println("masa este curata");
    }

    @Override
    void serveteleSchimbate(Masa masa) {
        System.out.println("servetele au fost puse");
    }

    @Override
    void tacamuriAsezate(Masa masa) {
        System.out.println("tacamurile au fost asezate");
    }

    @Override
    void persoaneInvitate(Masa masa) {
        System.out.println("va invitam sa luati loc la masa");
    }
}
