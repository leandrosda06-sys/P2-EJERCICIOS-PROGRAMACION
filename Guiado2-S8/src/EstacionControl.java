import java.util.ArrayList;

public class EstacionControl {
    private ArrayList<Dispositivo> lista = new ArrayList<>();
    public void agregarDispositivo(Dispositivo objeto) { lista.add(objeto); }
    public Dispositivo buscarDispositivo(String clave) {
        for (Dispositivo objeto : lista) {
            if (objeto.getCodigo().equals(clave)) return objeto;
        }
        return null;
    }
    public String mostrarDispositivos() {
        String texto = "";
        for (Dispositivo objeto : lista) texto += objeto.mostrarInformacion() + "\n";
        return texto;
    }
    public int contarActivos() {
        int cantidad = 0;
        for (Dispositivo objeto : lista) if (objeto.isActivo()) cantidad++;
        return cantidad;
    }

}
