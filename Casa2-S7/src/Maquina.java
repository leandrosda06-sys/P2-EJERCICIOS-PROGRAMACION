import java.util.ArrayList;

public class Maquina {
    private ArrayList<Componente> lista = new ArrayList<>();
    public void crearComponente(String codigo, String tipo) { if (buscarComponente(codigo) == null) lista.add(new Componente(codigo, tipo)); }
    public Componente buscarComponente(String clave) {
        for (Componente objeto : lista) {
            if (objeto.getCodigo().equals(clave)) return objeto;
        }
        return null;
    }
    public boolean eliminarComponente(String clave) { return lista.remove(buscarComponente(clave)); }
    public String mostrarComponentes() {
        String texto = "";
        for (Componente objeto : lista) texto += objeto.mostrarInformacion() + "\n";
        return texto;
    }
    public int contarPorTipo(String tipo) {
        int cantidad = 0;
        for (Componente objeto : lista) if (objeto.getTipo().equals(tipo)) cantidad++;
        return cantidad;
    }

}
