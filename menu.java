import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese el tamano n de la matriz nxn: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        obj[][] matriz = new obj[n][n];
        ArrayList<obj> arregloObjetual = new ArrayList<>();
        Stack<obj> pila = new Stack<>();
        metodos metodos = new metodos();
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    metodos.llenar(matriz, scanner);
                    System.out.println("Productos cargados y clasificados correctamente.");
                    break;
                case 2:
                    metodos.arreglo(matriz);
                    break;
                case 3:
                    metodos.pila(matriz);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n===== MENU PRODUCTOS DE BELLEZA =====");
        System.out.println("1. Cargar productos en la matriz");
        System.out.println("2. Mostrar productos en arreglo (precio < $200000)");
        System.out.println("3. Mostrar productos en pila (precio > $200000)");
        System.out.println("0. Salir");
    }

}
