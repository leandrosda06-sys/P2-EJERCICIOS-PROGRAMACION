public class SensorPresion extends Sensor {
    public SensorPresion(String codigo, double lectura, String unidad) {
        super(codigo, lectura, unidad);
    }
    @Override
    public String interpretarLectura() { return getLectura() > 8 ? "Presion alta" : "Presion normal"; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: SensorPresion, " + interpretarLectura(); }
}
