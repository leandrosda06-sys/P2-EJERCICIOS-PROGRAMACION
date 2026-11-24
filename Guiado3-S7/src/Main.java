public class Main {
    public static void main(String[] args) {
        DispositivoRed a1 = new DispositivoRed("E1", "10.0.0.1", "Router", true);
        DispositivoRed a2 = new DispositivoRed("E2", "10.0.0.2", "Switch", true);
        DispositivoRed a3 = new DispositivoRed("E3", "10.0.0.3", "Switch", false);
        Red sistema = new Red("Proyecto de prueba");
        sistema.agregarDispositivo(a1);
        sistema.agregarDispositivo(a2);
        sistema.agregarDispositivo(a3);
        System.out.println(sistema.mostrarDispositivos());
        System.out.println("Activos: " + sistema.contarActivos());
        System.out.println("Switches: " + sistema.contarPorTipo("Switch"));
        System.out.println(sistema.buscarPorIP("10.0.0.2").mostrarInformacion());
        System.out.println("Busqueda inexistente: " + sistema.buscarPorIP("ZZ"));
        System.out.println("Eliminado: " + sistema.eliminarDispositivo("10.0.0.2"));
        System.out.println("Eliminacion inexistente: " + sistema.eliminarDispositivo("ZZ"));
        System.out.println(sistema.mostrarDispositivos());

    }
}
