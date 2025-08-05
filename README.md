Nombre del proyecto: Sistema de Prevención de Riesgos Laborales

Descripción general:

Este proyecto consiste en el desarrollo de una aplicación de consola en Java que permite registrar y gestionar usuarios dentro de un sistema orientado a la prevención de riesgos laborales. El sistema contempla tres tipos de usuarios principales: Clientes, Profesionales y Administrativos, además de la posibilidad de registrar Capacitaciones.

Contexto del problema:

En entornos laborales, especialmente aquellos con riesgos asociados a las actividades productivas, es fundamental contar con un sistema ordenado que permita gestionar la información de trabajadores, profesionales de prevención, personal administrativo y actividades de capacitación. La ausencia de un registro organizado puede generar errores administrativos, baja trazabilidad y dificultad para cumplir con normativas legales en materia de seguridad y salud ocupacional.

Objetivo de la solución:

Desarrollar un sistema básico pero funcional, basado en programación orientada a objetos (POO), que permita:
- Registrar diferentes tipos de usuarios con sus atributos particulares.
- Validar correctamente los datos ingresados, solicitando reingreso en caso de errores.
- Eliminar usuarios por RUN.
- Listar usuarios por tipo.
- Registrar capacitaciones y listarlas.
- Garantizar el almacenamiento de objetos en una estructura contenedora de memoria temporal.

Estructura de la solución:

La solución está compuesta por las siguientes clases:
- Usuario (abstracta): clase base con atributos comunes (nombre, fecha nacimiento, RUN).
- Cliente: extiende Usuario; incluye AFP, sistema de salud, dirección, comuna y edad.
- Profesional: extiende Usuario; incluye título profesional y fecha de ingreso.
- Administrativo: extiende Usuario; incluye área y experiencia previa.
- Capacitación: clase que almacena información sobre eventos formativos.
- Contenedor: clase que almacena objetos de tipo Usuario o Capacitación mediante ArrayList.
- Asesoria (interfaz): define el método `analizarUsuario()` que deben implementar las clases hijas de Usuario.
- Principal: clase con método main, incluye el menú de operaciones y control del flujo de ingreso de datos.

Validaciones implementadas:

- RUN con formato válido (hasta 25 millones y verificador numérico o 'k').
- Nombres, apellidos, títulos, áreas, y otros campos con rangos de longitud específicos.
- Fechas con formato DD/MM/AAAA.
- Edad entre 0 y 149.
- Sistema de salud válido (1: Fonasa, 2: Isapre).
- Control de errores mediante `try/catch` y reintento hasta ingreso correcto.

Compilación y ejecución:

Este proyecto fue desarrollado en NetBeans con JDK 17. Para compilar y ejecutar:

1. Abrir el proyecto en NetBeans.
2. Ejecutar la clase `Principal.java`.
3. Utilizar el menú de consola para interactuar con el sistema.

Repositorio en GitHub:

Para revisión, el código completo será gestionado y subido en el siguiente repositorio de GitHub:

https://github.com/usuario/sistema-prevencion-riesgos


Cristóbal Tapia - 2025
