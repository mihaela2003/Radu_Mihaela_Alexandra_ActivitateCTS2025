package hotel.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class CamereLibere {
    private List<Integer> listaCamereLibere;

    public CamereLibere(){
        listaCamereLibere = new ArrayList<>();
        for(int i=0; i<10; i++){
            listaCamereLibere.add(i+1);
        }
    }

    public boolean verificareCameraLiber(int codCamera){
        return listaCamereLibere.contains(codCamera);
    }
}
