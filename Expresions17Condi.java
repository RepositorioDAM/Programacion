package Condicionales;

import java.util.Scanner;
import java.lang.Math;


public class Expresions17Condi {
    public static void main(String [] args){

        Scanner Teclado=new Scanner (System.in);

        int hh, mm, ss;

        System.out.println("Introduce las horas:");
        hh=Teclado.nextInt();

        System.out.println("Introduce los minutos");
        mm=Teclado.nextInt();

        System.out.println("Introduce los segundos");
        ss=Teclado.nextInt();

        if (ss>=59){
            ss = 0;
            ++mm;
        }
        if (mm>=59){
            mm = 0;
            ++hh;
        }
        if (hh>=23){
            hh=0;
        }

        System.out.println("La hora es: " + hh + mm + ss);























    }//Fin del main
}//Fin de la clase
