 public class MaquinasMecanicas extends Inventores {

    public MaquinasMecanicas(String nombre, int edad, int Creatividad) {
        super(nombre, edad, Creatividad);
    }

    @Override
    public void mostrarInvento() {
        System.out.println(" Hola soy " + nombre + " y tengo " + edad + " años y presento mi maquina mecanica que es un terreneitor con 4 turbo motores y 2 cohetes ");
    }
}