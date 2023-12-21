package Bucles;

import java.util.Scanner;

public class Exercici15Bucles {
    public static void main (String [] args){

        Scanner teclado= new Scanner(System.in);

        int numero=0;
        int multiplos=0;

        System.out.println("Introduce un número:");
        numero=teclado.nextInt();

        for (int i=1; i<=numero; i++){

            if (i%3==0){

                multiplos++;
            }



        }

        System.out.println("El resultado de multiplos de 3 es: " + multiplos);




















    }
}
