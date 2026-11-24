public class Motor extends Actuador {
    private double potencia;
    public Motor(String codigo, boolean activo, double potencia) {
        super(codigo, activo);
        this.potencia = potencia;
    }
    @Override
    public double calcularConsumo() { return isActivo() ? potencia * 1 : 0; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: Motor, potencia: " + potencia + ", consumo estimado: " + calcularConsumo(); }
}
