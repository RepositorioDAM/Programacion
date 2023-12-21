import java.util.Scanner;

    public class Menu {
        public static void main(String[] args) {

            Scanner Teclado = new Scanner(System.in);

            int a, b, aux, opcion, suma = 0, numeroMaximo = 0, numeroMinimo = 997;

            do {
                System.out.println("                         ");
                System.out.println("-------------------------");
                System.out.println("----Menu de opciones-----");
                System.out.println("-------------------------");
                System.out.println("1. Permutar dos valores");
                System.out.println("2. Sumatorio");
                System.out.println("3. Maximo y mínimo");
                System.out.println("4. Numeros primeros");
                System.out.println("5. Salir");
                System.out.println("-------------------------");
                System.out.println("Elige una opción");
                System.out.println("-------------------------");
                opcion = Teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has escogido Permutar 2 valores");
                        System.out.println("Introduce el valor de a");
                        a = Teclado.nextInt();
                        System.out.println("Introduce el valor de b");
                        b = Teclado.nextInt();

                        aux = a;
                        a = b;
                        b = aux;

                        System.out.println("El valor de a es: " + a);
                        System.out.println("El valor de b es: " + b);
                        System.out.println("************************");
                        break;

                    case 2:
                        System.out.println("Has escogido Sumatorio");

                        System.out.println("Introduce el Valor a");
                        a = Teclado.nextInt();

                        System.out.println("Introduce el valor de b");
                        b = Teclado.nextInt();


                        for (int i = a; i <= b; i++) {

                            suma += i;

                        }
                        System.out.println("El resultado del sumatorio entre " + a + " y " + b + " es: " + suma);
                        break;

                    case 3:

                        System.out.println("Has elegido Máximo y mínimo");

                        while (true) {
                            System.out.println("Introduce un valor (Para terminar teclea 999): ");
                            a = Teclado.nextInt();

                            if (a == 999) {
                                break;
                            }//Fin del IF

                            if (a > numeroMaximo) {
                                numeroMaximo = a;
                            }//Fin del IF

                            if (a < numeroMinimo) {
                                numeroMinimo = a;
                            }//Fin de IF

                        }//Fin del WHILE

                        System.out.println("El valor máximo introducido es: " + numeroMaximo);
                        System.out.println("El valor mínimo introducido es: " + numeroMinimo);
                        break;

                    case 4:
                        System.out.println("Has elegido Números primeros");

                        System.out.println("Introduce un valor: ");
                        a = Teclado.nextInt();

                        for(int i=2; i<=a; i++){
                            int contador=0;
                            for(int j=1; j<=i; j++){
                                if(i%j ==0){
                                    contador++;
                                }//Fin del if
                            }//Fin del for
                            if (contador==2){
                                System.out.print(i + " ");
                            }//Fin del if
                        }//Fin del for
                        break;

                    case 5:
                        System.out.println("El programa ha terminado");
                        break;

                    default:
                        System.out.println("Opción no valida. Introduce un numero del 1 al 5");

                }//Fin del switch


            } while (opcion != 5);

        }//Fin del main
    }//Fin de la clase




