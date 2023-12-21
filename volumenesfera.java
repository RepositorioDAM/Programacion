package Calculos;

import java.lang.Math;
import java.util.Scanner;

public class volumenesfera {
    public static void main(String [] args ){

        Scanner Teclado = new Scanner (System.in);


        double r;
        double V=0;

        System.out.println ("Introduce valor de r");
        r= Teclado.nextDouble();

        V= 4/3 * Math.PI * Math.pow(r,3);

        System.out.println ("El resultado del volumen es:" + V);








    }
}
