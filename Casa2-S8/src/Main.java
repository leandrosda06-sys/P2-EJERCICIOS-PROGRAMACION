public class Main {
    public static void main(String[] args) {
        Actuador a1 = new Motor("M1", true, 100);
        Actuador a2 = new Valvula("V1", true, 10);
        Actuador a3 = new Cilindro("C1", true, 60);
        SistemaActuadores sistema = new SistemaActuadores();
        sistema.agregarActuador(a1);
        sistema.agregarActuador(a2);
        sistema.agregarActuador(a3);
        System.out.println(a1.calcularConsumo());
        System.out.println(a2.calcularConsumo());
        System.out.println(a3.calcularConsumo());
        System.out.println(sistema.mostrarActuadores());
        System.out.println("Consumo total estimado: " + sistema.calcularConsumoTotal());

    }
}
