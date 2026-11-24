import java.util.ArrayList;

public class Planta {
    private ArrayList<Motor> lista = new ArrayList<>();
    public void agregarMotor(Motor objeto) { lista.add(objeto); }
    public Motor buscarMotor(String clave) {
        for (Motor objeto : lista) {
            if (objeto.getCodigo().equals(clave)) return objeto;
        }
        return null;
    }
    public boolean retirarMotor(String clave) { return lista.remove(buscarMotor(clave)); }
    public String mostrarMotores() {
        String texto = "";
        for (Motor objeto : lista) texto += objeto.mostrarInformacion() + "\n";
        return texto;
    }
    public double calcularPotenciaTotal() {
        double total = 0;
        for (Motor objeto : lista) total += objeto.getPotencia();
        return total;
    }
    public int contarEncendidos() {
        int cantidad = 0;
        for (Motor objeto : lista) if (objeto.isEncendido()) cantidad++;
        return cantidad;
    }

}
