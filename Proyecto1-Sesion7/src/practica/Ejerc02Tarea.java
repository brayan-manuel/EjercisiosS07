package practica;
import java.util.Scanner;
public class Ejerc02Tarea {
    public static void main(String[] args) {
        // Declarar variables
        String ciudad, ciudadMaxTemp = "", opcion = "";
        double temperatura, tempMax = Double.MIN_VALUE;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        // Proceso de datos
        do {
            System.out.print("Ingrese el nombre de la ciudad " + (contador + 1) + ": ");
            ciudad = scanner.next();

            System.out.print("Ingrese la temperatura registrada (grados): ");
            temperatura = scanner.nextDouble();

            // Verificar la temperatura más alta
            if (temperatura > tempMax) {
                tempMax = temperatura;
                ciudadMaxTemp = ciudad;
            }
            // Preguntar si desea continuar
            System.out.print("¿Desea continuar registrando ciudades? [S o N]: ");
            opcion = scanner.next();
            contador++;

        } while (opcion.equalsIgnoreCase("S"));

        // Salida de datos
        System.out.println("-----------------------------------");
        System.out.println("Ciudad con la mayor temperatura registrada: " + ciudadMaxTemp);
        System.out.println("Temperatura maxima: " + tempMax + " grados");
        System.out.println("-----------------------------------");
    }
}
