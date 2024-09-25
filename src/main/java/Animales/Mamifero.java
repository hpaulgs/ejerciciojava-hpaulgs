package Animales;

public class Mamifero extends Animal {
    protected int tiempoGestacion;

    public Mamifero(String nombre, int numeroIdentificativo, int edad, int tiempoGestacion) {
        super(nombre, numeroIdentificativo, edad);
        this.tiempoGestacion = tiempoGestacion;
    }

    public void setTiempoGestacion(int tiempoGestacion) {
        this.tiempoGestacion = tiempoGestacion;
    }

    public int getTiempoGestacion() {
        return tiempoGestacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMamifero{" + "tiempoGestacion=" + tiempoGestacion + '}';
    }
}
