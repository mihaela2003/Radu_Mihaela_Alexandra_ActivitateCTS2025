package hotel.facade.clase;

public class Facade {
    public static boolean verificareCamera(int codCamera){
        CamereLibere libere = new CamereLibere();
        if(libere.verificareCameraLiber(codCamera)){
            Menajera menajera = new Menajera();
            if(menajera.esteCameraCurata(codCamera) && menajera.areProsoapeNoi(codCamera)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static String verificareDisponibilitateCamera(int codCamera){
        CamereLibere libere = new CamereLibere();
        if(libere.verificareCameraLiber(codCamera)){
            Menajera menajera = new Menajera();
            if(menajera.esteCameraCurata(codCamera) && menajera.areProsoapeNoi(codCamera)){
                return "camera este gata";
            } else {
                return "asteptati pana se face curat";
            }
        } else {
            return "asteptati pana se elibereaza";
        }
    }
}
