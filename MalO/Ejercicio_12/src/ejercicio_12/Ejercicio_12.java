/**Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
 * usuario, validando que el primer número múltiplo del segundo e imprima si el
 * primer número es múltiplo del segundo, sino informe que no lo son.
 */
package ejercicio_12;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        // TODO code application logic here
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números enteros positivos");
        System.out.print("Número 1 -> ");
        int n1= leer.nextInt();
        System.out.print("Número 2 -> ");
        int n2= leer.nextInt();
        EsMultiplo(n1,n2);
    }
    private static void EsMultiplo(int numero1, int numero2){
        if ((numero1 % numero2) == 0){
            System.out.println("El número 1 -> " + numero1 + " y el número 2 -> "+ numero2 + " son Multiplos.");
        }else{
            System.out.println("El número 1 -> " + numero1 + " y el número 2 -> "+ numero2 + " NO son Multiplos.");
        }
    }
}
