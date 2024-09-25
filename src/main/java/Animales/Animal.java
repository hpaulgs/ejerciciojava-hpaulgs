package Animales;

public class Animal {
    protected String nombre;
    protected int numeroIdentificativo;
    protected int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroIdentificativo(int numeroIdentificativo) {
        this.numeroIdentificativo = numeroIdentificativo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroIdentificativo() {
        return numeroIdentificativo;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "\nAnimal{" + "nombre='" + nombre + '\'' + ", numeroIdentificativo=" + numeroIdentificativo + ", edad=" + edad + '}';
    }

    public Animal(String nombre, int numeroIdentificativo, int edad) {
        this.nombre = nombre;
        this.numeroIdentificativo = numeroIdentificativo;
        this.edad = edad;
    }

    public void emitirSonido() {
        System.out.println("El animal emite un sonido");
    }
}