package Componentes;

import java.awt.*;
import java.util.ArrayList;

public class SensorCamara {

    public SensorCamara(){
    }
    public ArrayList imagen() throws InterruptedException {
        double largo;
        double ancho;
        int abolladuraInt;
        boolean abolladura;
        ArrayList<String> listaimagen = new ArrayList<>();
        for (int i=0;i<5;i++){
            System.out.println("Foto");
            largo= (Math.random()*(16-11)) + 12;
            ancho= (Math.random()*(9-5)) + 5;
            abolladuraInt = (int) ((Math.random()*(2-0)) + 0);
            listaimagen.add(String.valueOf(largo));
            listaimagen.add(String.valueOf(ancho));
            listaimagen.add(String.valueOf(abolladuraInt));
            Thread.sleep(90);
        }
        return listaimagen;
    }
}
