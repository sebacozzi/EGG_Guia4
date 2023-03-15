/**Crea una aplicación que le pida dos números al usuario y este pueda elegir 
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
 * función para cada operación matemática y deben devolver sus resultados para 
 * imprimirlos en el main. 
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números enteros");
        System.out.print("Número 1->");
        int n1=leer.nextInt();
        System.out.print("Número 2->");
        int n2=leer.nextInt();
        int op=0;
        do {
            System.out.println("      MENU      ");
            System.out.println("  Operaciones:  ");
            System.out.println("1.    Sumar.    ");
            System.out.println("2.   Restar.    ");
            System.out.println("3. Multiplicar. ");
            System.out.println("4.   Dividir.   ");
            System.out.println("5.    Salir.    ");
            switch (leer.nextInt()) {
                case 1:
                    System.out.println("Calculo-> "+ n1 + " + " + n2 + " = "+ sumar(n1,n2));
                    break;
                case 2:
                    System.out.println("Calculo-> "+ n1 + " - " + n2 + " = "+ restar(n1,n2));
                    break;
                case 3:
                    System.out.println("Calculo-> "+ n1 + " * " + n2 + " = "+ multiplicar(n1,n2));
                    break;
                case 4:
                    System.out.println("Calculo-> "+ n1 + " / " + n2 + " = "+dividir(n1,n2));
                    break;
                case 5:
                    op=5;
                    break;
                default:
                    System.out.println("Opción incorrecta.");;
            }
        } while (op!=5);
        System.out.println("Gracias por venir!!");
        
    }
   private static int sumar (int numero_1, int numero_2){
       return numero_1 + numero_2;
   } 
   private static int restar(int numero_1, int numero_2){
       return numero_1 - numero_2;
   }
   private static int multiplicar(int numero_1, int numero_2){
       return numero_1 * numero_2;
   }
   private static float dividir(int numero_1, int numero_2){
       float resultado = 0;
       float n1=(float) numero_1;
       float n2= (float) numero_2;
       if (n2!=0){
       resultado = (n1 / n2);
       } else{
           System.out.println("División por Cero!");
       }
       return resultado;
   }
}
