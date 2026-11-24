import java.util.ArrayList;

public class Red {
    private ArrayList<EquipoRed> lista = new ArrayList<>();
    public void agregarEquipo(EquipoRed objeto) { lista.add(objeto); }
    public EquipoRed buscarPorIP(String clave) {
        for (EquipoRed objeto : lista) {
            if (objeto.getDireccionIP().equals(clave)) return objeto;
        }
        return null;
    }
    public String mostrarEquipos() {
        String texto = "";
        for (EquipoRed objeto : lista) texto += objeto.mostrarInformacion() + "\n";
        return texto;
    }
    public int contarActivos() {
        int cantidad = 0;
        for (EquipoRed objeto : lista) if (objeto.isActivo()) cantidad++;
        return cantidad;
    }

}
