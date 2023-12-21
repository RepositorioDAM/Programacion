package CifradoCesar;

import java.util.Scanner;

public class CifradoCesar3 {
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        String frase;
        int N=0;


        System.out.println("Introduce tu mensaje a cifrar");
        frase=Teclado.nextLine();
        frase=frase.toLowerCase();

        char [] v1=frase.toCharArray();
        char [] cifrado;

        System.out.println("Introduce un numero N");
        N= Teclado.nextInt();

        for (char i=0; i< v1.length; i++) {

            if (!(v1[i] >= 'a' && v1[i] <= 'z' || v1[i] == ' ')) {

                System.out.println("ERROR");
            }
                if (v1[i] != ' ') {
                    v1[i] += N;
                }

                if (v1[i] > 122) {
                    v1[i] -= 26;
                }

                if (v1[i] < 97 && v1[i] > 32) {
                    v1[i] += 26;
                }
            }

            System.out.println(v1);

    }
}
