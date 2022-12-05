package entidad;

public class Usuario {

    private String nombre;
    private String apellido;
    private String mail;
    private String direccion;
    private String clave;
    private String nombreUsuario;
    private long tel;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String mail, String direccion, String clave, String nombreUsuario, long tel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.direccion = direccion;
        this.clave = clave;
        this.nombreUsuario = nombreUsuario;
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", direccion='" + direccion + '\'' +
                ", clave='" + clave + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", tel=" + tel +
                '}';
    }
}