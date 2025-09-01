public class Gato extends Animales implements Mascota {

    @Override
    public void maullarOLadrar() {
        System.out.println("El gato maulla");
    }

    @Override
    public void sonidoAnimal() {
        System.out.println("y el gato hace : Nya");
    }


}