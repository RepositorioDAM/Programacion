package MatrizCuadrada;
import java.util.Scanner;

public class MatrizcuadradaEntrega {
    public static void main(String[] args) {

        Scanner teclado=new Scanner (System.in);

        int n=0;

        System.out.println("Introduzca el valor para el tamaño de la matriz");
        n= teclado.nextInt();

        int v [][]= new int [n][n];

        System.out.println(" ");
        System.out.println("Poner valor en la matriz. ");
        System.out.println(" ");

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j]=1;
                System.out.printf("%4d ", v[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if(i == j){
                    v[i][j] =0;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Poner la diagonal principal a 0. ");
        System.out.println(" ");

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {

                System.out.printf("%4d ", v[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i+j == v.length-1){
                    v[i][j]=0;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Poner la diagonal inversa a 0.");
        System.out.println(" ");

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.printf("%4d ", v[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i==1){
                    v[i][j]=5;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Poner la fila 2 con valor 5");
        System.out.println(" ");

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.printf("%4d ", v[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if(j==2){
                    v[i][j]=8;
                }
            }
        }
        System.out.println(" ");
        System.out.println("poner la columna 3 con valor 8");
        System.out.println(" ");

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.printf("%4d ", v[i][j]);
            }
            System.out.println();
        }
    }
}
