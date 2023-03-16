/** Crea una aplicaci�n que a trav�s de una funci�n nos convierta una cantidad
 * de euros introducida por teclado a otra moneda, estas pueden ser a d�lares,
 * yenes o libras. La funci�n tendr� como par�metros, la cantidad de euros y la
 * moneda a convertir que ser� una cadena, este no devolver� ning�n valor y
 * mostrar� un mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * 0.86 libras es un 1 ?
 * 1.28611 $ es un 1 ?
 * 129.852 yenes es un 1 ?
 *
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Sebasti�n Cozzi
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Calculadora de cambio de divisas.\n"
                + "  El cambio de divisas es:\n"
                + "    * 0.86 libras es un 1 euro\n"
                + "    * 1.28611 d�lares es un 1 euro\n"
                + "    * 129.852 yenes es un 1 euro\n"
                + "-----------------------------------");
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el importe en euros: ");
        float monto = leer.nextFloat();
        String moneda;
        String monedas = "d�lares, yenes, libras.";
        do {
            System.out.print("Ingrese la moneda: ");
            moneda = leer.next();
            //System.out.println(moneda);
            if (monedas.indexOf(moneda.toLowerCase()) == -1) {
                System.out.println("Opci�n incorrecta.\n" + monedas);
            } else {
                break;
            }
        } while (true);
        calcular(moneda.toLowerCase(), monto);

    }

    private static void calcular(String moneda, float monto) {
        float libras = (float) 0.86;
        float dolar = (float) 1.28611;
        float yenes = (float) 129.852;
        String singu = " euros";
        if (monto == 1) {
            singu = " euro";
        }
        switch (moneda) {
            case "yenes":
                System.out.println(monto + singu + ", equivalen a " + (monto * yenes + " yenes."));
                break;
            case "d�lares":
                System.out.println(monto + singu + ", equivalen a " + (monto * dolar + " d�lares."));
                break;
            case "libras":
                System.out.println(monto + singu + ", equivalen a " + (monto * libras + " libras."));
                break;
            default:
                throw new AssertionError();
        }
    }

}

   
