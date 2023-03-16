/** Crea una aplicaci�n que nos pida un n�mero por teclado y con una funci�n se
 * lo pasamos por par�metro para que nos indique si es o no un n�mero primo,
 * debe devolver true si es primo, sino false.
 * Un n�mero primo es aquel que solo puede dividirse entre 1 y s� mismo.
 * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
 * 17 si es primo.
 *
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Sebasti�n Cozzi
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n = pregLong("Ingrese un n�mero entero: ");
        if (esPrimo(n)) {
            System.out.println("El n�mero ingresado es primo.");
        } else {
            System.out.println("El n�mero ingresdo no es primo.");
        }
    }

    private static long pregLong(String mensaje) {
        // inicializaci�n de Scanner
        Scanner leer = new Scanner(System.in);
        System.out.print(mensaje);
        return leer.nextLong();
    }

    public static boolean esPrimo(long numero) {
        if (numero <= 1) {
            return false;
        } else if (numero <= 3) {
            return true;
        } else if ((numero % 2 == 0) || (numero % 3 == 0)) {
            return false;
        }
        long limite = (long) Math.sqrt(numero);
        for (long i = 5; i <= limite; i += 6) {
            if ((numero % i == 0) || (numero % i + 2 == 0)) {
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
}
