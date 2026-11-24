public class Main {
    public static void main(String[] args) {
        Usuario a1 = new Administrador("admin1", "admin@demo.com");
        Usuario a2 = new Desarrollador("dev1", "dev@demo.com");
        Usuario a3 = new Cliente("cliente1", "cliente@demo.com");
        SistemaUsuarios sistema = new SistemaUsuarios();
        sistema.agregarUsuario(a1);
        sistema.agregarUsuario(a2);
        sistema.agregarUsuario(a3);
        System.out.println(a1.obtenerPermisos());
        System.out.println(a2.obtenerPermisos());
        System.out.println(a3.obtenerPermisos());
        System.out.println(sistema.mostrarUsuarios());
        System.out.println(sistema.buscarUsuario("dev1").mostrarInformacion());
        System.out.println("Busqueda inexistente: " + sistema.buscarUsuario("ZZ"));
        System.out.println("Eliminado: " + sistema.eliminarUsuario("dev1"));
        System.out.println("Eliminacion inexistente: " + sistema.eliminarUsuario("ZZ"));
        System.out.println(sistema.mostrarUsuarios());

    }
}
