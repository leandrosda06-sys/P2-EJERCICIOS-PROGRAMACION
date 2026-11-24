public class AlarmaPresion extends Alarma {
    public AlarmaPresion(String codigo, double limite) {
        super(codigo, limite);
    }
    @Override
    public boolean evaluar(double valor) { return valor >= getLimite(); }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: AlarmaPresion"; }
}
