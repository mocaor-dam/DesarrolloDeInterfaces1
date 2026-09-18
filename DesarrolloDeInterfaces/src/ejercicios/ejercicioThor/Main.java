package ejercicios.ejercicioThor;

import exceptions.MiEntradaSalidaException;
import utils.MiEntradaSalida;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<> personajes = new ArrayList<>();
        List<> objetos = new ArrayList<>();

        try {
            pedirPersonaje(personajes);
            pedirObjeto(objetos);

        } catch (MiEntradaSalidaException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int calcularDistancia(int altura, int fuerza,int peso){
        return (altura*fuerza)/peso;
    }


    public static void calcularLanzamiento(List<> personajes, List<> objetos){
        Personaje p = new Personaje();
        Objeto o = new Objeto()

        personajes.stream().filter(calcularDistancia())

    }

    public static void pedirPersonaje(List<> listaPersonaje) throws MiEntradaSalidaException {

        int numPersonajes = MiEntradaSalida.leerEnteroRango("Introduce cuantos personajes vas a meter: ", 1, 1000);

        for (int i = 0; i < numPersonajes; i++) {
            int altura = MiEntradaSalida.leerEnteroRango("Introduce la altura: ", 1, 1000);
            int fuerza = MiEntradaSalida.leerEnteroRango("Introduce la fuerza: ", 1, 1000);

            Personaje personaje = new Personaje(altura, fuerza);

            listaPersonaje.add(personaje);
        }


    }


    public static void pedirObjeto(List<> listaObjetos) throws MiEntradaSalidaException {
        int numObjetos = MiEntradaSalida.leerEnteroRango("Introduce cuantos objetos vas a meter: ", 1, 1000);

        for (int i = 0; i < numObjetos; i++) {
            int peso = MiEntradaSalida.leerEnteroRango("Introduce el peso del objeto: ",1,1000);

            Objeto objeto = new Objeto(peso);

            listaObjetos.add(objeto);
        }

    }
}
