public class Capacitacion {
    private int identificador;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;

    public Capacitacion() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        if (lugar.length() >= 10 && lugar.length() <= 50) {
            this.lugar = lugar;
        } else {
            System.out.println("Lugar debe tener entre 10 y 50 caracteres.");
        }
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        if (duracion.length() <= 70) {
            this.duracion = duracion;
        } else {
            System.out.println("Duracion no debe superar los 70 caracteres.");
        }
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        if (cantidadAsistentes < 1000) {
            this.cantidadAsistentes = cantidadAsistentes;
        } else {
            System.out.println("Cantidad de asistentes debe ser menor a 1000.");
        }
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "ID=" + identificador +
                ", rutCliente='" + rutCliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }
}
