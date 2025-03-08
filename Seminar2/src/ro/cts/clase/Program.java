package ro.cts.clase;

import ro.cts.readere.AngajatiReader;
import ro.cts.readere.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;
//TODO denumiri, la readere sa nu mai folosim variabile auxiliare, functia statut de imbunatatit din clasa abstracta Aplicant, la sf dupa ce facem toate modificarile putem sterge tot ce nu este folosit getteri si setteri
public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new AngajatiReader();
		try {
			listaAplicanti = aplicantReader.readAplicanti("angajati.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
