public class Administrador extends Usuario {
    public Administrador(String username, String correo) {
        super(username, correo);
    }
    @Override
    public String obtenerPermisos() { return "Administrar usuarios"; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: Administrador, permisos: " + obtenerPermisos(); }
}
