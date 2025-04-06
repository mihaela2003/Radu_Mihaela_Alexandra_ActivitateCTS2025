package sustinereExamenRegistry.main;

import sustinereExamenRegistry.clase.Student;
import sustinereExamenRegistry.clase.SustinereExamen;

public class Main {
    public static void main(String[] args){
        Student student = new Student("ionel@gmail.com", 1, "Ionel", 2);
        Student student1 = new Student("gigel@gmail.com", 2, "Gigel", 1);
        Student student2 = new Student("maricica@gmail.com", 3, "Maricica", 3);

        SustinereExamen examenCTS = new SustinereExamen("Calitate si testare software");
        examenCTS.reglementeazaExamen(student);
        examenCTS.reglementeazaExamen(student1);
        examenCTS.reglementeazaExamen(student2);

        examenCTS.reglementeazaExamen(student1);
    }
}
