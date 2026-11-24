public class Cilindro extends Actuador {
    private double fuerza;
    public Cilindro(String codigo, boolean activo, double fuerza) {
        super(codigo, activo);
        this.fuerza = fuerza;
    }
    @Override
    public double calcularConsumo() { return isActivo() ? fuerza * 0.5 : 0; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: Cilindro, fuerza: " + fuerza + ", consumo estimado: " + calcularConsumo(); }
}
