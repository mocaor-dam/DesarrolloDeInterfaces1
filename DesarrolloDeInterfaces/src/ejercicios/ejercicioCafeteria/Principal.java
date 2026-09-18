package ejercicios.ejercicioCafeteria;

import exceptions.MiEntradaSalidaException;
import utils.MiEntradaSalida;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal {
    static void main(String[] args) {
        List<Cafeteria> cafeterias = new ArrayList<>();

        try {
            pedirCafeterias(cafeterias);

        } catch (MiEntradaSalidaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("La mejor cafeteria es: " + calcularMejorCafe(cafeterias));

    }

    public static String calcularMejorCafe(List<Cafeteria> listaCafeterias){

       return listaCafeterias.stream().min(Comparator.comparing(Cafeteria::calcularPrecioDistancia)
               .thenComparingInt(Cafeteria::getPrecio)).get().getNombre();
    }

    public static void pedirCafeterias(List<Cafeteria> listaCafeterias) throws MiEntradaSalidaException {
        int numCafeterias = MiEntradaSalida.leerEnteroRango("Introduce cuantas cafeterias quieres meter", 1, 1000);

        for (int i = 0; i < numCafeterias; i++) {
            int distancia = MiEntradaSalida.leerEnteroRango("Introduce la distancia de la cafeteria: ", 1, 1000);
            int precio = MiEntradaSalida.leerEnteroRango("Introduce el precio de la cafeteria: ", 1, 1000);
            String nombre = MiEntradaSalida.leerLinea("Introduce el nombre de la cafeteria: ");

            Cafeteria cafeteria = new Cafeteria(distancia, precio, nombre);

            listaCafeterias.add(cafeteria);
        }
    }
}
