public class Usuario {
    String username;
    String password;
    String rol;
    int intentos;
    String estado;
    public Usuario(String username, String password, String rol, int intentos, String estado) {
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.intentos = intentos;
        this.estado = estado;
    }
}
