/*
Crear un programa en Java que permita ingresar el nombre de los alumnos 
y tres notas de cada uno, preguntar al usuario si desea continuar 
registrando datos. Visualizar el nombre del alumno con el mayor promedio obtenido.
 */
package practica;
import java.util.Scanner;
public class Ejercisio02 {
    public static void main(String[] args){
        //Declarar variables
        String nombre,mejoralum="",opc="";
        int nota,n1,n2,n3,i=0;
        double prom,promax=0;
        Scanner lectura=new Scanner(System.in);
        //Proceso de datos
        do{
            System.out.print("Ingrese el nombre del "+(i+1)+"° alumno: ");
            nombre=lectura.next();
            System.out.print("Ingrese la 1° nota: ");
            n1=lectura.nextInt();
            System.out.print("Ingrese la 2° nota: ");
            n2=lectura.nextInt();
            System.out.print("Ingrese la 3° nota: ");
            n3=lectura.nextInt();
            prom=(n1+n2+n3)/3;
            System.out.println("El promedio es "+prom);
            if (prom>promax){
                promax=prom;
                mejoralum=nombre;
            }
            System.out.print("¿Desea continuar? [S o N]: ");
            opc=lectura.next();
            i++;
            n1=0;
            n2=0;
            n3=0;
            prom=0;
        }while(opc.equals("S"));
        //Salida de datos
        System.out.println("-----------------------------------");
        System.out.println(mejoralum+" tiene el mayor promedio");
        System.out.println("Obtuvo: "+promax);
        System.out.println("-----------------------------------");
    }
}