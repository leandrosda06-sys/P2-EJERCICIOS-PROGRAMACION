public class SensorNivel extends Sensor {
    public SensorNivel(String codigo, double lectura, String unidad) {
        super(codigo, lectura, unidad);
    }
    @Override
    public String interpretarLectura() { return getLectura() < 20 ? "Nivel bajo" : "Nivel suficiente"; }
    @Override
    public String mostrarInformacion() { return super.mostrarInformacion() + ", tipo: SensorNivel, " + interpretarLectura(); }
}
