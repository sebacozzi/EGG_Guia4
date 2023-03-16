/**Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        datos();
    }
   public static void datos(){
       Scanner leer = new Scanner(System.in);
       String nombre;
       int edad;
       do {
           System.out.print("Ingrese el nombre de la persona: ");
           nombre = leer.next();
           System.out.print("Ingrese la edad de "+ nombre + " : ");
           edad=leer.nextInt();
           if (esMayor(edad)) {
               System.out.println(nombre + " de " + edad + " es mayor de edad.");               
           } else {
               System.out.println(nombre + " de " + edad + " es menor de edad.");
           }
       } while (pregunta());
   } 
   
   public static boolean esMayor(int edad){
       return edad > 17;
   }
   
    public static boolean pregunta() {
        Scanner leer = new Scanner(System.in);
        boolean incorrecto, correcto = false;
        String resp;
        do {
            incorrecto = false;
            System.out.print("¿Quiere ingresar otra persona? (si/no)");
            resp = leer.next();
            if (resp.equalsIgnoreCase("si")) {
                correcto = true;
            } else if (resp.equalsIgnoreCase("no")) {
                correcto = false;
            } else {
                System.out.println("Respuesta incorrecta.");
                incorrecto = true;
            }
        } while (incorrecto);
        return correcto;
    }
}
