public class Cliente extends Usuario {
    public Cliente(String username, String correo) {
        super(username, correo);
    }
    @Override
    public String obtenerPermisos() { return "Consultar servicios"; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: Cliente, permisos: " + obtenerPermisos(); }
}
