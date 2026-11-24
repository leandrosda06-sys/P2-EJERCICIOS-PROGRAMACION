import java.util.ArrayList;

public class Red {
    private ArrayList<DispositivoRed> lista = new ArrayList<>();
    private String nombre;
    public Red(String nombre) { this.nombre = nombre; }
    public void agregarDispositivo(DispositivoRed objeto) { lista.add(objeto); }
    public DispositivoRed buscarPorIP(String clave) {
        for (DispositivoRed objeto : lista) {
            if (objeto.getDireccionIP().equals(clave)) return objeto;
        }
        return null;
    }
    public boolean eliminarDispositivo(String clave) { return lista.remove(buscarPorIP(clave)); }
    public String mostrarDispositivos() {
        String texto = nombre + "\n";
        for (DispositivoRed objeto : lista) texto += objeto.mostrarInformacion() + "\n";
        return texto;
    }
    public int contarActivos() {
        int cantidad = 0;
        for (DispositivoRed objeto : lista) if (objeto.isActivo()) cantidad++;
        return cantidad;
    }
    public int contarPorTipo(String tipo) {
        int cantidad = 0;
        for (DispositivoRed objeto : lista) if (objeto.getTipo().equals(tipo)) cantidad++;
        return cantidad;
    }

}
