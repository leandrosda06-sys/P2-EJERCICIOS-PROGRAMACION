public class Switch extends EquipoRed {
    private int cantidadPuertos;
    public Switch(String nombre, String direccionIP, boolean activo, int cantidadPuertos) {
        super(nombre, direccionIP, activo);
        this.cantidadPuertos = cantidadPuertos;
    }
    @Override
    public String obtenerFuncion() { return "Conectar equipos locales"; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", cantidadPuertos: " + cantidadPuertos + ", funcion: " + obtenerFuncion(); }
}
