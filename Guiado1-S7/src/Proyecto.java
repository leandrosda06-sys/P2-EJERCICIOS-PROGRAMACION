import java.util.ArrayList;

public class Proyecto {
    private ArrayList<Desarrollador> lista = new ArrayList<>();
    private String nombre;
    public Proyecto(String nombre) { this.nombre = nombre; }
    public void agregarDesarrollador(Desarrollador objeto) { lista.add(objeto); }
    public Desarrollador buscarDesarrollador(String clave) {
        for (Desarrollador objeto : lista) {
            if (objeto.getIdentificacion().equals(clave)) return objeto;
        }
        return null;
    }
    public boolean eliminarDesarrollador(String clave) { return lista.remove(buscarDesarrollador(clave)); }
    public String mostrarEquipo() {
        String texto = nombre + "\n";
        for (Desarrollador objeto : lista) texto += objeto.mostrarInformacion() + "\n";
        return texto;
    }
    public double calcularTotalHoras() {
        double total = 0;
        for (Desarrollador objeto : lista) total += objeto.getHorasAsignadas();
        return total;
    }
    public Desarrollador obtenerMayorCarga() {
        Desarrollador mayor = null;
        for (Desarrollador objeto : lista) if (mayor == null || objeto.getHorasAsignadas() > mayor.getHorasAsignadas()) mayor = objeto;
        return mayor;
    }

}
