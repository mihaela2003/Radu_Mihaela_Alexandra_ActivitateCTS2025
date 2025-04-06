package sustinereExamenRegistry.clase;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private String denumire;
    private Map<Integer, Student> map = new HashMap<>();
    private static SustinereExamen instance = null;

    public static SustinereExamen getInstance(String denumire){
        if (instance == null) {
            instance = new SustinereExamen(denumire);
        }
        return instance;
    }

    public SustinereExamen(String denumire) {
        this.denumire = denumire;
    }

    public void reglementeazaExamen(Student student){
        if(!map.containsKey(student.getId())) {
            System.out.println("Studentul " + student.getNume() + " a sustinut examenul deja!");
        }
        else {
            map.put(student.getId(), student);
            System.out.println("Studentul  " + student.getNume() + " sustine acum examenul");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SustinereExamen{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
