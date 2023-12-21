package Bucles;

import java.util.Scanner;

public class Exercici17Bucles {
    public static void main(String [] args){
        Scanner Teclado=new Scanner(System.in);

        int numero=1, cuentaNumeros=0, cuentaFallos=0;


        System.out.println("Dame un numero inicial: ");
        numero=Teclado.nextInt();

        do{
            int numero1=1;
            cuentaNumeros++;
            System.out.println("Dame un numero: ");
            numero1=Teclado.nextInt();


            if (numero>numero1 && numero1 !=0){
                System.out.println("Fallo es menor");
                cuentaFallos++;
            }

            numero=numero1;


        } while (numero!=0);


        System.out.println("Total de numero introducidos: "+ cuentaNumeros);
        System.out.println("Total de numeros fallados:" + cuentaFallos);






    }
}
