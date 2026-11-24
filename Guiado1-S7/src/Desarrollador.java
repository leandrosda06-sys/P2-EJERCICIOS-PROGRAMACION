public class Desarrollador {
    private String identificacion;
    private String nombre;
    private String especialidad;
    private double horasAsignadas;

    public Desarrollador(String identificacion, String nombre, String especialidad, double horasAsignadas) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horasAsignadas = horasAsignadas;
    }
    public String getIdentificacion() { return identificacion; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public double getHorasAsignadas() { return horasAsignadas; }
    public String mostrarInformacion() { return "identificacion: " + identificacion + ", " + "nombre: " + nombre + ", " + "especialidad: " + especialidad + ", " + "horasAsignadas: " + horasAsignadas; }
}
