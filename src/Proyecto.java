import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        desarrolladores = new ArrayList<>();
    }

    public void agregarDesarrollador(Desarrollador desarrollador) {
        desarrolladores.add(desarrollador);
    }

    public Desarrollador buscarDesarrollador(String identificacion) {
        for (Desarrollador d : desarrolladores) {
            if (d.getIdentificacion().equals(identificacion)) {
                return d;
            }
        }
        return null;
    }

    public boolean eliminarDesarrollador(String identificacion) {
        Desarrollador d = buscarDesarrollador(identificacion);

        if (d != null) {
            desarrolladores.remove(d);
            return true;
        }

        return false;
    }

    public double calcularTotalHoras() {
        double total = 0;

        for (Desarrollador d : desarrolladores) {
            total += d.getHorasAsignadas();
        }

        return total;
    }

    public String mostrarEquipo() {
        String resultado = "Proyecto: " + nombre + "\n";

        for (Desarrollador d : desarrolladores) {
            resultado += d.mostrarInformacion() + "\n";
        }

        return resultado;
    }

    public Desarrollador obtenerMayorCarga() {
        Desarrollador mayor = null;

        for (Desarrollador d : desarrolladores) {
            if (mayor == null ||
                    d.getHorasAsignadas() > mayor.getHorasAsignadas()) {
                mayor = d;
            }
        }

        return mayor;
    }
}