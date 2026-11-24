public class EquipoRed {
    private String nombre;
    private String direccionIP;
    private boolean activo;

    public EquipoRed(String nombre, String direccionIP, boolean activo) {
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = activo;
    }
    public String getNombre() { return nombre; }
    public String getDireccionIP() { return direccionIP; }
    public boolean isActivo() { return activo; }
    public String mostrarInformacion() { return "nombre: " + nombre + ", " + "direccionIP: " + direccionIP + ", " + "activo: " + activo; }
    public String obtenerFuncion() { return "General"; }
}
