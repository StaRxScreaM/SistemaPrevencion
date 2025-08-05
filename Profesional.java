public class Profesional extends Usuario implements Asesoria {
    private String titulo;
    private String fechaIngreso;

    public Profesional() {
        super();
    }

    public Profesional(String nombre, String fechaNacimiento, String run, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        setTitulo(titulo);
        setFechaIngreso(fechaIngreso);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && titulo.length() >= 10 && titulo.length() <= 50) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("Título debe tener entre 10 y 50 caracteres.");
        }
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Profesional:");
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "nombre='" + getNombre() + '\'' +
                ", run='" + getRun() + '\'' +
                ", fechaNacimiento='" + getFechaNacimiento() + '\'' +
                ", título='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }
}
