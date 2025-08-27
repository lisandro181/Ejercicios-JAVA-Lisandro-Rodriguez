import java.util.Scanner;

class Personaje {
    private String nombre;
    private String poder;
    private String arma;
    private boolean bueno;
    private int vida;
    private int ataque;
    private int ayudar;

    public Personaje(String nombre, String poder, String arma, boolean bueno, int vida, int ataque, int ayudar) {
        this.nombre = nombre;
        this.poder = poder;
        this.arma = arma;
        this.bueno = bueno;
        this.vida = vida;
        this.ataque = ataque;
        this.ayudar = ayudar;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPoder() { return poder; }
    public void setPoder(String poder) { this.poder = poder; }

    public String getArma() { return arma; }
    public void setArma(String arma) { this.arma = arma; }

    public boolean getBueno() { return bueno; }
    public void setBueno(boolean bueno) { this.bueno = bueno; }

    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }

    public int getAtaque() { return ataque; }
    public void setAtaque(int ataque) { this.ataque = ataque; }

    public int getAyudar() { return ayudar; }
    public void setAyudar(int ayudar) { this.ayudar = ayudar; }

    public void mostrarPersonaje() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Poder: " + poder);
        System.out.println("¿Que arma usa?: " + arma);
        System.out.println("¿Es bueno?: " + bueno);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Ayudar " + ayudar);
    }

    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " causando " + ataque + " de daño");
        enemigo.setVida(enemigo.getVida() - this.ataque);
        System.out.println("la vida de " + enemigo.getNombre() + " ahora es " + enemigo.getVida());
    }

    public void heal(Personaje aliado) {
        System.out.println(nombre + " ayuda a " + aliado.getNombre() + " y le da" + ayudar + " de vida");
        aliado.setVida(aliado.getVida() + this.ayudar);
        System.out.println("la vida de " + aliado.getNombre() + " ahora es " + aliado.getVida());
    }
}

class Tanjiro extends Personaje {
    public Tanjiro() {
        super("Tanjiro Kamado", "respiracion del agua", "Katana negra", true, 100, 80, 20);
    }
    @Override
    public void mostrarPersonaje() {
        System.out.println("Soy Tanjiro lucho por proteger a lso demas");
        super.mostrarPersonaje();
    }
}

class Nezuko extends Personaje {
    public Nezuko() {
        super("Nezuko Kamado", "sangre explosiva", "Cuerpo a cuerpo y sangre", true, 120, 90, 10);
    }
    @Override
    public void mostrarPersonaje() {
        System.out.println("Soy Nezuko una demonio");
        super.mostrarPersonaje();
    }
}

class Inosuke extends Personaje {
    public Inosuke() {
        super("Inosuke", "Respiracion de la Bestia", "Katana que parecen colmillos", true, 110, 85, 5);
    }
    @Override
    public void mostrarPersonaje() {
        System.out.println("Soy Inosukey soy el mas fuerte");
        super.mostrarPersonaje();
    }
}

class Tokito extends Personaje {
    public Tokito() {
        super("Tokito Muichiro", "Respiracion de la Niebla", "Katana azul", true, 130, 95, 15);
    }
    @Override
    public void mostrarPersonaje() {
        System.out.println("Soy Tokito el Pilar de la Niebla.");
        super.mostrarPersonaje();
    }
}

public class Kimetsu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona 2 personajes de KNY ");
        System.out.println("1 Tanjiro");
        System.out.println("2 Nezuko");
        System.out.println("3 Inosuke");
        System.out.println("4 Tokito");

        System.out.print("elige el primer personaje: ");
        int p1 = sc.nextInt();
        System.out.print("elige el segundo personaje: ");
        int p2 = sc.nextInt();

        Personaje personaje1 = null, personaje2 = null;

        switch (p1) {
            case 1 -> personaje1 = new Tanjiro();
            case 2 -> personaje1 = new Nezuko();
            case 3 -> personaje1  = new Inosuke();
            case 4 -> personaje1  = new Tokito();
        }

        switch (p2) {
            case 1 -> personaje2 = new Tanjiro();
            case 2 -> personaje2 = new Nezuko();
            case 3 -> personaje2 = new Inosuke();
            case 4 -> personaje2 = new Tokito();
        }

      
        System.out.println("\n personaje 1");
        personaje1.mostrarPersonaje();

        System.out.println("\n personaje 2");
        personaje2.mostrarPersonaje();

        System.out.println("\n pelea");
        personaje1.atacar(personaje2);

        System.out.println("\nDespués del ataque:");
        personaje2.mostrarPersonaje();

        System.out.println("\nAyudando");
        personaje2.heal(personaje2);

        System.out.println("\nDespués de ayudar:");
        personaje2.mostrarPersonaje();

        sc.close();
    }
}