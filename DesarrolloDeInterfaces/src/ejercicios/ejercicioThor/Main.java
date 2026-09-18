package ejercicios.ejercicioThor;

import exceptions.MiEntradaSalidaException;
import utils.MiEntradaSalida;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();
        List<Objeto> objetos = new ArrayList<>();

        try {
            pedirPersonaje(personajes);
            pedirObjeto(objetos);
            int distanciaObjetivo = MiEntradaSalida.leerEnteroRango("Introduce la distancia objetivo: ",1,1000);

            System.out.println("Lo han conseguido: " + calcularLanzamiento(personajes, objetos, distanciaObjetivo));;

        } catch (MiEntradaSalidaException e) {
            System.out.println(e.getMessage());
        }




    }


    public static int calcularLanzamiento(List<Personaje> personajes, List<Objeto> objetos, int distanciaObjetivo){
        int contador = 0;

        for (Personaje p : personajes){
            for (Objeto o : objetos){
                if (p.lanzar(o) >= distanciaObjetivo){
                    contador++;
                }
            }
        }
        return contador;

    }

    public static void pedirPersonaje(List<Personaje> listaPersonaje) throws MiEntradaSalidaException {

        int numPersonajes = MiEntradaSalida.leerEnteroRango("Introduce cuantos personajes vas a meter: ", 1, 1000);

        for (int i = 0; i < numPersonajes; i++) {
            System.out.println("----------------------------------------------------");
            int altura = MiEntradaSalida.leerEnteroRango("Introduce la altura: ", 1, 1000);
            int fuerza = MiEntradaSalida.leerEnteroRango("Introduce la fuerza: ", 1, 1000);

            Personaje personaje = new Personaje(altura, fuerza);

            listaPersonaje.add(personaje);
        }


    }


    public static void pedirObjeto(List<Objeto> listaObjetos) throws MiEntradaSalidaException {
        int numObjetos = MiEntradaSalida.leerEnteroRango("Introduce cuantos objetos vas a meter: ", 1, 1000);

        for (int i = 0; i < numObjetos; i++) {
            int peso = MiEntradaSalida.leerEnteroRango("Introduce el peso del objeto: ",1,1000);

            Objeto objeto = new Objeto(peso);

            listaObjetos.add(objeto);
        }

    }
}
