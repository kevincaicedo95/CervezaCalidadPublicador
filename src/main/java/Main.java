import Componentes.Disparador;
import Componentes.SensorCamara;
import Controlador.FabricaItemMedicion;
import Controlador.LecturaPorEvento;
import Controlador.Publicador;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Disparador trigger = new Disparador();
            boolean activar=trigger.activador();
            if (activar==true){
                SensorCamara sensorCamara = new SensorCamara();
                LecturaPorEvento lecturaPorEvento=new LecturaPorEvento();
                FabricaItemMedicion fabricaItemMedicion = new FabricaItemMedicion();
                ArrayList imagenes=sensorCamara.imagen();
                ArrayList resultados=lecturaPorEvento.capturarInformacion(imagenes);
                String decision=fabricaItemMedicion.procesoCalidad(resultados);
                Publicador publicador = new Publicador();
                publicador.enviarMensaje(decision);
            }
        }
    }
}
