public class Accidente {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    // Constructor vacío
    public Accidente() {
    }

    // Constructor con todos los parámetros
    public Accidente(int identificador, int rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        setDia(dia);
        setHora(hora);
        setLugar(lugar);
        setOrigen(origen);
        setConsecuencias(consecuencias);
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
        // Validación de formato DD/MM/AAAA
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        if (origen.length() <= 100) {
            this.origen = origen;
        } else {
            System.out.println("Origen no debe exceder los 100 caracteres.");
        }
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        if (consecuencias.length() <= 100) {
            this.consecuencias = consecuencias;
        } else {
            System.out.println("Consecuencias no debe exceder los 100 caracteres.");
        }
    }

    // toString
    @Override
    public String toString() {
        return "Accidente{" +
                "identificador=" + identificador +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
