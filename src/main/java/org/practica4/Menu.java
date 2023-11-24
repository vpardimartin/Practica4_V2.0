package org.practica4;

public class Menu {

    //      -- Menu Principal --
    //      ____________________
    //      -1 Combate --
    //      -2 Datos --
    //      -3 Ajustes --
    //      -0 Salir --
    public static void mainMenu() throws Exception {
        // Funcionalidad del menú principal
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = Metodos.obtenerOpcion();
            switch (opcion) {
                case 1:
                    // menuCombate();
                    break;
                case 2:
                    menuDatos();
                    break;
                case 3:
                    // menuAjustes();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
    }
    public static void mostrarMenuPrincipal() {
        // Visual del menú principal
        System.out.println();
        System.out.println("╔════════════════════╗");
        System.out.println("║   Menú Principal   ║");
        System.out.println("╠════════════════════╣");
        System.out.println("║ 1. Combate         ║");
        System.out.println("║ 2. Datos           ║");
        System.out.println("║ 3. Ajustes         ║");
        System.out.println("║ 0. Salir           ║");
        System.out.println("╚════════════════════╝");
        System.out.print("Selecciona una opción: ");
    }

    //      -- Datos
    //      ____________________
    //      1. Mostrar todo
    //      2. Héroes
    //      3. Villanos
    //      4. Escenarios
    //      5. Poderes
    //      0. Volver

    public static void menuDatos() throws Exception {
        // Funcionalidad del menú principal
        int opcion;
        do {
            mostrarMenuDatos();
            opcion = Metodos.obtenerOpcion();
            switch (opcion) {
                case 1:
                    // mostrarTodo();
                    break;
                case 2:
                    menuIndividualEL_DATO("Héroe");
                    break;
                case 3:
                    menuIndividualEL_DATO("Villano");
                    break;
                case 4:
                    menuIndividualEL_DATO("Escenario");
                    break;
                case 5:
                    menuIndividualEL_DATO("Poder");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
    }
    public static void mostrarMenuDatos() {
        // Visual del menú principal
        System.out.println();
        System.out.println("╔════════════════════╗");
        System.out.println("║       Datos        ║");
        System.out.println("╠════════════════════╣");
        System.out.println("║ 1. Mostrar todo    ║");
        System.out.println("║ 2. Héroes          ║");
        System.out.println("║ 3. Villanos        ║");
        System.out.println("║ 4. Escenarios      ║");
        System.out.println("║ 5. Poderes         ║");
        System.out.println("║ 0. Volver          ║");
        System.out.println("╚════════════════════╝");
        System.out.print("Selecciona una opción: ");
    }

    //      -- EL_DATO
    //      ____________________
    //      1. Mostrar EL_DATO
    //      2. Crear EL_DATO
    //      3. Modificar EL_DATO
    //      4. Borrar EL_DATO
    //      0. Volver

    public static void menuIndividualEL_DATO(String EL_DATO) throws Exception {
        // Funcionalidad del menú principal
        int opcion;
        do {
            mostrarMenuEL_DATO(EL_DATO);
            opcion = Metodos.obtenerOpcion();
            switch (opcion) {
                case 1:
                if(EL_DATO.equals("Poder")){
                    System.out.println("1. Mostrar " + EL_DATO + "es");
                }else{
                    System.out.println("1. Mostrar " + EL_DATO + "s");
                }
                    // Lógica para mostrar héroes
                    break;
                case 2:
                    System.out.println("2. Crear " + EL_DATO);
                    // Lógica para crear héroe
                    break;
                case 3:
                    System.out.println("3. Modificar " + EL_DATO);
                    // Lógica para modificar héroe
                    break;
                case 4:
                    System.out.println("4. Borrar " + EL_DATO);
                    // Lógica para borrar héroe
                    break;
                case 5:
                    System.out.println("5. Otra opción");
                    // Lógica para otra opción
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
    }
    private static void mostrarMenuEL_DATO(String EL_DATO) {
    switch (EL_DATO){
        case "Héroe":
            System.out.println();
            System.out.println("╔════════════════════╗");
            System.out.println("║       Héroes       ║");
            System.out.println("╠════════════════════╣");
            System.out.println("║ 1. Mostrar Héroes  ║");
            System.out.println("║ 2. Crear Héroe     ║");
            System.out.println("║ 3. Modificar Héroe ║");
            System.out.println("║ 4. Borrar Héroe    ║");
            System.out.println("║ 0. Volver          ║");
            System.out.println("╚════════════════════╝");
            break;
        case "Villano":
            System.out.println();
            System.out.println("╔══════════════════════╗");
            System.out.println("║       Villanos       ║");
            System.out.println("╠══════════════════════╣");
            System.out.println("║ 1. Mostrar Villanos  ║");
            System.out.println("║ 2. Crear Villano     ║");
            System.out.println("║ 3. Modificar Villano ║");
            System.out.println("║ 4. Borrar Villanos   ║");
            System.out.println("║ 0. Volver            ║");
            System.out.println("╚══════════════════════╝");
            break;
        case "Escenario":
            System.out.println();
            System.out.println("╔════════════════════════╗");
            System.out.println("║       Escenarios       ║");
            System.out.println("╠════════════════════════╣");
            System.out.println("║ 1. Mostrar Escenarios  ║");
            System.out.println("║ 2. Crear Escenario     ║");
            System.out.println("║ 3. Modificar Escenario ║");
            System.out.println("║ 4. Borrar Escenario    ║");
            System.out.println("║ 0. Volver              ║");
            System.out.println("╚════════════════════════╝");
            break;
        case "Poder":
            System.out.println();
            System.out.println("╔════════════════════╗");
            System.out.println("║        Poder       ║");
            System.out.println("╠════════════════════╣");
            System.out.println("║ 1. Mostrar Poderes ║");
            System.out.println("║ 2. Crear Poder     ║");
            System.out.println("║ 3. Modificar Poder ║");
            System.out.println("║ 4. Borrar Poder    ║");
            System.out.println("║ 0. Volver          ║");
            System.out.println("╚════════════════════╝");
            break;
    }
        System.out.print("Selecciona una opción: ");
    }

}
