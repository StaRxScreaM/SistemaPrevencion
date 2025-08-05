public class Administrativo extends Usuario implements Asesoria {
    private String area;
    private String experienciaPrevia;

    public Administrativo() {
        super();
    }

    public Administrativo(String nombre, String fechaNacimiento, String run, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, run);
        setArea(area);
        setExperienciaPrevia(experienciaPrevia);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if (area != null && area.length() >= 5 && area.length() <= 20) {
            this.area = area;
        } else {
            throw new IllegalArgumentException("Área debe tener entre 5 y 20 caracteres.");
        }
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        if (experienciaPrevia != null && experienciaPrevia.length() <= 100) {
            this.experienciaPrevia = experienciaPrevia;
        } else {
            throw new IllegalArgumentException("Experiencia previa no puede superar 100 caracteres.");
        }
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Administrativo:");
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "nombre='" + getNombre() + '\'' +
                ", run='" + getRun() + '\'' +
                ", fechaNacimiento='" + getFechaNacimiento() + '\'' +
                ", área='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }
}
