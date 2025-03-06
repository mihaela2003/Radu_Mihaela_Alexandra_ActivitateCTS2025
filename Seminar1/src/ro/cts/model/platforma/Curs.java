package ro.cts.model.platforma;

import ro.cts.model.personal.Persoana;
import ro.cts.model.personal.Student;
import ro.cts.model.personal.IPredabil;

import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite, IPredabil profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public void setProfesor(IPredabil profesor) {
        this.profesor = profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void sustineExamen(String data){
        StringBuilder builder = new StringBuilder();
        builder.append("Profesorul ");
        builder.append(((Persoana)this.profesor).getNume());
        builder.append(" are examen la materia ");
        builder.append(this.numeCurs);
        builder.append(" la data ");
        builder.append(data);
        builder.append(" cu urmatorii studenti: ");
        System.out.println(builder);
        for(Student student : this.studenti){
            System.out.println(student.getNume());
        }

    }
}
