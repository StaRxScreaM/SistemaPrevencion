public class VisitaTerreno {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;

    // Constructor vacío
    public VisitaTerreno() {
    }

    // Constructor completo
    public VisitaTerreno(int identificador, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        setDia(dia);
        setHora(hora);
        setLugar(lugar);
        setComentarios(comentarios);
    }

    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        if (dia.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.dia = dia;
        } else {
            System.out.println("Formato de fecha no valido. Debe ser DD/MM/AAAA.");
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        if (hora.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {
            this.hora = hora;
        } else {
            System.out.println("Hora no valida. Debe estar en formato HH:MM.");
        }
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        if (comentarios.length() <= 100) {
            this.comentarios = comentarios;
        } else {
            System.out.println("Comentarios no debe exceder los 100 caracteres.");
        }
    }

    // toString
    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "identificador=" + identificador +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
