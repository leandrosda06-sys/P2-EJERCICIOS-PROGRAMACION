public class Componente {
    private String codigo;
    private String tipo;

    public Componente(String codigo, String tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }
    public String getCodigo() { return codigo; }
    public String getTipo() { return tipo; }
    public String mostrarInformacion() { return "codigo: " + codigo + ", " + "tipo: " + tipo; }
}
