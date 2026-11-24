public class Router extends EquipoRed {
    private int cantidadRutas;
    public Router(String nombre, String direccionIP, boolean activo, int cantidadRutas) {
        super(nombre, direccionIP, activo);
        this.cantidadRutas = cantidadRutas;
    }
    @Override
    public String obtenerFuncion() { return "Enrutar paquetes"; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", cantidadRutas: " + cantidadRutas + ", funcion: " + obtenerFuncion(); }
}
