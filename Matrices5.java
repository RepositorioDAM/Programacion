package Matrices;
import java.util.Scanner;

public class Matrices5 {
    public static void main(String[] args) {

        Scanner Teclado=new Scanner (System.in);

        int n=0,g=0;

        int mujeres=0, varones=0, cuentaMujeres=0, cuentaVarones=0;
        double sueldo=0;

        System.out.println("Introduce el numero de personas: ");
        n= Teclado.nextInt();

        int sueldos[][]= new int[n][2];

        for (int i = 0; i < sueldos.length; i++) {

                System.out.println("Introduce el género. Pulsa 0 si es varón o pulsa 1 si es mujer: ");
                g= Teclado.nextInt();

                System.out.println("Introduce el sueldo: ");
                sueldo= Teclado.nextDouble();

                sueldos[i][0] = g;
                sueldos[i][1] = (int) sueldo;
                if(g == 0) {
                    varones++;
                    cuentaVarones += sueldo;
                }
                if(g == 1) {
                   mujeres++;
                   cuentaMujeres += sueldo;
                }
        }
        double mediaMujeres = cuentaMujeres / mujeres;
        double mediaVarones = cuentaVarones / varones;

        System.out.println("El sueldo medio de los hombres es de " + mediaVarones);
        System.out.println("El sueldo medio de las mujeres es de " + mediaMujeres);
    }
}
