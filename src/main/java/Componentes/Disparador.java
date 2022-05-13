package Componentes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Disparador {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public Disparador(){};
    public boolean activador() {
        String input = "";
        boolean lata = false;
        try {
            System.out.println("Esperando lata...");
            input = br.readLine();
            if (input.equals("lata")) {
                System.out.println("medir lata");
                lata = true;
                return lata;
            }
        } catch (IOException e) {
            lata = false;
        }
        return lata;
    }
}
