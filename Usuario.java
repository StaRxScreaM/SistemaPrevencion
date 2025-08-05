public abstract class Usuario {
    private String nombre;
    private String fechaNacimiento;
    private String run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, String run) {
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setRun(run);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 5 && nombre.length() <= 30) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: nombre debe tener entre 5 y 30 caracteres.");
        }
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        // Validacion simple de formato
        if (fechaNacimiento.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
            this.fechaNacimiento = fechaNacimiento;
        } else {
            System.out.println("Error: fecha debe tener formato DD/MM/AAAA.");
        }
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        if (run.matches("^\\d{1,8}-[\\dkK]$")) {
            try {
                int numero = Integer.parseInt(run.split("-")[0]);
                if (numero <= 25000000) {
                    this.run = run;
                } else {
                    System.out.println("Error: run no valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: run no valido.");
            }
        } else {
            System.out.println("Error: run debe tener formato sin puntos, con guion y con digito verificador (ej: 18726231-6 o 12345678-K).");
        }
    }

    public void analizarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUN: " + run);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}';
    }
}