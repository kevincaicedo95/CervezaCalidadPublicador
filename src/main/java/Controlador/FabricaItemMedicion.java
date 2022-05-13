package Controlador;

import java.util.ArrayList;

public class FabricaItemMedicion {
    private Double largoOptimo=13.5;
    private Double anchOptimo=7.0;
    private int abolladuraOptima=1;

    public FabricaItemMedicion(){}
    public String procesoCalidad(ArrayList datos) {
        double largo = Double.parseDouble((String) datos.get(0));
        double ancho = Double.parseDouble((String) datos.get(1));
        int abolladura= Integer.parseInt((String) datos.get(2));

        if ((largo<largoOptimo+0.5 || largo>largoOptimo-0.5) && (ancho<anchOptimo+0.5 || ancho>anchOptimo-0.5)
                && (abolladura>abolladuraOptima)){
            return "Correcto";
        }
        else {
            return "Incorrecto";
        }

    }
}
