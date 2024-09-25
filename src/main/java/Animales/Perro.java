package Animales;

public class Perro extends Mamifero {
    private String raza;

    public Perro(String nombre, int numeroIdentificativo, int edad, String raza) {
        super(nombre, numeroIdentificativo, edad, 9);
        this.raza = raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPerro{" + "raza='" + raza + '\'' + '}';
    }

    public void emitirSonido(){
        System.out.println( "GUAO GUAO GUAO!!!");
    }
}
