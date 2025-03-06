package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil {
    private int id;
    private float salariul;
    private float sporVechime;

    public Profesor(String nume, int varsta, int id, float salariu, float sporVechime) {
        super(nume, varsta);
        this.id = id;
        this.salariul = salariu;
        this.sporVechime = sporVechime;
    }

    public int getId() {
        return id;
    }

    public float getSalariul() {
        return salariul;
    }

    public float getSporVechime() {
        return sporVechime;
    }

    public void setSalariul(float salariul) {
        this.salariul = salariul;
    }

    public void setSporVechime(float sporVechime) {
        this.sporVechime = sporVechime;
    }

    @Override
    public float calculareVenit() {
        return salariul+ (salariul*sporVechime);
    }

    @Override
    public void preda() {
        StringBuilder builder = new StringBuilder();
        builder.append("Profesorul ");
        builder.append(this.nume);
        builder.append(" preda la curs.");
        System.out.println(builder.toString());
    }
}
