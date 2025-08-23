
class Vehiculo {

    private String marca;
    private int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo marca: " + marca + ", velocidad: " + velocidad + " km/h");
    }

    public void acelerar() {
        System.out.println("El vehículo acelera suavemente...");
    }
}

class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, int velocidad, int puertas) {
        super(marca, velocidad);
        this.puertas = puertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto marca: " + getMarca() + ", velocidad: " + getVelocidad() + " km/h, puertas: " + puertas);
    }

    @Override
    public void acelerar() {
        System.out.println("El auto acelera aumentando 20 km/h 🚗💨");
        setVelocidad(getVelocidad() + 20);
    }
}

class Moto extends Vehiculo {
    private boolean tieneCasco;

    public Moto(String marca, int velocidad, boolean tieneCasco) {
        super(marca, velocidad);
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moto marca: " + getMarca() + ", velocidad: " + getVelocidad() + " km/h, casco: " + (tieneCasco ? "Sí" : "No"));
    }

    @Override
    public void acelerar() {
        System.out.println("La moto acelera aumentando 30 km/h 🏍💨");
        setVelocidad(getVelocidad() + 30);
    }
}

public class sistema_vehiculo {
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("Genérico", 50);

        Auto a1 = new Auto("Toyota", 80, 4);
        Moto m1 = new Moto("Yamaha", 60, true);

        Vehiculo[] vehiculos = { v1, a1, m1 };

        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            v.acelerar();
            System.out.println("Nueva velocidad: " + v.getVelocidad() + " km/h\n");
        }
    }
}