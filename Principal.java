import java.util.Scanner;

public class Principal {

    public static boolean rutValido(String rut) {
        if (!rut.matches("^\\d{1,8}-[0-9kK]{1}$")) {
            System.out.println("Formato de RUT invalido. Debe ser sin puntos y con guion, por ejemplo 18726xxx-k");
            return false;
        }

        String[] partes = rut.split("-");
        try {
            int numeroRut = Integer.parseInt(partes[0]);
            if (numeroRut > 25000000) {
                System.out.println("El numero de RUT no puede ser mayor a 25xxxxxx-k.");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error en el numero de RUT.");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contenedor contenedor = new Contenedor();
        int opcion = 0;

        do {
            System.out.println("\n|Sistema de Prevencion de Riesgos|");
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Almacenar Profesional");
            System.out.println("3. Almacenar Administrativo");
            System.out.println("4. Almacenar Capacitacion");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Usuarios por Tipo");
            System.out.println("8. Listar Capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1: {
                        Cliente cliente = new Cliente();
                        String input;
                        int inputInt;

                        while (true) {
                            System.out.print("Nombres (5-30): ");
                            input = scanner.nextLine();
                            if (input.length() >= 5 && input.length() <= 30) {
                                cliente.setNombres(input);
                                break;
                            } else {
                                System.out.println("Error: Los Nombres deben tener entre 5 y 30 caracteres.");
                            }
                        }

                        while (true) {
                            System.out.print("Apellidos (5-30): ");
                            input = scanner.nextLine();
                            if (input.length() >= 5 && input.length() <= 30) {
                                cliente.setApellidos(input);
                                break;
                            } else {
                                System.out.println("Error: Apellidos deben tener entre 5 y 30 caracteres.");
                            }
                        }

                        while (true) {
                            System.out.print("Ingrese RUT (ej: 18726xxx-k): ");
                            input = scanner.nextLine();
                            if (rutValido(input)) {
                                cliente.setRun(input);
                                break;
                            }
                        }

                        System.out.print("Telefono: ");
                        cliente.setTelefono(scanner.nextLine());

                        while (true) {
                            System.out.print("AFP (4-30): ");
                            input = scanner.nextLine();
                            if (input.length() >= 4 && input.length() <= 30) {
                                cliente.setAfp(input);
                                break;
                            } else {
                                System.out.println("Error: AFP debe tener entre 4 y 30 caracteres.");
                            }
                        }

                        while (true) {
                            System.out.print("Sistema de salud (1-Fonasa, 2-Isapre): ");
                            try {
                                inputInt = Integer.parseInt(scanner.nextLine());
                                if (inputInt == 1 || inputInt == 2) {
                                    cliente.setSistemaSalud(inputInt);
                                    break;
                                } else {
                                    System.out.println("Error: debe ser 1 o 2.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Error: debe ingresar un numero.");
                            }
                        }

                        while (true) {
                            System.out.print("Direccion (max 70): ");
                            input = scanner.nextLine();
                            if (input.length() <= 70) {
                                cliente.setDireccion(input);
                                break;
                            } else {
                                System.out.println("Error: direccion no puede superar 70 caracteres.");
                            }
                        }

                        while (true) {
                            System.out.print("Comuna (max 50): ");
                            input = scanner.nextLine();
                            if (input.length() <= 50) {
                                cliente.setComuna(input);
                                break;
                            } else {
                                System.out.println("Error: comuna no puede superar 50 caracteres.");
                            }
                        }

                        while (true) {
                            System.out.print("Edad (0-149): ");
                            try {
                                inputInt = Integer.parseInt(scanner.nextLine());
                                if (inputInt >= 0 && inputInt < 150) {
                                    cliente.setEdad(inputInt);
                                    break;
                                } else {
                                    System.out.println("Error: edad debe estar entre 0 y 149.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Error: debe ingresar un numero valido.");
                            }
                        }

                        contenedor.almacenarCliente(cliente);
                        System.out.println("Cliente almacenado correctamente.");
                        break;
                    }

                    case 2: {
                        Profesional profesional = new Profesional();
                        String input;

                        while (true) {
                            System.out.print("Nombre (10-50): ");
                            input = scanner.nextLine();
                            if (input.length() >= 10 && input.length() <= 50) {
                                profesional.setNombre(input);
                                break;
                            } else {
                                System.out.println("Error: nombre debe tener entre 10 y 50 caracteres.");
                            }
                        }

                        while (true) {
                            System.out.print("Fecha nacimiento (DD/MM/AAAA): ");
                            input = scanner.nextLine();
                            if (input.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                                profesional.setFechaNacimiento(input);
                                break;
                            } else {
                                System.out.println("Error: fecha debe tener formato DD/MM/AAAA.");
                            }
                        }

                        while (true) {
                            System.out.print("RUN (ej: 18726xxx-k): ");
                            input = scanner.nextLine();
                            if (rutValido(input)) {
                                profesional.setRun(input);
                                break;
                            }
                        }

                        while (true) {
                            System.out.print("Titulo (10-50): ");
                            input = scanner.nextLine();
                            try {
                                profesional.setTitulo(input);
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }

                        while (true) {
                            System.out.print("Fecha de ingreso (DD/MM/AAAA): ");
                            input = scanner.nextLine();
                            if (input.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                                profesional.setFechaIngreso(input);
                                break;
                            } else {
                                System.out.println("Error: fecha debe tener formato DD/MM/AAAA.");
                            }
                        }

                        contenedor.almacenarProfesional(profesional);
                        System.out.println("Profesional almacenado correctamente.");
                        break;
                    }

                    case 3: {
                        Administrativo admin = new Administrativo();
                        String input;

                        while (true) {
                            System.out.print("Nombre (min 10): ");
                            input = scanner.nextLine();
                            if (input.length() >= 10) {
                                admin.setNombre(input);
                                break;
                            } else {
                                System.out.println("Error: nombre debe tener minimo 10 caracteres.");
                            }
                        }

                        while (true) {
                            System.out.print("Fecha nacimiento (DD/MM/AAAA): ");
                            input = scanner.nextLine();
                            if (input.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                                admin.setFechaNacimiento(input);
                                break;
                            } else {
                                System.out.println("Error: fecha debe tener formato DD/MM/AAAA.");
                            }
                        }

                        while (true) {
                            System.out.print("RUN (ej: 18726xxx-k): ");
                            input = scanner.nextLine();
                            if (rutValido(input)) {
                                admin.setRun(input);
                                break;
                            }
                        }

                        while (true) {
                            System.out.print("Area (5-20): ");
                            input = scanner.nextLine();
                            try {
                                admin.setArea(input);
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }

                        while (true) {
                            System.out.print("Experiencia previa (max 100): ");
                            input = scanner.nextLine();
                            try {
                                admin.setExperienciaPrevia(input);
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }

                        contenedor.almacenarAdministrativo(admin);
                        System.out.println("Administrativo almacenado correctamente.");
                        break;
                    }

                    case 4:
                        System.out.println("Función de capacitación aún no implementada.");
                        break;

                    case 5:
                        System.out.print("Ingrese RUN del usuario a eliminar: ");
                        String runEliminar = scanner.nextLine();
                        contenedor.eliminarUsuario(runEliminar);
                        break;

                    case 6:
                        contenedor.listarUsuarios();
                        break;

                    case 7:
                        System.out.print("Ingrese tipo de usuario (cliente, administrativo, profesional): ");
                        String tipo = scanner.nextLine();
                        contenedor.listarUsuariosPorTipo(tipo);
                        break;

                    case 8:
                        contenedor.listarCapacitaciones();
                        break;

                    case 9:
                        System.out.println("Saliendo del sistema. Gracias por usar el software.");
                        break;

                    default:
                        System.out.println("Opcion invalida. Intente nuevamente.");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero valido.");
            }

        } while (opcion != 9);

        scanner.close();
    }
}
