import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Pet = new Scanner(System.in);
        Animales animal;
        Mascota mascota;

        System.out.println("Elige un animal (gato o perro): ");
        String opcion = Pet.nextLine();

        if (opcion.equalsIgnoreCase("gato")) {
            animal = new Gato();
            mascota = (Mascota) animal;
        } else if (opcion.equalsIgnoreCase("perro")) {
            animal = new Perro();
            mascota = (Mascota) animal;
        } else {
            System.out.println("Opcion no valida");
            Pet.close();
            return;
        }

        mascota.maullarOLadrar();
        animal.sonidoAnimal();
        Pet.close();
    }
}
