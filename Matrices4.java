package Matrices;
import java.util.Scanner;

public class Matrices4 {
    public static void main(String [] args){

    Scanner Teclado=new Scanner (System.in);

        int notas[][]= new int[4][5];
        int suma=0, media=0, notaMax=0, notaMin=0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {

                System.out.println("Introduce las notas");
                notas[i][j] = Teclado.nextInt();
                System.out.print("notas[" + i + "][" + j + "]= " + notas[i][j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < notas.length; i++) {
            suma=0;
            notaMax=0;
            notaMin=10;

            for (int j = 0; j < notas[i].length; j++) {

                suma=suma + notas[i][j];

                if(notas[i][j]>notaMax){
                    notaMax=notas[i][j];
                }
                if (notas[i][j] < notaMin) {

                    notaMin=notas[i][j];
                }
            }
            media=0;
            media=suma/5;

            System.out.println("Alumno " + (i+1) + " su media es: " + media + ".Su nota máxima es " + notaMax + " y su nota mínima es : " + notaMin);
        }
    }
}
