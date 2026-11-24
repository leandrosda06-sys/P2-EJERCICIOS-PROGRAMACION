public class AlarmaNivel extends Alarma {
    public AlarmaNivel(String codigo, double limite) {
        super(codigo, limite);
    }
    @Override
    public boolean evaluar(double valor) { return valor < getLimite(); }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: AlarmaNivel"; }
}
