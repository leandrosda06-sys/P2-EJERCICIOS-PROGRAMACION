public class Sensor {
    private String codigo;
    private double lectura;
    private String unidad;

    public Sensor(String codigo, double lectura, String unidad) {
        this.codigo = codigo;
        this.lectura = lectura;
        this.unidad = unidad;
    }
    public String getCodigo() { return codigo; }
    public double getLectura() { return lectura; }
    public String getUnidad() { return unidad; }
    public String mostrarInformacion() { return "codigo: " + codigo + ", " + "lectura: " + lectura + ", " + "unidad: " + unidad; }
    public String interpretarLectura() { return "General"; }
}
