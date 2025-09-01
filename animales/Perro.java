public class Perro extends Animales implements Mascota {

    
    @Override
    public void maullarOLadrar() {
        System.out.println("El perro ladra");
    }

    @Override
    public void  sonidoAnimal() {
        System.out.println("y dice: es una amiga");
    }

}