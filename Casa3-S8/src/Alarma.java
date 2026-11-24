public class Alarma {
    private String codigo;
    private double limite;

    public Alarma(String codigo, double limite) {
        this.codigo = codigo;
        this.limite = limite;
    }
    public String getCodigo() { return codigo; }
    public double getLimite() { return limite; }
    public String mostrarInformacion() { return "codigo: " + codigo + ", " + "limite: " + limite; }
    public boolean evaluar(double valor) { return false; }
}
