public class Desarrollador extends Usuario {
    public Desarrollador(String username, String correo) {
        super(username, correo);
    }
    @Override
    public String obtenerPermisos() { return "Modificar codigo"; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: Desarrollador, permisos: " + obtenerPermisos(); }
}
