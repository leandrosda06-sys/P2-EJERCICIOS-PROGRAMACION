public class Actuador {
    private String codigo;
    private boolean activo;

    public Actuador(String codigo, boolean activo) {
        this.codigo = codigo;
        this.activo = activo;
    }
    public String getCodigo() { return codigo; }
    public boolean isActivo() { return activo; }
    public String mostrarInformacion() { return "codigo: " + codigo + ", " + "activo: " + activo; }
    public double calcularConsumo() { return 0; }
}
