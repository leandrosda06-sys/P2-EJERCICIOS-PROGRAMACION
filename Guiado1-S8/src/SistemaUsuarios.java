import java.util.ArrayList;

public class SistemaUsuarios {
    private ArrayList<Usuario> lista = new ArrayList<>();
    public void agregarUsuario(Usuario objeto) { lista.add(objeto); }
    public Usuario buscarUsuario(String clave) {
        for (Usuario objeto : lista) {
            if (objeto.getUsername().equals(clave)) return objeto;
        }
        return null;
    }
    public boolean eliminarUsuario(String clave) { return lista.remove(buscarUsuario(clave)); }
    public String mostrarUsuarios() {
        String texto = "";
        for (Usuario objeto : lista) texto += objeto.mostrarInformacion() + "\n";
        return texto;
    }

}
