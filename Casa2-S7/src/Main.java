public class Main {
    public static void main(String[] args) {
        Maquina maquina = new Maquina();
        maquina.crearComponente("C1", "Motor");
        maquina.crearComponente("C2", "Sensor");
        maquina.crearComponente("C3", "Sensor");
        maquina.crearComponente("C4", "Valvula");
        maquina.crearComponente("C5", "Motor");
        maquina.crearComponente("C6", "Filtro");
        System.out.println(maquina.mostrarComponentes());
        System.out.println(maquina.buscarComponente("C2").mostrarInformacion());
        System.out.println("Sensores: " + maquina.contarPorTipo("Sensor"));
        System.out.println("Eliminado: " + maquina.eliminarComponente("C2"));
        System.out.println(maquina.mostrarComponentes());
    }
}
