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


        int cantidadNumeros = 0;

        try {

            cantidadNumeros = MiEntradaSalida.leerEnteroRango("Introduce la cantidad de numeros que quieras pasar a morse: ", 1, 1000);
        } catch (MiEntradaSalidaException e) {
            System.out.println(e.getMessage());
        }


        for (int i = 0; i < cantidadNumeros; i++) {
            String texto = MiEntradaSalida.leerLinea("Introduce tu numero: ");
            int numPuntos = 0;
            int numLineas = 0;

            for (int j = 0; j < texto.length(); j++) {
                char c = texto.charAt(j);
                // Obtener el valor numérico del caracter (por ejemplo: '3' -> 3)
                int digito = c - '0';

                String representacion = morse[digito];

                for (int k = 0; k < representacion.length(); k++) {
                    char simbolo = representacion.charAt(k);
                    if (simbolo == '.') {
                        numPuntos++;
                    } else if (simbolo == '-') {
                        numLineas++;
                    }
                }

            }
            System.out.println(numPuntos + " " + numLineas);
        }


    }


}