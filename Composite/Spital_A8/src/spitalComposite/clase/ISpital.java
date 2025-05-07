package spitalComposite.clase;

public interface ISpital {
    void adaugaDepartament(ISpital departament);
    void stergeDepartament(ISpital departament);
    ISpital getDepartament(int index);
    void descriere();
}
