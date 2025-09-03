public class ExperimentosQuimicos extends Inventores {
    public ExperimentosQuimicos(String nombre, int edad, int Creatividad) {
        super(nombre, edad, Creatividad);
    }

    @Override
    public void mostrarInvento() {
        System.out.println(" Muy buenos dias me llamo " + nombre + " actualemente tengo " + edad + " años y voy a presentar el proyecto de evitar la tala de arboles que segun lei en un articulo muy largo es muy necesario " );
    }
}
