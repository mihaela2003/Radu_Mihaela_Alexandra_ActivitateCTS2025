package sustinereExamenRegistry.clase;

public class Student {
    private int id;
    private String nume;
    private String email;
    private int an;

    public Student(String email, int id, String nume, int an) {
        this.email = email;
        this.id = id;
        this.nume = nume;
        this.an = an;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public int getAn() {
        return an;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", an=").append(an);
        sb.append('}');
        return sb.toString();
    }
}
