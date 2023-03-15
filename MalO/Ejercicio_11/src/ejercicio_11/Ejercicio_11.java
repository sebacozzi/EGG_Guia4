/**Escribir un programa que procese una secuencia de caracteres ingresada por 
* teclado y terminada en punto, y luego codifique la palabra o frase ingresada 
* de la siguiente manera: cada vocal se reemplaza por el carácter que se indica 
* en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
* se mantienen sin cambios.
*    a e i o u
*    @ # $ % *
*
* Realice un subprograma que reciba una secuencia de caracteres y retorne la 
* codificación correspondiente. Utilice la estructura “según” para la 
* transformación. 
* Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
* La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package ejercicio_11;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        String frase = leer.nextLine();
        System.out.println("Frase codificada...");
        System.out.println(cambioLetras(frase));
    }

    private static String cambioLetras(String frase) {

        String temp = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i + 1)) {
                case "a", "A":
                    temp = temp.concat("@");
                    break;
                case "e", "E":
                    temp= temp.concat("#");
                    break;
                case "i", "I":
                    temp = temp.concat("$");
                    break;
                case "o", "O":
                    temp = temp.concat("%");
                    break;
                case "u", "U":
                    temp = temp.concat("*");
                    break;
                default:
                    temp = temp.concat(frase.substring(i, i+1));
            }
        }
        return temp;
    }
}
