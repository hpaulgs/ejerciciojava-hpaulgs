package Animales;

public class Gato extends Mamifero {
    private String colorPelo;
    private boolean peloLargo;

    public Gato(String nombre, int numeroIdentificativo, int edad, String colorPelo, boolean peloLargo) {
        super(nombre, numeroIdentificativo, edad, 10);
        this.colorPelo = colorPelo;
        this.peloLargo = peloLargo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    @Override
    public String toString() {
        String peloLargo;
        if (this.isPeloLargo()){
            peloLargo = "SI";
        }else{
            peloLargo = "NO";
        }
        return super.toString() + "\nGato{" + "colorPelo='" + colorPelo + '\'' + ", peloLargo=" + peloLargo + '}';
    }

    public void emitirSonido(){
        System.out.println( "MIAU MIAU MIAU!!!");
    }
}