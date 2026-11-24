public class Main {
    public static void main(String[] args) {
        EquipoRed a1 = new Router("R1", "10.0.0.1", true, 12);
        EquipoRed a2 = new Switch("SW1", "10.0.0.2", true, 24);
        EquipoRed a3 = new AccessPoint("AP1", "10.0.0.3", false, 35);
        Red sistema = new Red();
        sistema.agregarEquipo(a1);
        sistema.agregarEquipo(a2);
        sistema.agregarEquipo(a3);
        System.out.println(a1.obtenerFuncion());
        System.out.println(a2.obtenerFuncion());
        System.out.println(a3.obtenerFuncion());
        System.out.println(sistema.mostrarEquipos());
        System.out.println("Activos: " + sistema.contarActivos());
        System.out.println(sistema.buscarPorIP("10.0.0.2").mostrarInformacion());
        System.out.println("Busqueda inexistente: " + sistema.buscarPorIP("ZZ"));

    }
}
