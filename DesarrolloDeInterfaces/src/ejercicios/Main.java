package ejercicios;

import exceptions.MiEntradaSalidaException;
import utils.MiEntradaSalida;

public class Main {


    public final int MIN = 1;
    public final int MAX = 1000;

    static void main(String[] args) {

        String[] morse = {
                "-----",
                ".----",
                "..---",
                "...--",
                "....-",
                ".....",
                "-....",
                "--...",
                "---..",
                "----."
        };


        int numPuntos = 0;
        int numLineas = 0;

        try {

            int cantidadNumeros  = MiEntradaSalida.leerEnteroRango("Introduce la cantidad de numeros que quieras pasar a morse: ", 1, 1000);
        } catch (MiEntradaSalidaException e){
            System.out.println(e.getMessage());
        }


            for (int i = 0; i < num; i++) {
                int num = MiEntradaSalida.leerEntero("Introduce tu numero: ");
                for (int j = 0; j < morse.length; j++) {
                    switch (morse.(j)){

                    }

            }
        }
    }



}