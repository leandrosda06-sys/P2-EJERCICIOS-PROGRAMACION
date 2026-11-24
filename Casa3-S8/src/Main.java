public class Main {
    public static void main(String[] args) {
        Alarma a1 = new AlarmaTemperatura("T1", 50);
        Alarma a2 = new AlarmaPresion("P1", 10);
        Alarma a3 = new AlarmaNivel("N1", 20);
        CentralAlarmas central = new CentralAlarmas();
        central.agregarAlarma(a1);
        central.agregarAlarma(a2);
        central.agregarAlarma(a3);
        System.out.println(central.mostrarAlarmas());
        Alarma[] alarmas = {a1, a2, a3};
        for (Alarma a : alarmas) {
            System.out.println(a.getCodigo() + " con 5: " + a.evaluar(5));
            System.out.println(a.getCodigo() + " con 60: " + a.evaluar(60));
        }
        System.out.println("Activadas con 15: " + central.contarAlarmasActivadas(15));
    }
}
