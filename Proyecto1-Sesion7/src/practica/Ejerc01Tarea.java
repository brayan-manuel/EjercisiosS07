package practica;
import java.util.Scanner;
public class Ejerc01Tarea {
    public static void main(String[] args) {
        // Declarar variables
        String producto, mejorProducto = "", opcion = "";
        int cantidad, cantidadMax = 0, contador = 0;
        double precio, totalVenta, totalVentas = 0;
        Scanner scanner = new Scanner(System.in);
        // Proceso de datos
        do {
            System.out.print("Ingrese el nombre del " + (contador + 1) + " producto: ");
            producto = scanner.next();

            System.out.print("Ingrese el precio del producto: ");
            precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad vendida: ");
            cantidad = scanner.nextInt();

            totalVenta = precio * cantidad;
            totalVentas += totalVenta;
            System.out.println("Total de ventas del producto: " + totalVenta);

            if (cantidad > cantidadMax) {
                cantidadMax = cantidad;
                mejorProducto = producto;
            }
            System.out.print("¿Desea continuar registrando productos? [S o N]: ");
            opcion = scanner.next();
            contador++;
        } while (opcion.equalsIgnoreCase("S"));
        // Salida de datos
        System.out.println("-----------------------------------");
        System.out.println("El producto mas vendido es: " + mejorProducto);
        System.out.println("Total vendido: " + totalVentas);
        System.out.println("-----------------------------------");
    }
}
