package Expresiones;

public class Expresions6 {
    public static void main (String [] args){

        int a = 10, b = 3, c = 5, d = 2, e = 7, f = 6;
        boolean x = false, y = true;

        System.out.println((a + b) > (c - d) && (a / d != b) && (c > d) || (x && y));
        System.out.println((x || y) && (a * d < c * e) || (c > b));
        System.out.println((b % d == 0) && (c % e != 1) || (a % f == 0) && (a > b));
        System.out.println((a - b) >= (c / d) && (b > c) && !(d > a) || (y || x));
        System.out.println(!(a == b) || (c < d) && (e > d) || (x || y) && (a != b));
        System.out.println(!(x && y) && (a < b) || (c > d) && (a != b) && !(x || y));

    }//Fin del main
} // Fin de la clase


