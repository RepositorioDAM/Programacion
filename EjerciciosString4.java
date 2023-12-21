package MasEjerciciosString;
import java.util.Scanner;

public class EjerciciosString4 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner (System.in);

        String frase;
        int movimiento=0;

        System.out.println("Introduce una frase: ");
        frase= teclado.nextLine();

        System.out.println("Introduce el numero de desplazamiento: ");
        movimiento= teclado.nextInt();

        String nuevaFrase = frase.substring(frase.length() - movimiento) + frase.substring(0, frase.length() - movimiento);

        System.out.println("La frase después de desplazar los caracteres a la derecha es: " + nuevaFrase);

    }
}
