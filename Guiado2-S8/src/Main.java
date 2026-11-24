public class Main {
    public static void main(String[] args) {
        Dispositivo a1 = new Sensor("S1", "Temperatura", true, 25, "C");
        Dispositivo a2 = new Sensor("S2", "Presion", false, 10, "bar");
        Dispositivo a3 = new Actuador("A1", "Motor", true, 50, 100);
        Dispositivo a4 = new Actuador("A2", "Valvula", true, 20, 40);
        EstacionControl sistema = new EstacionControl();
        sistema.agregarDispositivo(a1);
        sistema.agregarDispositivo(a2);
        sistema.agregarDispositivo(a3);
        sistema.agregarDispositivo(a4);
        System.out.println(a1.obtenerEstadoOperacion());
        System.out.println(a2.obtenerEstadoOperacion());
        System.out.println(a3.obtenerEstadoOperacion());
        System.out.println(a4.obtenerEstadoOperacion());
        System.out.println(sistema.mostrarDispositivos());
        System.out.println("Activos: " + sistema.contarActivos());
        System.out.println(sistema.buscarDispositivo("S1").mostrarInformacion());
        System.out.println("Busqueda inexistente: " + sistema.buscarDispositivo("ZZ"));

    }
}
