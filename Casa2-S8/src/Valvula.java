public class Valvula extends Actuador {
    private double caudal;
    public Valvula(String codigo, boolean activo, double caudal) {
        super(codigo, activo);
        this.caudal = caudal;
    }
    @Override
    public double calcularConsumo() { return isActivo() ? caudal * 2 : 0; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: Valvula, caudal: " + caudal + ", consumo estimado: " + calcularConsumo(); }
}
