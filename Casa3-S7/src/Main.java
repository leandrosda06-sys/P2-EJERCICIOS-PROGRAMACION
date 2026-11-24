public class Main {
    public static void main(String[] args) {
        Motor a1 = new Motor("M1", 100, true);
        Motor a2 = new Motor("M2", 200, false);
        Motor a3 = new Motor("M3", 300, true);
        Motor a4 = new Motor("M4", 400, false);
        Motor a5 = new Motor("M5", 500, true);
        Planta sistema = new Planta();
        sistema.agregarMotor(a1);
        sistema.agregarMotor(a2);
        sistema.agregarMotor(a3);
        sistema.agregarMotor(a4);
        sistema.agregarMotor(a5);
        System.out.println(sistema.mostrarMotores());
        System.out.println("Potencia: " + sistema.calcularPotenciaTotal());
        System.out.println("Encendidos: " + sistema.contarEncendidos());
        System.out.println(sistema.buscarMotor("M2").mostrarInformacion());
        System.out.println("Busqueda inexistente: " + sistema.buscarMotor("ZZ"));
        System.out.println("Eliminado: " + sistema.retirarMotor("M2"));
        System.out.println("Eliminacion inexistente: " + sistema.retirarMotor("ZZ"));
        System.out.println(sistema.mostrarMotores());

    }
}
