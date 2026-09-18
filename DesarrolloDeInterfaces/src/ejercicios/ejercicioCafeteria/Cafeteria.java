package ejercicios.ejercicioCafeteria;

public class Cafeteria {
    private String nombre;
    private int precio;
    private int distancia;

    public Cafeteria(int distancia, int precio, String nombre) {
        this.distancia = distancia;
        this.precio = precio;
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }


    public int calcularPrecioDistancia(){
        return this.precio * this.distancia;
    }
}
