public class AccessPoint extends EquipoRed {
    private int cantidadClientes;
    public AccessPoint(String nombre, String direccionIP, boolean activo, int cantidadClientes) {
        super(nombre, direccionIP, activo);
        this.cantidadClientes = cantidadClientes;
    }
    @Override
    public String obtenerFuncion() { return "Dar acceso inalambrico"; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", cantidadClientes: " + cantidadClientes + ", funcion: " + obtenerFuncion(); }
}
