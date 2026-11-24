import java.util.ArrayList;

public class SistemaActuadores {
    private ArrayList<Actuador> lista = new ArrayList<>();
    public void agregarActuador(Actuador objeto) { lista.add(objeto); }
    public String mostrarActuadores() {
        String texto = "";
        for (Actuador objeto : lista) texto += objeto.mostrarInformacion() + "\n";
        return texto;
    }
    public double calcularConsumoTotal() {
        double total = 0;
        for (Actuador objeto : lista) total += objeto.calcularConsumo();
        return total;
    }

}
