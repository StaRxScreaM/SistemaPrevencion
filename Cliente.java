public class Cliente extends Usuario implements Asesoria {
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {}

    public String getNombres() {
        return getNombre(); // Usa el nombre de Usuario
    }

    public void setNombres(String nombres) {
        setNombre(nombres); // Establece el nombre usando Usuario
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Cliente:");
        super.analizarUsuario();
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Telefono: " + telefono);
        System.out.println("AFP: " + afp);
        System.out.println("Sistema de Salud: " + (sistemaSalud == 1 ? "Fonasa" : "Isapre"));
        System.out.println("Direccion: " + direccion);
        System.out.println("Comuna: " + comuna);
        System.out.println("Edad: " + edad);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }
}
