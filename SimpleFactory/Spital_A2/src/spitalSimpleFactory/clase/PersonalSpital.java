package spitalSimpleFactory.clase;

public abstract class PersonalSpital {
    private String nume;
    private String email;

    public PersonalSpital(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public abstract void descriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
