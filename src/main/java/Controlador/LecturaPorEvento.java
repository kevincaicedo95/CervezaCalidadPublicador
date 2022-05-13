package Controlador;

import java.util.ArrayList;

public class LecturaPorEvento {
    public LecturaPorEvento(){};
    public ArrayList capturarInformacion(ArrayList imagenes){
        double promLargo;
        double promAncho;
        int promAbolladura;
        ArrayList resultado = new ArrayList<>();
        promLargo=((Double.parseDouble((String) imagenes.get(0))+Double.parseDouble((String) imagenes.get(3))+
                Double.parseDouble((String) imagenes.get(6))+Double.parseDouble((String) imagenes.get(9))+Double.parseDouble((String) imagenes.get(12)))/5);
        promAncho=((Double.parseDouble((String) imagenes.get(1))+Double.parseDouble((String) imagenes.get(4))+
                Double.parseDouble((String) imagenes.get(7))+Double.parseDouble((String) imagenes.get(10))+Double.parseDouble((String) imagenes.get(13)))/5);
        promAbolladura=(Integer.parseInt((String) imagenes.get(2))+Integer.parseInt((String) imagenes.get(5))+
                Integer.parseInt((String) imagenes.get(8))+Integer.parseInt((String) imagenes.get(11))+Integer.parseInt((String) imagenes.get(14)));
        resultado.add(String.valueOf(promLargo));
        resultado.add(String.valueOf(promAncho));
        resultado.add(String.valueOf(promAbolladura));
        return resultado;
    }
}
