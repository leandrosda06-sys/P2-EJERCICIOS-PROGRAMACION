public class Main {
    public static void main(String[] args) {

        Desarrollador d1 = new Desarrollador(
                "D01", "Carlos", "Backend", 25);

        Desarrollador d2 = new Desarrollador(
                "D02", "Daniela", "Frontend", 18);

        Desarrollador d3 = new Desarrollador(
                "D03", "Andres", "Base de datos", 30);

        Proyecto proyecto = new Proyecto("Sistema de inventario");

        System.out.println("Horas iniciales: " +
                proyecto.calcularTotalHoras());

        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);

        System.out.println(proyecto.mostrarEquipo());

        System.out.println("Total de horas: " +
                proyecto.calcularTotalHoras());

        Desarrollador encontrado = proyecto.buscarDesarrollador("D02");

        if (encontrado != null) {
            System.out.println("Encontrado: " +
                    encontrado.mostrarInformacion());
        }

        if (proyecto.buscarDesarrollador("D05") == null) {
            System.out.println("Desarrollador no encontrado");
        }

        System.out.println("Mayor carga: " +
                proyecto.obtenerMayorCarga().mostrarInformacion());

        System.out.println("Eliminado: " +
                proyecto.eliminarDesarrollador("D01"));

        System.out.println(proyecto.mostrarEquipo());

        System.out.println("Horas restantes: " +
                proyecto.calcularTotalHoras());
    }
}