public abstract class Inventores {
    public String nombre;
    public int edad;
    private int Creatividad; 

    public Inventores(String nombre, int edad, int Creatividad) {
        this.nombre = nombre;
        this.edad = edad;
        this.Creatividad = Creatividad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCreatividad() {
        return Creatividad;
    }

    public void otorgarPuntosCreatividad(int puntos) {
        if (puntos > 0) {
            this.Creatividad += puntos;
        }
    }
    public abstract void mostrarInvento();
}
