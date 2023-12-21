package ProyectoStarWars;

import java.util.Scanner;
import java.lang.Math;

public class JuegoStarWars {
    public static void main(String [] args){

        System.out.println("⠀⠀⠀⠀ 8888888888   888    88888");
        System.out.println("⠀⠀⠀ 88      88⠀⠀⠀88 88   88⠀ 88");
        System.out.println("⠀⠀ ⠀⠀ 8888  88  88   88  888888");
        System.out.println("⠀ ⠀⠀⠀⠀⠀  88 88 888888888 88   88");
        System.out.println(" ⠀88888888  88 88     88 88    888888");

        System.out.println();

        System.out.println("⠀88⠀⠀⠀88⠀⠀ 88⠀⠀⠀⠀888⠀⠀⠀⠀88888⠀⠀⠀⠀888888");
        System.out.println("⠀88⠀⠀⠀88⠀⠀ 88⠀⠀⠀88⠀88⠀⠀⠀88  88  88");
        System.out.println("⠀88⠀⠀8888⠀ 88⠀⠀88⠀⠀ 88  88888    8888");
        System.out.println("⠀⠀⠀888  888   888888888 88   88     88");
        System.out.println("⠀   88  88    88     88 88    8888888");
        System.out.println();
        System.out.println("========STAR WARS: CÓDIGOS SECRETOS========");
        System.out.println();
        System.out.println("                                 /~\\");
        System.out.println("                                |oo  )");
        System.out.println("                               __\\=/__");
        System.out.println("           _____             /    _    \\\\");
        System.out.println("         /   ()  \\          // | / \\   |\\\\");
        System.out.println("       _|_________|_        \\\\   \\_/     ||");
        System.out.println("      | |    ===  | |        \\ |\\  /   | ||");
        System.out.println("      |_|     0   |_|         # ___ ___/  #");
        System.out.println("       ||     *   ||           |   |   |");
        System.out.println("       ||_________||           |   |   |");
        System.out.println("      |~   \\___/   ~|          []  |  []");
        System.out.println("      /=\\   /=\\  /=\\           |   |   |");
        System.out.println("_____[__]_ [__]__[__]________/___]___[___\\________");
        System.out.println();


        String Txt1="Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n" +
                "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
                "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
                "está construyendo para destruirla. (Presiona Intro para continuar)";

        System.out.println(Txt1);
        Scanner Teclado=new Scanner(System.in);
        String respuesta=Teclado.nextLine();

        if(respuesta.isBlank()){
            // Para Iniciar el juego he utilizado este método de clase String. De esta manera se comprueba si la cadena respuesta está vacía o contiene espacios en blanco. Si está en blanco el resultado es True y se ejecuta el bloque If. Si es False se omite el bloque If y pasa al bloque else.

            System.out.println("Nivel 1");

            int s1=0, s2=0,sumaPc=0,P1=0, P2=0,ProductorioPc=1,factorialPc=1, redondeo=0,P=0,M=0,S=0,factorial1=1,factorial2=1;
            double n=1;
            int resultado=0; // En este lugar inicializo todas las variables del juego.

            s1=(int)(1+Math.random()*(10 -1 +1));
            s2=(int)(20+Math.random()*(30 -20 +1));
            P1=(int)(1+Math.random()*(7 -1 +1));
            P2=(int)(8+Math.random()*(12 -8 +1));
            n=50+Math.random()*(100-50+1);
            redondeo=(int)Math.floor(n/10);
            P=(int)(10+Math.random()*(100 -10 +1));
            M=(int)(5+Math.random()*(10 -5 +1));
            S=(int)(5+Math.random()*(10 -5 +1));
            //Aquí he realizado todos los cálculos de los números aleatorios del juego.

            String Txt2="Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al \n" +
            "sistema " + s1 + " en el sector " + s2 + ",pero el sistema de navegación está estropeado y el \n" +
            "computador tiene problemas para calcular parte de las coordenadas de salto. Chewbacca,\n" +
            "piloto experto, se da cuenta que falta el cuarto número de la serie.\n" +
            "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n" +
            "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" +
            "¿Qué debe introducir?";

            System.out.println(Txt2);
            //En el print del String primero he creado un String y lo he concatenado con las variables del primer juego, de esta manera los números aleatorios forman parte del enunciado del juego.
            //Aunque podría haber introducido directamente el texto dentro del print y concatenar a la vez, he preferido realizarlo en dos pasos diferentes. Y luego vincular el String txt con el print.

            // Se realiza el primer juego con un bucle for. Se inicializa la variable i con el valor de s1, luego antes de cada vuelta se comprueba si la i es menor o igual que s2.
            //Dentro del bucle se suma el valor de i a la variable sumaPc y después de cada vuelta el valor de i incrementa en 1 y este bucle finaliza cuando i sea mayor que s2.
            for(int i=s1; i<=s2; i++){

                sumaPc += i;
            }
            System.out.println(sumaPc);
            System.out.println("Introduce el resultado");
            resultado=Teclado.nextInt();

            //En este condicional si el resultado introducido por el usuario y el resultado calculado por la máquina es el mismo, entonces se pasa al siguiente nivel. En caso contrario saldrá del juego.
            if (sumaPc==resultado){

                System.out.println("Nivel 2");
                System.out.println();//He dejado print en blanco para dejar espacio entre el titulo de Nivel y el enunciado del juego.

                String Txt3= "Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n" +
                "de la muerte. Como van en una nave imperial robada se aproximan lentamente con \n" +
                "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí \n" +
                "agente de espaciopuerto " + P1 + " contactando con nave imperial " + P2 + ". No están destinados \n" +
                "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh… \n" +
                "tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para \n" +
                "atracar y reparar la nave”. El agente, que no se anda con tonterías, responde \n" +
                " - Proporcione código de acceso o abriremos fuego -. Han Solo ojea rápidamente el \n" +
                "manual del piloto que estaba en la guantera y da con la página correcta. El código \n" +
                "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                "¿Cuál es el código?";

                System.out.println(Txt3);

                //En el segundo nivel también he utilizado el bucle for. El funcionamiento de este bucle en este caso es el siguiente: Se inicia la variable i con el valor de P1, que es la condición inicial del bucle.
                //Antes de cada vuelta se comprueba si la variable i es menor o igual que la variable P2. Dentro del bucle se multiplica el valor de la variable i por la variable productorioPc
                //Y eso pasa por cada vuelta que hace el bucle. Por cada vuelta que da, se incremente el valor de i en 1. Se vuelve a la condición y se repite hasta que i sea mayor que P2.
                //Al final del bucle la variable productorioPc nos dará el resultado del productorio entre la variable P1 y la variable P2.
                for(int i=P1; i<=P2; i++){

                    ProductorioPc*=i;
                }
                System.out.println(ProductorioPc);
                System.out.println("Introduce tu respuesta");
                resultado=Teclado.nextInt();

                //Con este condicional pretendo igualar los resultados. Si ProductorioPc es igual al resultado introducido por el usuario entonces se pasa al siguiente nivel. De lo contrario nos sacará del juego.
                if (ProductorioPc==resultado){

                    System.out.println("Nivel 3");
                    System.out.println();

                    String Txt4="Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n" +
                            "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n" +
                            "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " + redondeo + " existentes se\n" +
                            "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n" +
                            "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n" +
                            "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n" +
                            "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n" +
                            "(redondeando N hacia abajo), donde N es el nº de niveles”.\n" +
                            "¿Cual es el nivel correcto?";

                    System.out.println(Txt4);

                    //Para el nivel 3 también he utilizado el bucle for. Para este ejercicio he necesitado utilizar la función Math.floor (Es la encargada de redondear, un número dado, hacia abajo).
                    //El principio del bucle se inicializa con la variable i con el valor de 1. Su condición es que hay que comprobar que la i es menor o igual al numero obtenido como redondeo.
                    // ""El número redondeo se consigue primero con la función Math.random para conseguir el numero aleatorio y ese valor luego se introduce en la función Math.floor, que es la variable redondeo.
                    //Una vez dentro del bucle, se multiplica el valor de i por la variable factorialPc y se repite cada vuelta del bucle. Por cada vuelta del bucle incrementa el valor de i en 1 y se repite el
                    //proceso hasta que i sea mayor que redondeo.
                    for(int i=1;i<=redondeo;i++){

                        factorialPc*=i;
                    }
                    System.out.println(factorialPc);
                    System.out.println("Introduce tu respuesta");
                    resultado=Teclado.nextInt();

                    //Con este condicional vuelvo a igualar resultados, es decir si el resultado calculado por la máquina es el mismo resultado que el introducido por el usuario se pasa al siguiente nivel. En caso contrario se sale del juego con el bloque else.
                    if (factorialPc==resultado){

                        System.out.println("Nivel 4");
                        System.out.println();

                        String Txt5 ="Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n" +
                                "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n" +
                                "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n" +
                                "verificar si el número " + P + " es primo o no. Si es primo introduce un 1, si no lo es\n" +
                                "introduce un 0.";

                        System.out.println(Txt5);
                        System.out.println();
                        System.out.println("El numero es: " + P);

                        boolean primo=true;
                        //He creado una variable booleana que es la que me permitirá dentro del bucle saber si la variable primo es veradera o falsa.

                        //Comienza el bucle for inicializando la variable i con el valor 2. Luego la condición es comprobar que la variable i es menor que la variable P.
                        //Luego se verifica mediante la condición if de que P es divisible. Si es divisible asigna false a la variable primo. Por cada vuelta que el bucle
                        // se incrementa el valor de i en 1. Vuelve a la condición y se repite el bucle hasta que i sea igual a P. Por ultimo si la variable primo es verdadera
                        // es porque P es un número primo, de lo contrario no es primo.
                        for(int i=2;i<=P;i++){

                            if(P%2==0){
                                primo= false;
                            }
                        }//Fin del For

                        System.out.println("Es primo?: " +(primo ? "1" : "0"));//En este print se imprime el número P, si el numero es primo aparecerá un 1, si no lo es aparecerá un 0.
                        System.out.println("Introduce tu respuesta.");
                        resultado=Teclado.nextInt();

                        int respuestaAcertada = primo ?1:0; //Aqui estoy asignando un valor a la variable respuestaAcertada utilizando un operador temario.
                        //Si primo es verdadero la variable respuestaAcertada se establece en 1 y si es falsa se establece en 0.

                        //En esta condición se igualan resultados de nuevo. Si el resultado introducido por el usuario es el mismo que respuestaAcertada se pasa al siguiente nivel. Si no se sale del juego.
                        if(resultado == respuestaAcertada){

                            System.out.println("Nivel 5");
                            System.out.println();

                            String Txt6="Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n" +
                                    "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n" +
                                    "explote en exactamente " + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar\n" +
                                    "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n" +
                                    "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n" +
                                    "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n" +
                                    "el factorial de M y el factorial de S. ¿Qué valor debe introducir?";

                            System.out.println(Txt6);
                            System.out.println();

                            //Para el ultimo nivel he utilizado tambien el bucle for.Se inicializa el bucle con la variable i dandole el valor 1. Antes de cada vuelta
                            //comprueba que la i es menor o igual a la variable M. Luego se multiplica el valor de i por la variable factorial1 y se repite en cada vuelta del bucle
                            //Por cada vuelta que da el bucle se incremente el valor de i en 1. Luego se vuelve a la condición y se repite el bucle hasta que i sea igual a la varible M.
                            for (int i=1; i<=M;i++){

                                factorial1*=i;
                            }

                            System.out.println("El factorial de " + M + " es: " + factorial1);

                            //Se inicializa el bucle con la variable i dandole el valor 1. Antes de cada vuelta
                            //comprueba que la i es menor o igual a la variable S. Luego se multiplica el valor de i por la variable factorial1 y se repite en cada vuelta del bucle
                            //Por cada vuelta que da el bucle se incremente el valor de i en 1. Luego se vuelve a la condición y se repite el bucle hasta que i sea igual a la varible S.
                            for (int i=1;i<=S;i++){

                                factorial2*=i;
                            }
                            System.out.println("El factorial de " + S + " es: " + factorial2);

                            int factorialTotal= factorial1 + factorial2; //Por ultimo he creado la variable factorialTotal que es la suma de ambos factoriales.

                            System.out.println("El factorial total es: " + factorialTotal);
                            System.out.println("Introduce tu respuesta");
                            resultado= Teclado.nextInt();

                            //Con esta última condición igualo los resultados. Si factorialTotal es igual al resultado introducido por el usuario se pasa a leer
                            //la historia final del juego y éste termina con un gracias por jugar y el dibujo de Twenty Century Fox.
                            if (factorialTotal == resultado){

                                String Txt7="Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n" +
                                        "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n" +
                                        "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n" +
                                        "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n" +
                                        "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n" +
                                        "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n" +
                                        "imperio.\n" +
                                        "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D";

                                System.out.println(Txt7);

                                System.out.println("Gracias por jugar :D");
                                System.out.println(" .............                                      .............");
                                System.out.println("  ............                                      ............");
                                System.out.println("   ...........                                      ...........");
                                System.out.println("    ..........           @@@@@    @@@@@             ..........");
                                System.out.println("     .........          @     @  @     @            .........");
                                System.out.println("      ........             @@@   @     @            ........");
                                System.out.println("       .......           @@      @     @            .......");
                                System.out.println("        ......           @@@@@@@  @@@@@  th         ......");
                                System.out.println("         .....        ---------------------         .....");
                                System.out.println("          ....            C E N T U R Y             ....");
                                System.out.println("           ...        _____________________         ...");
                                System.out.println("            ..         @@@@@ @@@@@@ @@   @@         ..");
                                System.out.println("            ==         @     @    @   @ @           ==");
                                System.out.println("          __||__       @@@   @    @    @          __||__");
                                System.out.println("         |      |      @     @    @   @  @       |      |");
                                System.out.println("_________|      |_____ @     @@@@@@ @@    @@_____|      |________");

                            }else{
                                System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                                    "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");//Juego5. Aparece el mensaje si el resultado introducido en el juego 5 no es correcto.
                            }
                        }else{
                            System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                                "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");//Juego4. Aparece el mensaje si el resultado introducido en el juego 4 no es correcto.
                        }
                    }
                    else{
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                                "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");//Juego3. Aparece el mensaje si el resultado introducido en el juego 3 no es correcto.
                    }
                }
                else {
                    System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                            "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");//Juego2. Aparece el mensaje si el resultado introducido en el juego 2 no es correcto.
                }
            }
            else {
                System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
                        "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");//Juego1. Aparece el mensaje si el resultado introducido en el juego 1 no es correcto.
            }
        }else
            System.out.println("Acción incorrecta.");//Este else solo imprime este mensaje en el caso de que para entrar al juego se teclee otra tecla/condición que no sea intro.
    }//Fin del main
}//Fin del class


