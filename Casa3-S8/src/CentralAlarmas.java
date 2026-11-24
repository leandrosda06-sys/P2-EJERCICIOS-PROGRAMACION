import java.util.ArrayList;

public class CentralAlarmas {
    private ArrayList<Alarma> lista = new ArrayList<>();
    public void agregarAlarma(Alarma objeto) { lista.add(objeto); }
    public String mostrarAlarmas() {
        String texto = "";
        for (Alarma objeto : lista) texto += objeto.mostrarInformacion() + "\n";
        return texto;
    }
    public int contarAlarmasActivadas(double valor) {
        int cantidad = 0;
        for (Alarma alarma : lista) if (alarma.evaluar(valor)) cantidad++;
        return cantidad;
    }
}
