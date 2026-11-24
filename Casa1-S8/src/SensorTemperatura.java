public class SensorTemperatura extends Sensor {
    public SensorTemperatura(String codigo, double lectura, String unidad) {
        super(codigo, lectura, unidad);
    }
    @Override
    public String interpretarLectura() { return getLectura() > 40 ? "Temperatura alta" : "Temperatura normal"; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: SensorTemperatura, " + interpretarLectura(); }
}
