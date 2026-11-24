public class Main {
    public static void main(String[] args) {
        Desarrollador a1 = new Desarrollador("D1", "Carlos", "Backend", 25);
        Desarrollador a2 = new Desarrollador("D2", "Daniela", "Frontend", 18);
        Desarrollador a3 = new Desarrollador("D3", "Andres", "Datos", 30);
        Proyecto sistema = new Proyecto("Proyecto de prueba");
        sistema.agregarDesarrollador(a1);
        sistema.agregarDesarrollador(a2);
        sistema.agregarDesarrollador(a3);
        System.out.println(sistema.mostrarEquipo());
        System.out.println("Horas: " + sistema.calcularTotalHoras());
        System.out.println("Mayor carga: " + sistema.obtenerMayorCarga().mostrarInformacion());
        System.out.println(sistema.buscarDesarrollador("D2").mostrarInformacion());
        System.out.println("Busqueda inexistente: " + sistema.buscarDesarrollador("ZZ"));
        System.out.println("Eliminado: " + sistema.eliminarDesarrollador("D2"));
        System.out.println("Eliminacion inexistente: " + sistema.eliminarDesarrollador("ZZ"));
        System.out.println(sistema.mostrarEquipo());

    }
}
