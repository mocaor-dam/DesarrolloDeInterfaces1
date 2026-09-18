package ejercicios.ejercicioThor;

public class Personaje {
    private int altura;
    private int fuerza;

    public Personaje(int altura, int fuerza) {
        this.altura = altura;
        this.fuerza = fuerza;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}
