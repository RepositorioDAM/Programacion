package ArrayMultidimensionalEntrega;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {

        int v[][]= new int [4][4];
        int opcion = 0, fila = 0, columna = 0, sumaFila = 0, sumaColumna=0, sumaCeldas=0, sumaMatriz=0;
        double media=0;
        boolean matrizLlena = false, filaCorrecta = false, columnaCorrecta = false;

        Scanner teclado= new Scanner(System.in);

        do {
            System.out.println("                         ");
            System.out.println("-------------------------");
            System.out.println("----Menu de opciones-----");
            System.out.println("-------------------------");
            System.out.println("1. Rellenar toda la matriz.");
            System.out.println("2. Suma de una fila.");
            System.out.println("3. Suma de una columna.");
            System.out.println("4. Suma de la diagonal principal.");
            System.out.println("5. Suma de la diagonal inversa.");
            System.out.println("6. La media de todos los valores de la matriz.");
            System.out.println("7. Salir");
            System.out.println("-------------------------");
            System.out.println("Elige una opción");
            System.out.println("-------------------------");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    for (int i = 0; i < v.length; i++) {
                        for (int j = 0; j < v[i].length; j++) {
                            System.out.println("Introduce un valor en la matriz");
                            v[i][j]= teclado.nextInt();
                        }
                    }
                    System.out.println(" ");
                    System.out.println("    NUESTRA MATRIZ ");
                    System.out.println(" ");
                    for (int i = 0; i < v.length; i++) {
                        for (int j = 0; j < v[i].length; j++) {
                            System.out.printf("%4d ", v[i][j]);
                        }
                        System.out.println();
                    }

                    matrizLlena=true;
                    break;
                case 2:
                    if (matrizLlena){
                        do {
                            System.out.println("Introduce la fila que quieres sumar: ");
                            fila = teclado.nextInt();
                            sumaFila = 0;
                            if((fila-1) >= 0 && (fila-1) <= 3) {
                                for (int i = 0; i < 4; i++) {
                                    sumaFila += v[fila-1][i];
                                }
                                System.out.println("La suma de la fila " + (fila-1) + " es: " + sumaFila);
                                filaCorrecta = true;
                            }else {
                                System.out.println("Fila incorrecta. Elige otra.");
                            }
                        }while(!filaCorrecta);
                    }else {
                        System.out.println("Primero has de llenar la matriz.");
                    }
                    break;
                case 3:
                    if (matrizLlena){
                        do {
                            System.out.println("Introduce la columna que quieres sumar: ");
                            columna = teclado.nextInt();
                            sumaColumna = 0;
                            if((columna-1) >= 0 && (columna-1) <= 3) {
                                for (int i = 0; i < 4; i++) {
                                    sumaColumna += v[i][columna-1];
                                }
                                System.out.println("La suma de la columna " + (columna-1) + " es: " + sumaColumna);
                                columnaCorrecta = true;
                            }else {
                                System.out.println("Columna incorrecta. Elige otra.");
                            }
                        }while(!columnaCorrecta);

                    }else {
                        System.out.println("Primero has de llenar la matriz.");
                    }
                    break;
                case 4:
                    if (matrizLlena){

                       sumaCeldas=0;
                        for (int i = 0; i < v.length; i++) {
                            for (int j = 0; j < v[i].length; j++) {
                                if(i == j){
                                    sumaCeldas+=v[i][j];
                                }
                            }
                        }System.out.println("La suma de la diagonal principal es: " + sumaCeldas);

                    }else {
                        System.out.println("Primero has de llenar la matriz.");
                    }
                    break;
                case 5:
                    if (matrizLlena){

                        sumaCeldas=0;
                        for (int i = 0; i < v.length; i++) {
                            for (int j = 0; j < v[i].length; j++) {
                                if(i+j == v.length-1){
                                    sumaCeldas+=v[i][j];
                                }
                            }
                        }System.out.println("La suma de la diagonal inversa es: " + sumaCeldas);
                    }else {
                        System.out.println("Primero has de llenar la matriz.");
                    }
                    break;
                case 6:
                    if (matrizLlena){
                        for (int i = 0; i < v.length; i++) {
                            for (int j = 0; j < v[i].length; j++) {
                                sumaMatriz+=v[i][j];
                            }
                        }
                        media= (double) sumaMatriz/ (v.length*v[0].length);

                        System.out.println("La suma de los valores de las celdas de la matriz es: " + sumaMatriz);
                        System.out.println("La media de los valores es: " + media);
                    }else {
                        System.out.println("Primero has de llenar la matriz.");
                    }
                    break;
                case 7:
                    System.out.println("El programa ha terminado");
                    break;
                default:
                    System.out.println("Opción no valida. Introduce un numero del 1 al 7");
            }
        }while (opcion !=7);
    }
}
