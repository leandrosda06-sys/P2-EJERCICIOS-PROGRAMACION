public class Main {
    public static void main(String[] args) {
        Sensor s1 = new SensorTemperatura("T1", 45, "C");
        Sensor s2 = new SensorPresion("P1", 5, "bar");
        Sensor s3 = new SensorNivel("N1", 15, "%");
        Sensor[] sensores = {s1, s2, s3};
        for (Sensor s : sensores) {
            System.out.println(s.mostrarInformacion());
            System.out.println(s.interpretarLectura());
        }
    }
}
