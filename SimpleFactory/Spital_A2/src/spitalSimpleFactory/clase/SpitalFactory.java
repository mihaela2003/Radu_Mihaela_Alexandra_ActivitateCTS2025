package spitalSimpleFactory.clase;

public class SpitalFactory {
    private String nume;
    private String email;

    public SpitalFactory(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public PersonalSpital getSpital(TipPersonal tipPersonal){
        switch (tipPersonal){
            case BRANCARDIER -> {
                return new Brancardier(nume, email);
            }
            case ASISTENT -> {
                return new Asistent(nume, email);
            }
            case MEDIC -> {
                return new Medic(nume, email);
            }
            default -> {
                return null;
            }
        }
    }
}
