package Bucles;

import java.util.Scanner;

public class Exercici16Bucles {
    public static void main(String [] args){
        Scanner teclado=new Scanner(System.in);

        int numero=0;
        boolean primo =false;


        System.out.println("Introduce un numero entero positivo:");
        numero=teclado.nextInt();



        for (int i=2;i<=numero;i++){

            if(numero%i!=0){
                primo=true;

            }

        }if (!primo){
            System.out.println("El número " + numero + " es primo ");
        }

        else {
            System.out.println("El número " + numero + "  no es primo ");
        }
    }
}
