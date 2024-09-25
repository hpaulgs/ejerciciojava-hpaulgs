package Principal;

import Animales.Animal;
import Animales.Mamifero;
import Animales.Perro;
import Animales.Gato;

public class Main {
    //Tests automatizados
    //Ejecutar cada vez que se cambie algún método relacionado
    public static void testClaseAnimal() {
        Animal animalZoo = new Animal("Alex", 123456, 10);
        System.out.println(animalZoo);
        animalZoo.emitirSonido();
        animalZoo.setNombre("Martin");
        animalZoo.setEdad(8);
        animalZoo.setNumeroIdentificativo(654321);
        System.out.print(animalZoo);
        System.out.println("\n" + animalZoo.getNombre() + " tiene " + animalZoo.getEdad() + " años y su número identificativo es " + animalZoo.getNumeroIdentificativo());
    }

    public static void testClaseMamifero() {
        Mamifero iceAge = new Mamifero("Sid", 987654, 5, 24);
        System.out.println(iceAge);
        iceAge.setEdad(16);
        iceAge.setTiempoGestacion(95);
        iceAge.setNombre("Manny");
        iceAge.setNumeroIdentificativo(192837);
        System.out.print(iceAge);
        System.out.println("\n" +iceAge.getNombre() + " es un mamut con " + iceAge.getEdad() + " años y su periodo de gestación dura " + iceAge.getTiempoGestacion() + " semanas. Número identificatico es " + iceAge.getNumeroIdentificativo());
    }

    public static void testClasePerro() {
        Perro perroDomestico = new Perro("Archi", 564738, 7, "Mezcla");
        System.out.println(perroDomestico);
        perroDomestico.emitirSonido();
        perroDomestico.setNombre("Hachiko");
        perroDomestico.setNumeroIdentificativo(105629);
        perroDomestico.setEdad(15);
        perroDomestico.setRaza("Akito");
        System.out.print(perroDomestico);
        System.out.println("\n" + perroDomestico.getNombre() + " es un perro de raza " + perroDomestico.getRaza() + " con " + perroDomestico.getEdad() + " años y su periodo de gestación dura " + perroDomestico.getTiempoGestacion() + " semanas. Número identificatico es " + perroDomestico.getNumeroIdentificativo());
        perroDomestico.emitirSonido();
    }

    public static void testClaseGato() {
        String longitudPelo;
        Gato gatoDomestico = new Gato("Gussi", 394810, 14, "Blanco", true);
        System.out.println(gatoDomestico);
        gatoDomestico.emitirSonido();
        gatoDomestico.setNombre("Wilson");
        gatoDomestico.setNumeroIdentificativo(123789);
        gatoDomestico.setEdad(13);
        gatoDomestico.setColorPelo("Naranja");
        gatoDomestico.setPeloLargo(false);
        if (gatoDomestico.isPeloLargo()){
            longitudPelo = "largo";
        }else{
            longitudPelo = "corto";
        }
        System.out.print(gatoDomestico);
        System.out.println("\n" + gatoDomestico.getNombre() + " es un gato con " + gatoDomestico.getEdad() + " años y su periodo de gestación dura " + gatoDomestico.getTiempoGestacion() + " semanas. Número identificatico es " + gatoDomestico.getNumeroIdentificativo() + ". Tiene el pelo " + longitudPelo + " y es de color " + gatoDomestico.getColorPelo());
        gatoDomestico.emitirSonido();
    }

    public static void main(String[] args) {
        testClaseAnimal();
        testClaseMamifero();
        testClasePerro();
        testClaseGato();
    }
}