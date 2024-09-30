/*
Crear un programa en Java que permita ingresar la edad, 
sexo de las personas y preguntar al usuario si desea 
continuar o finalizar con el proceso de registro de datos.
Visualizar la cantidad de personas y el promedio de edad, 
y la cantidad de personas de sexo masculino y femenino.
 */
package practica;
import java.util.Scanner;
class Ejercisio01 {
    public static void main(String[] args) {
      int edad, cp, cpm, cpf;
      double se, prom;
      String sexo, opc;
      Scanner lectura=new Scanner(System.in);
      int count=0;
      cpm=0;
      cpf=0;
      prom=0;
      se=0;
      do{
          System.out.println("Formulario de registro");
          System.out.println("Ingrese edad");
          edad = lectura.nextInt();
          System.out.println("Ingrese sexo (M)(F)");
          sexo = lectura.next(); 
          count++;
          se+=edad;
          if(sexo.equals("m")||sexo.equals("M")){
              cpm++;
          }else{
              cpf++;
          }
          prom=se/count;
          System.out.println("Continue SI/NO");
          opc = lectura.next();
      }while(opc.equals("SI")||opc.equals("si"));
      System.out.println("cantidad de registros: "+count);
       System.out.println("cantidad de hombres: "+cpm);
       System.out.println("cantidad de mujeres: "+cpf);
       System.out.println("Promedio de edades: "+prom);
    }
}