import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear el árbol binario
        ArbolBinario arbol = new ArbolBinario();

        // Menú para interactuar con el árbol
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido inorden");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    // Insertar un número en el árbol
                    System.out.print("Ingrese el número a insertar: ");
                    int numero = scanner.nextInt();
                    arbol.insertar(numero);
                    System.out.println("Número " + numero + " insertado correctamente.");
                    break;

                case 2:
                    // Mostrar los números en orden ascendente (inorden)
                    System.out.print("Recorrido inorden: ");
                    arbol.inorden();
                    break;

                case 3:
                    // Buscar un número en el árbol
                    System.out.print("Ingrese el número a buscar: ");
                    int buscar = scanner.nextInt();
                    if (arbol.buscar(buscar)) {
                        System.out.println("El número " + buscar + " SÍ existe en el árbol.");
                    } else {
                        System.out.println("El número " + buscar + " NO existe en el árbol.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
