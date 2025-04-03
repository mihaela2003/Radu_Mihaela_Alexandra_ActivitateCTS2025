package ro.cts.program;

import ro.cts.clase.PachetCazare;
import ro.cts.clase.PachetMasinaInchiriata;
import ro.cts.clase.PachetTuristic;
import ro.cts.inchirieremasini.Masina;
import ro.cts.inchirieremasini.MasinaInchiriata;

public class Main {
    private static void printeazaRezervare(PachetTuristic pachetTuristic) {
        System.out.print("Pentru client: ");
        pachetTuristic.descriere();
        System.out.print("Pentru Operator: ");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        printeazaRezervare(pachetCazare);

        System.out.println();
        System.out.println("Se doreste utilizarea librariei pentru masini inchiriate");

        System.out.println();
        System.out.println("Utilizarea in modul clasic: ");
        Masina masina = new Masina("Opel", 1300);
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);

        System.out.println();
        System.out.println("Nu se foloseste metoda de printare");
        System.out.println("Pentru clienti: ");
        System.out.println(masinaInchiriata.toString());
        System.out.println("Pentru operator: ");
        masinaInchiriata.inchiriazaMasina();

        System.out.println();
        System.out.println("Se utilizeaza adapterul");
        Masina masina1 = new Masina("Renault", 1400);
        MasinaInchiriata masinaInchiriata1 = new MasinaInchiriata(masina1);
        PachetTuristic pachetMasinaInchiriata = new PachetMasinaInchiriata(masinaInchiriata1);
        System.out.println();
        System.out.println("Se foloseste metoda de printare");
        printeazaRezervare(pachetMasinaInchiriata);
    }
}