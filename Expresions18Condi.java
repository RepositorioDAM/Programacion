package Condicionales;

import java.util.Scanner;

public class Expresions18Condi {
    public static void main(String [] args){

        Scanner Teclado=new Scanner (System.in);

        double horasTrabajadas;
        double precioHoraNormal;
        double salario;
        String nombre;



        System.out.println("Nombre del operario");
        nombre = Teclado.nextLine();

        System.out.println ("Horas trabajadas esta semana");
        horasTrabajadas= Teclado.nextInt();

        System.out.println("Precio Hora Tarifa Normal");
        precioHoraNormal= Teclado.nextInt();

        if (horasTrabajadas<35){

            salario= horasTrabajadas * precioHoraNormal;

            System.out.println("El salario bruto es:" + salario);
        }
        else {
            salario= 35 * precioHoraNormal + (horasTrabajadas - 35) * precioHoraNormal *1.5;

            System.out.println ("El salario bruto es de:" + salario);

        }

        double neto;
        double Impuesto;

        if (salario<=500) {

            Impuesto = 0;
        }


        else if (salario<=900){
            Impuesto=(salario-500)*0.25;


        }
        else{

            Impuesto=(400 *0.25)+(salario-900)*0.45;

        }

        neto=salario - Impuesto;

        System.out.println("El salario de " +nombre + " asciende a: " + neto + " € " + "impuesto:" +Impuesto);




    }//Fin del main
}//Fin de la clase
