package Calculos;

import java.lang.Math;
import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String [] args){

        double lastnum=0, nextnum=1, suma=0;
        int teclado;
        Scanner Teclado=new Scanner(System.in);

        System.out.println("Introduce un valor");
        teclado=Teclado.nextInt();

        for(int i=1; i<=teclado; i++){

            suma=lastnum+nextnum;
            nextnum=lastnum;
            lastnum=suma;

            System.out.println(Math.floor(suma));
        }//Fin del for

    }//Fin del main
}//Fin de la clase
