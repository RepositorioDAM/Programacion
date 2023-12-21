package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays15 {
    public static void main (String []args){

        Scanner Teclado=new Scanner (System.in);

        int N, M;

        System.out.println("Introduce un numero N: ");
        N=Teclado.nextInt();
        System.out.println("Introduce un numero M: ");
        M=Teclado.nextInt();

        int [] v=new int [N];
        Arrays.fill(v,M);

        for (int i = 0; i < v.length; i++) {

            System.out.println("vector[" + i + "]= " + v[i]);
        }
    }
}
