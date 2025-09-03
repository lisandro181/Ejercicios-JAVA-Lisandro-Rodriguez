public class Main {
    public static void main(String[] args) {
        java.util.List<Inventores> inventores = new java.util.ArrayList<>();


        inventores.add(new MaquinasMecanicas("Caballerito", 25, 100));

        inventores.add(new ProgramaSoftware("Hornet", 19, 90));
        
        inventores.add(new ExperimentosQuimicos("Destello", 40, 99));

        inventores.get(0).otorgarPuntosCreatividad(10); 

        inventores.get(1).otorgarPuntosCreatividad(20); 

        inventores.get(2).otorgarPuntosCreatividad(1); 

        System.out.println(" Presentación de los inventores ");
        for (Inventores inv : inventores) {
            inv.mostrarInvento();
        }
    }
}
