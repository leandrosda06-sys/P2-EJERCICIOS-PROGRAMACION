public class Motor {
    private String codigo;
    private double potencia;
    private boolean encendido;

    public Motor(String codigo, double potencia, boolean encendido) {
        this.codigo = codigo;
        this.potencia = potencia;
        this.encendido = encendido;
    }
    public String getCodigo() { return codigo; }
    public double getPotencia() { return potencia; }
    public boolean isEncendido() { return encendido; }
    public String mostrarInformacion() { return "codigo: " + codigo + ", " + "potencia: " + potencia + ", " + "encendido: " + encendido; }
}
