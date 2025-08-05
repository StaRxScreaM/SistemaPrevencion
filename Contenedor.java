import java.util.ArrayList;
import java.util.List;

public class Contenedor {

    private List<Asesoria> listaUsuarios;
    private List<Capacitacion> listaCapacitaciones;

    // Constructor sin parámetros
    public Contenedor() {
        listaUsuarios = new ArrayList<>();
        listaCapacitaciones = new ArrayList<>();
    }

    // Métodos para almacenar objetos

    public void almacenarCliente(Cliente cliente) {
        listaUsuarios.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        listaUsuarios.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        listaUsuarios.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        listaCapacitaciones.add(capacitacion);
    }

    // Método para eliminar usuario por RUN
    public void eliminarUsuario(String run) {
        boolean eliminado = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i) instanceof Usuario) {
                Usuario usuario = (Usuario) listaUsuarios.get(i);
                if (usuario.getRun().equals(run)) {
                    listaUsuarios.remove(i);
                    System.out.println("Usuario eliminado correctamente.");
                    eliminado = true;
                    break;
                } else {
                }
            }
        }
        if (!eliminado) {
            System.out.println("No se encontró un usuario con el RUN ingresado.");
        }
    }

    // Listar todos los usuarios (sólo datos de la clase Usuario)
    public void listarUsuarios() {
        for (Asesoria usuario : listaUsuarios) {
            if (usuario instanceof Usuario) {
                Usuario u = (Usuario) usuario;
                System.out.println(u.toString());
            }
        }
    }

    // Listar usuarios por tipo
    public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria usuario : listaUsuarios) {
            switch (tipo.toLowerCase()) {
                case "cliente":
                    if (usuario instanceof Cliente) {
                        System.out.println(usuario.toString());
                    }
                    break;
                case "administrativo":
                    if (usuario instanceof Administrativo) {
                        System.out.println(usuario.toString());
                    }
                    break;
                case "profesional":
                    if (usuario instanceof Profesional) {
                        System.out.println(usuario.toString());
                    }
                    break;
                default:
                    System.out.println("Tipo de usuario no reconocido.");
                    return;
            }
        }
    }

    // Listar capacitaciones con datos del cliente
    public void listarCapacitaciones() {
        for (Capacitacion cap : listaCapacitaciones) {
            System.out.println(cap.toString());
        }
    }
}
