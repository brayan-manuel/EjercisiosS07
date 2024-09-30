package practica;
import java.util.Scanner;
public class Ejerc03Tarea {
    public static void main(String[] args) {
        // Declarar variables
        String empleado, mejorEmpleado = "", opcion = "";
        double salario, salarioMax = 0;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        // Proceso de datos
        do {
            System.out.print("Ingrese el nombre del " + (contador + 1) + " empleado: ");
            empleado = scanner.next();

            System.out.print("Ingrese el salario del empleado (S/): ");
            salario = scanner.nextDouble();

            // Verificar el salario más alto
            if (salario > salarioMax) {
                salarioMax = salario;
                mejorEmpleado = empleado;
            }

            // Preguntar si desea continuar
            System.out.print("¿Desea continuar registrando empleados? [S o N]: ");
            opcion = scanner.next();
            contador++;

        } while (opcion.equalsIgnoreCase("S"));

        // Salida de datos
        System.out.println("-----------------------------------");
        System.out.println(mejorEmpleado + " tiene el salario más alto.");
        System.out.println("Salario: S/ " + salarioMax);
        System.out.println("-----------------------------------");
    }
}

