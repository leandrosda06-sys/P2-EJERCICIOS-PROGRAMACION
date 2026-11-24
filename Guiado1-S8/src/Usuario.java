public class Usuario {
    private String username;
    private String correo;

    public Usuario(String username, String correo) {
        this.username = username;
        this.correo = correo;
    }
    public String getUsername() { return username; }
    public String getCorreo() { return correo; }
    public String mostrarInformacion() { return "username: " + username + ", " + "correo: " + correo; }
    public String obtenerPermisos() { return "General"; }
}
