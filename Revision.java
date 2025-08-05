public class Revision {
    private int idRevision;
    private int idVisitaTerreno;
    private String nombreRevision;
    private String detalle;
    private int estado;

    // Constructor vacío
    public Revision() {
    }

    // Constructor con todos los atributos
    public Revision(int idRevision, int idVisitaTerreno, String nombreRevision, String detalle, int estado) {
        this.idRevision = idRevision;
        this.idVisitaTerreno = idVisitaTerreno;
        setNombreRevision(nombreRevision);
        setDetalle(detalle);
        setEstado(estado);
    }

    // Getters y Setters con validaciones
    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public int getIdVisitaTerreno() {
        return idVisitaTerreno;
    }

    public void setIdVisitaTerreno(int idVisitaTerreno) {
        this.idVisitaTerreno = idVisitaTerreno;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        if (nombreRevision.length() >= 10 && nombreRevision.length() <= 50) {
            this.nombreRevision = nombreRevision;
        } else {
            System.out.println("El nombre de la revision debe tener entre 10 y 50 caracteres.");
        }
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        if (detalle.length() <= 100) {
            this.detalle = detalle;
        } else {
            System.out.println("El detalle no debe exceder los 100 caracteres.");
        }
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        if (estado == 1 || estado == 2 || estado == 3) {
            this.estado = estado;
        } else {
            System.out.println("Estado invalido. Solo se permite 1 (sin problemas), 2 (con observaciones), o 3 (no aprueba).");
        }
    }

    // toString
    @Override
    public String toString() {
        return "Revision{" +
                "idRevision=" + idRevision +
                ", idVisitaTerreno=" + idVisitaTerreno +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
